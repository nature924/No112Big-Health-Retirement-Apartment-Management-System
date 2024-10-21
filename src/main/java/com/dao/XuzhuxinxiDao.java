package com.dao;

import com.entity.XuzhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuzhuxinxiVO;
import com.entity.view.XuzhuxinxiView;


/**
 * 续住信息
 * 
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface XuzhuxinxiDao extends BaseMapper<XuzhuxinxiEntity> {
	
	List<XuzhuxinxiVO> selectListVO(@Param("ew") Wrapper<XuzhuxinxiEntity> wrapper);
	
	XuzhuxinxiVO selectVO(@Param("ew") Wrapper<XuzhuxinxiEntity> wrapper);
	
	List<XuzhuxinxiView> selectListView(@Param("ew") Wrapper<XuzhuxinxiEntity> wrapper);

	List<XuzhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuzhuxinxiEntity> wrapper);
	
	XuzhuxinxiView selectView(@Param("ew") Wrapper<XuzhuxinxiEntity> wrapper);
	

}
