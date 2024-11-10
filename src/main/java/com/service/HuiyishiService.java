package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyishiView;


/**
 * 会议室
 *
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public interface HuiyishiService extends IService<HuiyishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyishiVO> selectListVO(Wrapper<HuiyishiEntity> wrapper);
   	
   	HuiyishiVO selectVO(@Param("ew") Wrapper<HuiyishiEntity> wrapper);
   	
   	List<HuiyishiView> selectListView(Wrapper<HuiyishiEntity> wrapper);
   	
   	HuiyishiView selectView(@Param("ew") Wrapper<HuiyishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyishiEntity> wrapper);
   	

}

