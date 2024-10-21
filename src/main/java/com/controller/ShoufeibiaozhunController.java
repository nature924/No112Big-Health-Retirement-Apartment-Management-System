package com.controller;

import java.math.BigDecimal;
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

import com.entity.ShoufeibiaozhunEntity;
import com.entity.view.ShoufeibiaozhunView;

import com.service.ShoufeibiaozhunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 收费标准
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
@RestController
@RequestMapping("/shoufeibiaozhun")
public class ShoufeibiaozhunController {
    @Autowired
    private ShoufeibiaozhunService shoufeibiaozhunService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShoufeibiaozhunEntity shoufeibiaozhun,
		HttpServletRequest request){
        EntityWrapper<ShoufeibiaozhunEntity> ew = new EntityWrapper<ShoufeibiaozhunEntity>();

		PageUtils page = shoufeibiaozhunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoufeibiaozhun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShoufeibiaozhunEntity shoufeibiaozhun, 
		HttpServletRequest request){
        EntityWrapper<ShoufeibiaozhunEntity> ew = new EntityWrapper<ShoufeibiaozhunEntity>();

		PageUtils page = shoufeibiaozhunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoufeibiaozhun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShoufeibiaozhunEntity shoufeibiaozhun){
       	EntityWrapper<ShoufeibiaozhunEntity> ew = new EntityWrapper<ShoufeibiaozhunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shoufeibiaozhun, "shoufeibiaozhun")); 
        return R.ok().put("data", shoufeibiaozhunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShoufeibiaozhunEntity shoufeibiaozhun){
        EntityWrapper< ShoufeibiaozhunEntity> ew = new EntityWrapper< ShoufeibiaozhunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shoufeibiaozhun, "shoufeibiaozhun")); 
		ShoufeibiaozhunView shoufeibiaozhunView =  shoufeibiaozhunService.selectView(ew);
		return R.ok("查询收费标准成功").put("data", shoufeibiaozhunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShoufeibiaozhunEntity shoufeibiaozhun = shoufeibiaozhunService.selectById(id);
        return R.ok().put("data", shoufeibiaozhun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShoufeibiaozhunEntity shoufeibiaozhun = shoufeibiaozhunService.selectById(id);
        return R.ok().put("data", shoufeibiaozhun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShoufeibiaozhunEntity shoufeibiaozhun, HttpServletRequest request){
    	shoufeibiaozhun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shoufeibiaozhun);
        shoufeibiaozhunService.insert(shoufeibiaozhun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShoufeibiaozhunEntity shoufeibiaozhun, HttpServletRequest request){
    	shoufeibiaozhun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shoufeibiaozhun);
        shoufeibiaozhunService.insert(shoufeibiaozhun);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShoufeibiaozhunEntity shoufeibiaozhun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shoufeibiaozhun);
        shoufeibiaozhunService.updateById(shoufeibiaozhun);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shoufeibiaozhunService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShoufeibiaozhunEntity> wrapper = new EntityWrapper<ShoufeibiaozhunEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shoufeibiaozhunService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
