package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuizhuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuizhuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuizhuxinxiView;


/**
 * 退住信息
 *
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface TuizhuxinxiService extends IService<TuizhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuizhuxinxiVO> selectListVO(Wrapper<TuizhuxinxiEntity> wrapper);
   	
   	TuizhuxinxiVO selectVO(@Param("ew") Wrapper<TuizhuxinxiEntity> wrapper);
   	
   	List<TuizhuxinxiView> selectListView(Wrapper<TuizhuxinxiEntity> wrapper);
   	
   	TuizhuxinxiView selectView(@Param("ew") Wrapper<TuizhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuizhuxinxiEntity> wrapper);
   	

}

