package com.dao;

import com.entity.ShoufeibiaozhunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoufeibiaozhunVO;
import com.entity.view.ShoufeibiaozhunView;


/**
 * 收费标准
 * 
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface ShoufeibiaozhunDao extends BaseMapper<ShoufeibiaozhunEntity> {
	
	List<ShoufeibiaozhunVO> selectListVO(@Param("ew") Wrapper<ShoufeibiaozhunEntity> wrapper);
	
	ShoufeibiaozhunVO selectVO(@Param("ew") Wrapper<ShoufeibiaozhunEntity> wrapper);
	
	List<ShoufeibiaozhunView> selectListView(@Param("ew") Wrapper<ShoufeibiaozhunEntity> wrapper);

	List<ShoufeibiaozhunView> selectListView(Pagination page,@Param("ew") Wrapper<ShoufeibiaozhunEntity> wrapper);
	
	ShoufeibiaozhunView selectView(@Param("ew") Wrapper<ShoufeibiaozhunEntity> wrapper);
	

}
