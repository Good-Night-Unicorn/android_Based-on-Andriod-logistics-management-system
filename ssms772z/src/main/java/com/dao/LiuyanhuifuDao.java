package com.dao;

import com.entity.LiuyanhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiuyanhuifuVO;
import com.entity.view.LiuyanhuifuView;


/**
 * 留言回复
 * 
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
public interface LiuyanhuifuDao extends BaseMapper<LiuyanhuifuEntity> {
	
	List<LiuyanhuifuVO> selectListVO(@Param("ew") Wrapper<LiuyanhuifuEntity> wrapper);
	
	LiuyanhuifuVO selectVO(@Param("ew") Wrapper<LiuyanhuifuEntity> wrapper);
	
	List<LiuyanhuifuView> selectListView(@Param("ew") Wrapper<LiuyanhuifuEntity> wrapper);

	List<LiuyanhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<LiuyanhuifuEntity> wrapper);
	
	LiuyanhuifuView selectView(@Param("ew") Wrapper<LiuyanhuifuEntity> wrapper);
	

}
