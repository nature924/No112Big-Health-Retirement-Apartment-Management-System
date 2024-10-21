package com.dao;

import com.entity.HulixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HulixinxiVO;
import com.entity.view.HulixinxiView;


/**
 * 护理信息
 * 
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface HulixinxiDao extends BaseMapper<HulixinxiEntity> {
	
	List<HulixinxiVO> selectListVO(@Param("ew") Wrapper<HulixinxiEntity> wrapper);
	
	HulixinxiVO selectVO(@Param("ew") Wrapper<HulixinxiEntity> wrapper);
	
	List<HulixinxiView> selectListView(@Param("ew") Wrapper<HulixinxiEntity> wrapper);

	List<HulixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HulixinxiEntity> wrapper);
	
	HulixinxiView selectView(@Param("ew") Wrapper<HulixinxiEntity> wrapper);
	

}
