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


import com.dao.JiedaixinxiDao;
import com.entity.JiedaixinxiEntity;
import com.service.JiedaixinxiService;
import com.entity.vo.JiedaixinxiVO;
import com.entity.view.JiedaixinxiView;

@Service("jiedaixinxiService")
public class JiedaixinxiServiceImpl extends ServiceImpl<JiedaixinxiDao, JiedaixinxiEntity> implements JiedaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiedaixinxiEntity> page = this.selectPage(
                new Query<JiedaixinxiEntity>(params).getPage(),
                new EntityWrapper<JiedaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiedaixinxiEntity> wrapper) {
		  Page<JiedaixinxiView> page =new Query<JiedaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiedaixinxiVO> selectListVO(Wrapper<JiedaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiedaixinxiVO selectVO(Wrapper<JiedaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiedaixinxiView> selectListView(Wrapper<JiedaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiedaixinxiView selectView(Wrapper<JiedaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
