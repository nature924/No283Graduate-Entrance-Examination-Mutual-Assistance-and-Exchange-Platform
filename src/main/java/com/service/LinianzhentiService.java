package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LinianzhentiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LinianzhentiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LinianzhentiView;


/**
 * 历年真题
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface LinianzhentiService extends IService<LinianzhentiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LinianzhentiVO> selectListVO(Wrapper<LinianzhentiEntity> wrapper);
   	
   	LinianzhentiVO selectVO(@Param("ew") Wrapper<LinianzhentiEntity> wrapper);
   	
   	List<LinianzhentiView> selectListView(Wrapper<LinianzhentiEntity> wrapper);
   	
   	LinianzhentiView selectView(@Param("ew") Wrapper<LinianzhentiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LinianzhentiEntity> wrapper);
   	

}

