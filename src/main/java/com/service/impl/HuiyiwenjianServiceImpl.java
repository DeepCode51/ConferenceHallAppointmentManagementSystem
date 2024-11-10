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


import com.dao.HuiyiwenjianDao;
import com.entity.HuiyiwenjianEntity;
import com.service.HuiyiwenjianService;
import com.entity.vo.HuiyiwenjianVO;
import com.entity.view.HuiyiwenjianView;

@Service("huiyiwenjianService")
public class HuiyiwenjianServiceImpl extends ServiceImpl<HuiyiwenjianDao, HuiyiwenjianEntity> implements HuiyiwenjianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyiwenjianEntity> page = this.selectPage(
                new Query<HuiyiwenjianEntity>(params).getPage(),
                new EntityWrapper<HuiyiwenjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyiwenjianEntity> wrapper) {
		  Page<HuiyiwenjianView> page =new Query<HuiyiwenjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyiwenjianVO> selectListVO(Wrapper<HuiyiwenjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyiwenjianVO selectVO(Wrapper<HuiyiwenjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyiwenjianView> selectListView(Wrapper<HuiyiwenjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyiwenjianView selectView(Wrapper<HuiyiwenjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
