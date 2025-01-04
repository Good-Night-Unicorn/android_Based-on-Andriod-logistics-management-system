package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiuyanhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiuyanhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiuyanhuifuView;


/**
 * 留言回复
 *
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
public interface LiuyanhuifuService extends IService<LiuyanhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiuyanhuifuVO> selectListVO(Wrapper<LiuyanhuifuEntity> wrapper);
   	
   	LiuyanhuifuVO selectVO(@Param("ew") Wrapper<LiuyanhuifuEntity> wrapper);
   	
   	List<LiuyanhuifuView> selectListView(Wrapper<LiuyanhuifuEntity> wrapper);
   	
   	LiuyanhuifuView selectView(@Param("ew") Wrapper<LiuyanhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiuyanhuifuEntity> wrapper);
   	

}

