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


import com.dao.LiuyanhuifuDao;
import com.entity.LiuyanhuifuEntity;
import com.service.LiuyanhuifuService;
import com.entity.vo.LiuyanhuifuVO;
import com.entity.view.LiuyanhuifuView;

@Service("liuyanhuifuService")
public class LiuyanhuifuServiceImpl extends ServiceImpl<LiuyanhuifuDao, LiuyanhuifuEntity> implements LiuyanhuifuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuyanhuifuEntity> page = this.selectPage(
                new Query<LiuyanhuifuEntity>(params).getPage(),
                new EntityWrapper<LiuyanhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuyanhuifuEntity> wrapper) {
		  Page<LiuyanhuifuView> page =new Query<LiuyanhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuyanhuifuVO> selectListVO(Wrapper<LiuyanhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuyanhuifuVO selectVO(Wrapper<LiuyanhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuyanhuifuView> selectListView(Wrapper<LiuyanhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuyanhuifuView selectView(Wrapper<LiuyanhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
