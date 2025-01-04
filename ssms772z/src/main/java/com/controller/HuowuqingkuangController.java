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

import com.entity.HuowuqingkuangEntity;
import com.entity.view.HuowuqingkuangView;

import com.service.HuowuqingkuangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 货物情况
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
@RestController
@RequestMapping("/huowuqingkuang")
public class HuowuqingkuangController {
    @Autowired
    private HuowuqingkuangService huowuqingkuangService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuowuqingkuangEntity huowuqingkuang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			huowuqingkuang.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			huowuqingkuang.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuowuqingkuangEntity> ew = new EntityWrapper<HuowuqingkuangEntity>();
		PageUtils page = huowuqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huowuqingkuang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuowuqingkuangEntity huowuqingkuang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			huowuqingkuang.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			huowuqingkuang.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuowuqingkuangEntity> ew = new EntityWrapper<HuowuqingkuangEntity>();
		PageUtils page = huowuqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huowuqingkuang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuowuqingkuangEntity huowuqingkuang){
       	EntityWrapper<HuowuqingkuangEntity> ew = new EntityWrapper<HuowuqingkuangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huowuqingkuang, "huowuqingkuang")); 
        return R.ok().put("data", huowuqingkuangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuowuqingkuangEntity huowuqingkuang){
        EntityWrapper< HuowuqingkuangEntity> ew = new EntityWrapper< HuowuqingkuangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huowuqingkuang, "huowuqingkuang")); 
		HuowuqingkuangView huowuqingkuangView =  huowuqingkuangService.selectView(ew);
		return R.ok("查询货物情况成功").put("data", huowuqingkuangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuowuqingkuangEntity huowuqingkuang = huowuqingkuangService.selectById(id);
        return R.ok().put("data", huowuqingkuang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuowuqingkuangEntity huowuqingkuang = huowuqingkuangService.selectById(id);
        return R.ok().put("data", huowuqingkuang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuowuqingkuangEntity huowuqingkuang, HttpServletRequest request){
    	huowuqingkuang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huowuqingkuang);

        huowuqingkuangService.insert(huowuqingkuang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuowuqingkuangEntity huowuqingkuang, HttpServletRequest request){
    	huowuqingkuang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huowuqingkuang);
    	huowuqingkuang.setUserid((Long)request.getSession().getAttribute("userId"));

        huowuqingkuangService.insert(huowuqingkuang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuowuqingkuangEntity huowuqingkuang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huowuqingkuang);
        huowuqingkuangService.updateById(huowuqingkuang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huowuqingkuangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuowuqingkuangEntity> wrapper = new EntityWrapper<HuowuqingkuangEntity>();
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
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = huowuqingkuangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
