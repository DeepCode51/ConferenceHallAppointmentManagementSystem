package com.dao;

import com.entity.HuiyishiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyishiyuyueVO;
import com.entity.view.HuiyishiyuyueView;


/**
 * 会议室预约
 * 
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public interface HuiyishiyuyueDao extends BaseMapper<HuiyishiyuyueEntity> {
	
	List<HuiyishiyuyueVO> selectListVO(@Param("ew") Wrapper<HuiyishiyuyueEntity> wrapper);
	
	HuiyishiyuyueVO selectVO(@Param("ew") Wrapper<HuiyishiyuyueEntity> wrapper);
	
	List<HuiyishiyuyueView> selectListView(@Param("ew") Wrapper<HuiyishiyuyueEntity> wrapper);

	List<HuiyishiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyishiyuyueEntity> wrapper);
	
	HuiyishiyuyueView selectView(@Param("ew") Wrapper<HuiyishiyuyueEntity> wrapper);
	

}
