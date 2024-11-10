package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuiyishiDao;
import com.entity.HuiyishiEntity;
import com.service.HuiyishiService;
import com.entity.vo.HuiyishiVO;
import com.entity.view.HuiyishiView;

@Service("huiyishiService")
public class HuiyishiServiceImpl extends ServiceImpl<HuiyishiDao, HuiyishiEntity> implements HuiyishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyishiEntity> page = this.selectPage(
                new Query<HuiyishiEntity>(params).getPage(),
                new EntityWrapper<HuiyishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyishiEntity> wrapper) {
		  Page<HuiyishiView> page =new Query<HuiyishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyishiVO> selectListVO(Wrapper<HuiyishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyishiVO selectVO(Wrapper<HuiyishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyishiView> selectListView(Wrapper<HuiyishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyishiView selectView(Wrapper<HuiyishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
