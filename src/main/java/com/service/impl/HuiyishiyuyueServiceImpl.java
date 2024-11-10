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


import com.dao.HuiyishiyuyueDao;
import com.entity.HuiyishiyuyueEntity;
import com.service.HuiyishiyuyueService;
import com.entity.vo.HuiyishiyuyueVO;
import com.entity.view.HuiyishiyuyueView;

@Service("huiyishiyuyueService")
public class HuiyishiyuyueServiceImpl extends ServiceImpl<HuiyishiyuyueDao, HuiyishiyuyueEntity> implements HuiyishiyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyishiyuyueEntity> page = this.selectPage(
                new Query<HuiyishiyuyueEntity>(params).getPage(),
                new EntityWrapper<HuiyishiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyishiyuyueEntity> wrapper) {
		  Page<HuiyishiyuyueView> page =new Query<HuiyishiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyishiyuyueVO> selectListVO(Wrapper<HuiyishiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyishiyuyueVO selectVO(Wrapper<HuiyishiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyishiyuyueView> selectListView(Wrapper<HuiyishiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyishiyuyueView selectView(Wrapper<HuiyishiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
