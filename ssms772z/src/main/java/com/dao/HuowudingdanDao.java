package com.dao;

import com.entity.HuowudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowudingdanVO;
import com.entity.view.HuowudingdanView;


/**
 * 货物订单
 * 
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
public interface HuowudingdanDao extends BaseMapper<HuowudingdanEntity> {
	
	List<HuowudingdanVO> selectListVO(@Param("ew") Wrapper<HuowudingdanEntity> wrapper);
	
	HuowudingdanVO selectVO(@Param("ew") Wrapper<HuowudingdanEntity> wrapper);
	
	List<HuowudingdanView> selectListView(@Param("ew") Wrapper<HuowudingdanEntity> wrapper);

	List<HuowudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<HuowudingdanEntity> wrapper);
	
	HuowudingdanView selectView(@Param("ew") Wrapper<HuowudingdanEntity> wrapper);
	

}
