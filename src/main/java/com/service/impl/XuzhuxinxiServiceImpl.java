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


import com.dao.XuzhuxinxiDao;
import com.entity.XuzhuxinxiEntity;
import com.service.XuzhuxinxiService;
import com.entity.vo.XuzhuxinxiVO;
import com.entity.view.XuzhuxinxiView;

@Service("xuzhuxinxiService")
public class XuzhuxinxiServiceImpl extends ServiceImpl<XuzhuxinxiDao, XuzhuxinxiEntity> implements XuzhuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuzhuxinxiEntity> page = this.selectPage(
                new Query<XuzhuxinxiEntity>(params).getPage(),
                new EntityWrapper<XuzhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuzhuxinxiEntity> wrapper) {
		  Page<XuzhuxinxiView> page =new Query<XuzhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuzhuxinxiVO> selectListVO(Wrapper<XuzhuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuzhuxinxiVO selectVO(Wrapper<XuzhuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuzhuxinxiView> selectListView(Wrapper<XuzhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuzhuxinxiView selectView(Wrapper<XuzhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
