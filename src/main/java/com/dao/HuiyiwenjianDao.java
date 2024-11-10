package com.dao;

import com.entity.HuiyiwenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyiwenjianVO;
import com.entity.view.HuiyiwenjianView;


/**
 * 会议文件
 * 
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public interface HuiyiwenjianDao extends BaseMapper<HuiyiwenjianEntity> {
	
	List<HuiyiwenjianVO> selectListVO(@Param("ew") Wrapper<HuiyiwenjianEntity> wrapper);
	
	HuiyiwenjianVO selectVO(@Param("ew") Wrapper<HuiyiwenjianEntity> wrapper);
	
	List<HuiyiwenjianView> selectListView(@Param("ew") Wrapper<HuiyiwenjianEntity> wrapper);

	List<HuiyiwenjianView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyiwenjianEntity> wrapper);
	
	HuiyiwenjianView selectView(@Param("ew") Wrapper<HuiyiwenjianEntity> wrapper);
	

}
