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


import com.dao.ShiyongjiluDao;
import com.entity.ShiyongjiluEntity;
import com.service.ShiyongjiluService;
import com.entity.vo.ShiyongjiluVO;
import com.entity.view.ShiyongjiluView;

@Service("shiyongjiluService")
public class ShiyongjiluServiceImpl extends ServiceImpl<ShiyongjiluDao, ShiyongjiluEntity> implements ShiyongjiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyongjiluEntity> page = this.selectPage(
                new Query<ShiyongjiluEntity>(params).getPage(),
                new EntityWrapper<ShiyongjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyongjiluEntity> wrapper) {
		  Page<ShiyongjiluView> page =new Query<ShiyongjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyongjiluVO> selectListVO(Wrapper<ShiyongjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyongjiluVO selectVO(Wrapper<ShiyongjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyongjiluView> selectListView(Wrapper<ShiyongjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyongjiluView selectView(Wrapper<ShiyongjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
