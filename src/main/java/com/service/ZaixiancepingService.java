package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixiancepingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixiancepingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixiancepingView;


/**
 * 在线测评
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface ZaixiancepingService extends IService<ZaixiancepingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixiancepingVO> selectListVO(Wrapper<ZaixiancepingEntity> wrapper);
   	
   	ZaixiancepingVO selectVO(@Param("ew") Wrapper<ZaixiancepingEntity> wrapper);
   	
   	List<ZaixiancepingView> selectListView(Wrapper<ZaixiancepingEntity> wrapper);
   	
   	ZaixiancepingView selectView(@Param("ew") Wrapper<ZaixiancepingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixiancepingEntity> wrapper);
   	

}

