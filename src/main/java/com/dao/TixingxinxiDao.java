package com.dao;

import com.entity.TixingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TixingxinxiVO;
import com.entity.view.TixingxinxiView;


/**
 * 提醒信息
 * 
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface TixingxinxiDao extends BaseMapper<TixingxinxiEntity> {
	
	List<TixingxinxiVO> selectListVO(@Param("ew") Wrapper<TixingxinxiEntity> wrapper);
	
	TixingxinxiVO selectVO(@Param("ew") Wrapper<TixingxinxiEntity> wrapper);
	
	List<TixingxinxiView> selectListView(@Param("ew") Wrapper<TixingxinxiEntity> wrapper);

	List<TixingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TixingxinxiEntity> wrapper);
	
	TixingxinxiView selectView(@Param("ew") Wrapper<TixingxinxiEntity> wrapper);
	

}
