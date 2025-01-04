package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowudingdanView;


/**
 * 货物订单
 *
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
public interface HuowudingdanService extends IService<HuowudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowudingdanVO> selectListVO(Wrapper<HuowudingdanEntity> wrapper);
   	
   	HuowudingdanVO selectVO(@Param("ew") Wrapper<HuowudingdanEntity> wrapper);
   	
   	List<HuowudingdanView> selectListView(Wrapper<HuowudingdanEntity> wrapper);
   	
   	HuowudingdanView selectView(@Param("ew") Wrapper<HuowudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowudingdanEntity> wrapper);
   	

}

