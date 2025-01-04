package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowuqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowuqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowuqingkuangView;


/**
 * 货物情况
 *
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
public interface HuowuqingkuangService extends IService<HuowuqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowuqingkuangVO> selectListVO(Wrapper<HuowuqingkuangEntity> wrapper);
   	
   	HuowuqingkuangVO selectVO(@Param("ew") Wrapper<HuowuqingkuangEntity> wrapper);
   	
   	List<HuowuqingkuangView> selectListView(Wrapper<HuowuqingkuangEntity> wrapper);
   	
   	HuowuqingkuangView selectView(@Param("ew") Wrapper<HuowuqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowuqingkuangEntity> wrapper);
   	

}

