package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoufeibiaozhunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoufeibiaozhunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoufeibiaozhunView;


/**
 * 收费标准
 *
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface ShoufeibiaozhunService extends IService<ShoufeibiaozhunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoufeibiaozhunVO> selectListVO(Wrapper<ShoufeibiaozhunEntity> wrapper);
   	
   	ShoufeibiaozhunVO selectVO(@Param("ew") Wrapper<ShoufeibiaozhunEntity> wrapper);
   	
   	List<ShoufeibiaozhunView> selectListView(Wrapper<ShoufeibiaozhunEntity> wrapper);
   	
   	ShoufeibiaozhunView selectView(@Param("ew") Wrapper<ShoufeibiaozhunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoufeibiaozhunEntity> wrapper);
   	

}

