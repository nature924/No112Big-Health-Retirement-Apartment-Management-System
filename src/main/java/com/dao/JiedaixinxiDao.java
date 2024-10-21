package com.dao;

import com.entity.JiedaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiedaixinxiVO;
import com.entity.view.JiedaixinxiView;


/**
 * 接待信息
 * 
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface JiedaixinxiDao extends BaseMapper<JiedaixinxiEntity> {
	
	List<JiedaixinxiVO> selectListVO(@Param("ew") Wrapper<JiedaixinxiEntity> wrapper);
	
	JiedaixinxiVO selectVO(@Param("ew") Wrapper<JiedaixinxiEntity> wrapper);
	
	List<JiedaixinxiView> selectListView(@Param("ew") Wrapper<JiedaixinxiEntity> wrapper);

	List<JiedaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiedaixinxiEntity> wrapper);
	
	JiedaixinxiView selectView(@Param("ew") Wrapper<JiedaixinxiEntity> wrapper);
	

}
