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


import com.dao.ShebeixinxiDao;
import com.entity.ShebeixinxiEntity;
import com.service.ShebeixinxiService;
import com.entity.vo.ShebeixinxiVO;
import com.entity.view.ShebeixinxiView;

@Service("shebeixinxiService")
public class ShebeixinxiServiceImpl extends ServiceImpl<ShebeixinxiDao, ShebeixinxiEntity> implements ShebeixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeixinxiEntity> page = this.selectPage(
                new Query<ShebeixinxiEntity>(params).getPage(),
                new EntityWrapper<ShebeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeixinxiEntity> wrapper) {
		  Page<ShebeixinxiView> page =new Query<ShebeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeixinxiVO> selectListVO(Wrapper<ShebeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeixinxiVO selectVO(Wrapper<ShebeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeixinxiView> selectListView(Wrapper<ShebeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeixinxiView selectView(Wrapper<ShebeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
