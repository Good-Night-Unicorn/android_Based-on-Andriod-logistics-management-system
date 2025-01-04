package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuowudingdanDao;
import com.entity.HuowudingdanEntity;
import com.service.HuowudingdanService;
import com.entity.vo.HuowudingdanVO;
import com.entity.view.HuowudingdanView;

@Service("huowudingdanService")
public class HuowudingdanServiceImpl extends ServiceImpl<HuowudingdanDao, HuowudingdanEntity> implements HuowudingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowudingdanEntity> page = this.selectPage(
                new Query<HuowudingdanEntity>(params).getPage(),
                new EntityWrapper<HuowudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowudingdanEntity> wrapper) {
		  Page<HuowudingdanView> page =new Query<HuowudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuowudingdanVO> selectListVO(Wrapper<HuowudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuowudingdanVO selectVO(Wrapper<HuowudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuowudingdanView> selectListView(Wrapper<HuowudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowudingdanView selectView(Wrapper<HuowudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
