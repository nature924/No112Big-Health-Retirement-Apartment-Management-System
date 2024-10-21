package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiedaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiedaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedaixinxiView;


/**
 * 接待信息
 *
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface JiedaixinxiService extends IService<JiedaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiedaixinxiVO> selectListVO(Wrapper<JiedaixinxiEntity> wrapper);
   	
   	JiedaixinxiVO selectVO(@Param("ew") Wrapper<JiedaixinxiEntity> wrapper);
   	
   	List<JiedaixinxiView> selectListView(Wrapper<JiedaixinxiEntity> wrapper);
   	
   	JiedaixinxiView selectView(@Param("ew") Wrapper<JiedaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiedaixinxiEntity> wrapper);
   	

}

