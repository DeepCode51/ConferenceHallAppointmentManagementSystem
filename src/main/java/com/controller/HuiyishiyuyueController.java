package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuiyishiyuyueEntity;
import com.entity.view.HuiyishiyuyueView;

import com.service.HuiyishiyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 会议室预约
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
@RestController
@RequestMapping("/huiyishiyuyue")
public class HuiyishiyuyueController {
    @Autowired
    private HuiyishiyuyueService huiyishiyuyueService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuiyishiyuyueEntity huiyishiyuyue, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			huiyishiyuyue.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuiyishiyuyueEntity> ew = new EntityWrapper<HuiyishiyuyueEntity>();
		PageUtils page = huiyishiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyishiyuyue), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuiyishiyuyueEntity huiyishiyuyue, 
		HttpServletRequest request){
        EntityWrapper<HuiyishiyuyueEntity> ew = new EntityWrapper<HuiyishiyuyueEntity>();
		PageUtils page = huiyishiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyishiyuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuiyishiyuyueEntity huiyishiyuyue){
       	EntityWrapper<HuiyishiyuyueEntity> ew = new EntityWrapper<HuiyishiyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huiyishiyuyue, "huiyishiyuyue")); 
        return R.ok().put("data", huiyishiyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuiyishiyuyueEntity huiyishiyuyue){
        EntityWrapper< HuiyishiyuyueEntity> ew = new EntityWrapper< HuiyishiyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huiyishiyuyue, "huiyishiyuyue")); 
		HuiyishiyuyueView huiyishiyuyueView =  huiyishiyuyueService.selectView(ew);
		return R.ok("查询会议室预约成功").put("data", huiyishiyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuiyishiyuyueEntity huiyishiyuyue = huiyishiyuyueService.selectById(id);
        return R.ok().put("data", huiyishiyuyue);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuiyishiyuyueEntity huiyishiyuyue = huiyishiyuyueService.selectById(id);
        return R.ok().put("data", huiyishiyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuiyishiyuyueEntity huiyishiyuyue, HttpServletRequest request){
    	huiyishiyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyishiyuyue);

        huiyishiyuyueService.insert(huiyishiyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuiyishiyuyueEntity huiyishiyuyue, HttpServletRequest request){
    	huiyishiyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyishiyuyue);

        huiyishiyuyueService.insert(huiyishiyuyue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuiyishiyuyueEntity huiyishiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huiyishiyuyue);
        huiyishiyuyueService.updateById(huiyishiyuyue);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huiyishiyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HuiyishiyuyueEntity> wrapper = new EntityWrapper<HuiyishiyuyueEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = huiyishiyuyueService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
