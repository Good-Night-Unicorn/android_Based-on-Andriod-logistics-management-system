package com.dao;

import com.entity.HuowuqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowuqingkuangVO;
import com.entity.view.HuowuqingkuangView;


/**
 * 货物情况
 * 
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
public interface HuowuqingkuangDao extends BaseMapper<HuowuqingkuangEntity> {
	
	List<HuowuqingkuangVO> selectListVO(@Param("ew") Wrapper<HuowuqingkuangEntity> wrapper);
	
	HuowuqingkuangVO selectVO(@Param("ew") Wrapper<HuowuqingkuangEntity> wrapper);
	
	List<HuowuqingkuangView> selectListView(@Param("ew") Wrapper<HuowuqingkuangEntity> wrapper);

	List<HuowuqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<HuowuqingkuangEntity> wrapper);
	
	HuowuqingkuangView selectView(@Param("ew") Wrapper<HuowuqingkuangEntity> wrapper);
	

}
