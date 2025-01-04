package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuyanfankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuyanfankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuyanfankuiView;


/**
 * 留言反馈
 *
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
public interface LiuyanfankuiService extends IService<LiuyanfankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuyanfankuiVO> selectListVO(Wrapper<LiuyanfankuiEntity> wrapper);
   	
   	LiuyanfankuiVO selectVO(@Param("ew") Wrapper<LiuyanfankuiEntity> wrapper);
   	
   	List<LiuyanfankuiView> selectListView(Wrapper<LiuyanfankuiEntity> wrapper);
   	
   	LiuyanfankuiView selectView(@Param("ew") Wrapper<LiuyanfankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuyanfankuiEntity> wrapper);
   	

}

