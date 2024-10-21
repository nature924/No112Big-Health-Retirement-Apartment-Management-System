package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangjianleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangjianleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianleixingView;


/**
 * 房间类型
 *
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface FangjianleixingService extends IService<FangjianleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangjianleixingVO> selectListVO(Wrapper<FangjianleixingEntity> wrapper);
   	
   	FangjianleixingVO selectVO(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
   	
   	List<FangjianleixingView> selectListView(Wrapper<FangjianleixingEntity> wrapper);
   	
   	FangjianleixingView selectView(@Param("ew") Wrapper<FangjianleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangjianleixingEntity> wrapper);
   	

}

