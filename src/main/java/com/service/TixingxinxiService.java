package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TixingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TixingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TixingxinxiView;


/**
 * 提醒信息
 *
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface TixingxinxiService extends IService<TixingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TixingxinxiVO> selectListVO(Wrapper<TixingxinxiEntity> wrapper);
   	
   	TixingxinxiVO selectVO(@Param("ew") Wrapper<TixingxinxiEntity> wrapper);
   	
   	List<TixingxinxiView> selectListView(Wrapper<TixingxinxiEntity> wrapper);
   	
   	TixingxinxiView selectView(@Param("ew") Wrapper<TixingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TixingxinxiEntity> wrapper);
   	

}

