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


import com.dao.TixingxinxiDao;
import com.entity.TixingxinxiEntity;
import com.service.TixingxinxiService;
import com.entity.vo.TixingxinxiVO;
import com.entity.view.TixingxinxiView;

@Service("tixingxinxiService")
public class TixingxinxiServiceImpl extends ServiceImpl<TixingxinxiDao, TixingxinxiEntity> implements TixingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TixingxinxiEntity> page = this.selectPage(
                new Query<TixingxinxiEntity>(params).getPage(),
                new EntityWrapper<TixingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TixingxinxiEntity> wrapper) {
		  Page<TixingxinxiView> page =new Query<TixingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TixingxinxiVO> selectListVO(Wrapper<TixingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TixingxinxiVO selectVO(Wrapper<TixingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TixingxinxiView> selectListView(Wrapper<TixingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TixingxinxiView selectView(Wrapper<TixingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
