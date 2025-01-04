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


import com.dao.LiuyanfankuiDao;
import com.entity.LiuyanfankuiEntity;
import com.service.LiuyanfankuiService;
import com.entity.vo.LiuyanfankuiVO;
import com.entity.view.LiuyanfankuiView;

@Service("liuyanfankuiService")
public class LiuyanfankuiServiceImpl extends ServiceImpl<LiuyanfankuiDao, LiuyanfankuiEntity> implements LiuyanfankuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuyanfankuiEntity> page = this.selectPage(
                new Query<LiuyanfankuiEntity>(params).getPage(),
                new EntityWrapper<LiuyanfankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuyanfankuiEntity> wrapper) {
		  Page<LiuyanfankuiView> page =new Query<LiuyanfankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuyanfankuiVO> selectListVO(Wrapper<LiuyanfankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuyanfankuiVO selectVO(Wrapper<LiuyanfankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuyanfankuiView> selectListView(Wrapper<LiuyanfankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuyanfankuiView selectView(Wrapper<LiuyanfankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
