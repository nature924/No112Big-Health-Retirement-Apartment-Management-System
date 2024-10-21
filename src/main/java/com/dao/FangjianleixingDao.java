package com.dao;

import com.entity.FangjianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangjianleixingVO;
import com.entity.view.FangjianleixingView;


/**
 * 房间类型
 * 
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface FangjianleixingDao extends BaseMapper<FangjianleixingEntity> {
	
	List<FangjianleixingVO> selectListVO(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
	
	FangjianleixingVO selectVO(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
	
	List<FangjianleixingView> selectListView(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);

	List<FangjianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
	
	FangjianleixingView selectView(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
	

}
