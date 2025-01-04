package com.dao;

import com.entity.LiuyanfankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuyanfankuiVO;
import com.entity.view.LiuyanfankuiView;


/**
 * 留言反馈
 * 
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
public interface LiuyanfankuiDao extends BaseMapper<LiuyanfankuiEntity> {
	
	List<LiuyanfankuiVO> selectListVO(@Param("ew") Wrapper<LiuyanfankuiEntity> wrapper);
	
	LiuyanfankuiVO selectVO(@Param("ew") Wrapper<LiuyanfankuiEntity> wrapper);
	
	List<LiuyanfankuiView> selectListView(@Param("ew") Wrapper<LiuyanfankuiEntity> wrapper);

	List<LiuyanfankuiView> selectListView(Pagination page,@Param("ew") Wrapper<LiuyanfankuiEntity> wrapper);
	
	LiuyanfankuiView selectView(@Param("ew") Wrapper<LiuyanfankuiEntity> wrapper);
	

}
