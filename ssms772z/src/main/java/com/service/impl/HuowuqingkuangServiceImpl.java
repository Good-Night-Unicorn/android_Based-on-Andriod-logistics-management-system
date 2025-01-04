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


import com.dao.HuowuqingkuangDao;
import com.entity.HuowuqingkuangEntity;
import com.service.HuowuqingkuangService;
import com.entity.vo.HuowuqingkuangVO;
import com.entity.view.HuowuqingkuangView;

@Service("huowuqingkuangService")
public class HuowuqingkuangServiceImpl extends ServiceImpl<HuowuqingkuangDao, HuowuqingkuangEntity> implements HuowuqingkuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowuqingkuangEntity> page = this.selectPage(
                new Query<HuowuqingkuangEntity>(params).getPage(),
                new EntityWrapper<HuowuqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowuqingkuangEntity> wrapper) {
		  Page<HuowuqingkuangView> page =new Query<HuowuqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuowuqingkuangVO> selectListVO(Wrapper<HuowuqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuowuqingkuangVO selectVO(Wrapper<HuowuqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuowuqingkuangView> selectListView(Wrapper<HuowuqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowuqingkuangView selectView(Wrapper<HuowuqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
