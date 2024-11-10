package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyongjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyongjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyongjiluView;


/**
 * 使用记录
 *
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public interface ShiyongjiluService extends IService<ShiyongjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyongjiluVO> selectListVO(Wrapper<ShiyongjiluEntity> wrapper);
   	
   	ShiyongjiluVO selectVO(@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);
   	
   	List<ShiyongjiluView> selectListView(Wrapper<ShiyongjiluEntity> wrapper);
   	
   	ShiyongjiluView selectView(@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyongjiluEntity> wrapper);
   	

}

