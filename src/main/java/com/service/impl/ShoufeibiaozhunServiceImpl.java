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


import com.dao.ShoufeibiaozhunDao;
import com.entity.ShoufeibiaozhunEntity;
import com.service.ShoufeibiaozhunService;
import com.entity.vo.ShoufeibiaozhunVO;
import com.entity.view.ShoufeibiaozhunView;

@Service("shoufeibiaozhunService")
public class ShoufeibiaozhunServiceImpl extends ServiceImpl<ShoufeibiaozhunDao, ShoufeibiaozhunEntity> implements ShoufeibiaozhunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoufeibiaozhunEntity> page = this.selectPage(
                new Query<ShoufeibiaozhunEntity>(params).getPage(),
                new EntityWrapper<ShoufeibiaozhunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoufeibiaozhunEntity> wrapper) {
		  Page<ShoufeibiaozhunView> page =new Query<ShoufeibiaozhunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoufeibiaozhunVO> selectListVO(Wrapper<ShoufeibiaozhunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoufeibiaozhunVO selectVO(Wrapper<ShoufeibiaozhunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoufeibiaozhunView> selectListView(Wrapper<ShoufeibiaozhunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoufeibiaozhunView selectView(Wrapper<ShoufeibiaozhunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
