package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeixinxiView;


/**
 * 设备信息
 *
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public interface ShebeixinxiService extends IService<ShebeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeixinxiVO> selectListVO(Wrapper<ShebeixinxiEntity> wrapper);
   	
   	ShebeixinxiVO selectVO(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
   	
   	List<ShebeixinxiView> selectListView(Wrapper<ShebeixinxiEntity> wrapper);
   	
   	ShebeixinxiView selectView(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeixinxiEntity> wrapper);
   	

}

