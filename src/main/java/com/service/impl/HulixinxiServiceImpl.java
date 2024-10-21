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


import com.dao.HulixinxiDao;
import com.entity.HulixinxiEntity;
import com.service.HulixinxiService;
import com.entity.vo.HulixinxiVO;
import com.entity.view.HulixinxiView;

@Service("hulixinxiService")
public class HulixinxiServiceImpl extends ServiceImpl<HulixinxiDao, HulixinxiEntity> implements HulixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HulixinxiEntity> page = this.selectPage(
                new Query<HulixinxiEntity>(params).getPage(),
                new EntityWrapper<HulixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HulixinxiEntity> wrapper) {
		  Page<HulixinxiView> page =new Query<HulixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HulixinxiVO> selectListVO(Wrapper<HulixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HulixinxiVO selectVO(Wrapper<HulixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HulixinxiView> selectListView(Wrapper<HulixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HulixinxiView selectView(Wrapper<HulixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
