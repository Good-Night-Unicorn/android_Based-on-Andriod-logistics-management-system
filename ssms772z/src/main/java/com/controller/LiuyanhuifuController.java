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

import com.entity.LiuyanhuifuEntity;
import com.entity.view.LiuyanhuifuView;

import com.service.LiuyanhuifuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 留言回复
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
@RestController
@RequestMapping("/liuyanhuifu")
public class LiuyanhuifuController {
    @Autowired
    private LiuyanhuifuService liuyanhuifuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LiuyanhuifuEntity liuyanhuifu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			liuyanhuifu.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			liuyanhuifu.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LiuyanhuifuEntity> ew = new EntityWrapper<LiuyanhuifuEntity>();
		PageUtils page = liuyanhuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liuyanhuifu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LiuyanhuifuEntity liuyanhuifu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			liuyanhuifu.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			liuyanhuifu.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LiuyanhuifuEntity> ew = new EntityWrapper<LiuyanhuifuEntity>();
		PageUtils page = liuyanhuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liuyanhuifu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LiuyanhuifuEntity liuyanhuifu){
       	EntityWrapper<LiuyanhuifuEntity> ew = new EntityWrapper<LiuyanhuifuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( liuyanhuifu, "liuyanhuifu")); 
        return R.ok().put("data", liuyanhuifuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LiuyanhuifuEntity liuyanhuifu){
        EntityWrapper< LiuyanhuifuEntity> ew = new EntityWrapper< LiuyanhuifuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( liuyanhuifu, "liuyanhuifu")); 
		LiuyanhuifuView liuyanhuifuView =  liuyanhuifuService.selectView(ew);
		return R.ok("查询留言回复成功").put("data", liuyanhuifuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LiuyanhuifuEntity liuyanhuifu = liuyanhuifuService.selectById(id);
        return R.ok().put("data", liuyanhuifu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LiuyanhuifuEntity liuyanhuifu = liuyanhuifuService.selectById(id);
        return R.ok().put("data", liuyanhuifu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LiuyanhuifuEntity liuyanhuifu, HttpServletRequest request){
    	liuyanhuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liuyanhuifu);

        liuyanhuifuService.insert(liuyanhuifu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LiuyanhuifuEntity liuyanhuifu, HttpServletRequest request){
    	liuyanhuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liuyanhuifu);
    	liuyanhuifu.setUserid((Long)request.getSession().getAttribute("userId"));

        liuyanhuifuService.insert(liuyanhuifu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LiuyanhuifuEntity liuyanhuifu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(liuyanhuifu);
        liuyanhuifuService.updateById(liuyanhuifu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        liuyanhuifuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<LiuyanhuifuEntity> wrapper = new EntityWrapper<LiuyanhuifuEntity>();
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

		int count = liuyanhuifuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
