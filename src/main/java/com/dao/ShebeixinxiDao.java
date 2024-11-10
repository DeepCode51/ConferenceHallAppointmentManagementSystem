package com.dao;

import com.entity.ShebeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeixinxiVO;
import com.entity.view.ShebeixinxiView;


/**
 * 设备信息
 * 
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public interface ShebeixinxiDao extends BaseMapper<ShebeixinxiEntity> {
	
	List<ShebeixinxiVO> selectListVO(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
	
	ShebeixinxiVO selectVO(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
	
	List<ShebeixinxiView> selectListView(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);

	List<ShebeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
	
	ShebeixinxiView selectView(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
	

}
