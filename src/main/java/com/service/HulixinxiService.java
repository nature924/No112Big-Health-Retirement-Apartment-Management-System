package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HulixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HulixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HulixinxiView;


/**
 * 护理信息
 *
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public interface HulixinxiService extends IService<HulixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HulixinxiVO> selectListVO(Wrapper<HulixinxiEntity> wrapper);
   	
   	HulixinxiVO selectVO(@Param("ew") Wrapper<HulixinxiEntity> wrapper);
   	
   	List<HulixinxiView> selectListView(Wrapper<HulixinxiEntity> wrapper);
   	
   	HulixinxiView selectView(@Param("ew") Wrapper<HulixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HulixinxiEntity> wrapper);
   	

}

