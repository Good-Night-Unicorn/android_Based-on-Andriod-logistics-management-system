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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuowudingdanEntity;
import com.entity.view.HuowudingdanView;

import com.service.HuowudingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 货物订单
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
@RestController
@RequestMapping("/huowudingdan")
public class HuowudingdanController {
    @Autowired
    private HuowudingdanService huowudingdanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuowudingdanEntity huowudingdan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			huowudingdan.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuowudingdanEntity> ew = new EntityWrapper<HuowudingdanEntity>();
		PageUtils page = huowudingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huowudingdan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuowudingdanEntity huowudingdan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			huowudingdan.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuowudingdanEntity> ew = new EntityWrapper<HuowudingdanEntity>();
		PageUtils page = huowudingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huowudingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuowudingdanEntity huowudingdan){
       	EntityWrapper<HuowudingdanEntity> ew = new EntityWrapper<HuowudingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huowudingdan, "huowudingdan")); 
        return R.ok().put("data", huowudingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuowudingdanEntity huowudingdan){
        EntityWrapper< HuowudingdanEntity> ew = new EntityWrapper< HuowudingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huowudingdan, "huowudingdan")); 
		HuowudingdanView huowudingdanView =  huowudingdanService.selectView(ew);
		return R.ok("查询货物订单成功").put("data", huowudingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuowudingdanEntity huowudingdan = huowudingdanService.selectById(id);
        return R.ok().put("data", huowudingdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuowudingdanEntity huowudingdan = huowudingdanService.selectById(id);
        return R.ok().put("data", huowudingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuowudingdanEntity huowudingdan, HttpServletRequest request){
    	huowudingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huowudingdan);

        huowudingdanService.insert(huowudingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuowudingdanEntity huowudingdan, HttpServletRequest request){
    	huowudingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huowudingdan);
    	huowudingdan.setUserid((Long)request.getSession().getAttribute("userId"));

        huowudingdanService.insert(huowudingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuowudingdanEntity huowudingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huowudingdan);
        huowudingdanService.updateById(huowudingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huowudingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuowudingdanEntity> wrapper = new EntityWrapper<HuowudingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			wrapper.eq("kehuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = huowudingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
