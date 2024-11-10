package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyiwenjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyiwenjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyiwenjianView;


/**
 * 会议文件
 *
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public interface HuiyiwenjianService extends IService<HuiyiwenjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyiwenjianVO> selectListVO(Wrapper<HuiyiwenjianEntity> wrapper);
   	
   	HuiyiwenjianVO selectVO(@Param("ew") Wrapper<HuiyiwenjianEntity> wrapper);
   	
   	List<HuiyiwenjianView> selectListView(Wrapper<HuiyiwenjianEntity> wrapper);
   	
   	HuiyiwenjianView selectView(@Param("ew") Wrapper<HuiyiwenjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyiwenjianEntity> wrapper);
   	

}

