package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuzhuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuzhuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuzhuxinxiView;


/**
 * 续住信息
 *
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface XuzhuxinxiService extends IService<XuzhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuzhuxinxiVO> selectListVO(Wrapper<XuzhuxinxiEntity> wrapper);
   	
   	XuzhuxinxiVO selectVO(@Param("ew") Wrapper<XuzhuxinxiEntity> wrapper);
   	
   	List<XuzhuxinxiView> selectListView(Wrapper<XuzhuxinxiEntity> wrapper);
   	
   	XuzhuxinxiView selectView(@Param("ew") Wrapper<XuzhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuzhuxinxiEntity> wrapper);
   	

}

