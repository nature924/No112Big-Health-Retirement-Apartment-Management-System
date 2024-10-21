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


import com.dao.TuizhuxinxiDao;
import com.entity.TuizhuxinxiEntity;
import com.service.TuizhuxinxiService;
import com.entity.vo.TuizhuxinxiVO;
import com.entity.view.TuizhuxinxiView;

@Service("tuizhuxinxiService")
public class TuizhuxinxiServiceImpl extends ServiceImpl<TuizhuxinxiDao, TuizhuxinxiEntity> implements TuizhuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuizhuxinxiEntity> page = this.selectPage(
                new Query<TuizhuxinxiEntity>(params).getPage(),
                new EntityWrapper<TuizhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuizhuxinxiEntity> wrapper) {
		  Page<TuizhuxinxiView> page =new Query<TuizhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuizhuxinxiVO> selectListVO(Wrapper<TuizhuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuizhuxinxiVO selectVO(Wrapper<TuizhuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuizhuxinxiView> selectListView(Wrapper<TuizhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuizhuxinxiView selectView(Wrapper<TuizhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
