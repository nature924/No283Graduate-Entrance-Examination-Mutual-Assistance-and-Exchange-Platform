package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BeikaojingyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BeikaojingyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BeikaojingyanView;


/**
 * 备考经验
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface BeikaojingyanService extends IService<BeikaojingyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BeikaojingyanVO> selectListVO(Wrapper<BeikaojingyanEntity> wrapper);
   	
   	BeikaojingyanVO selectVO(@Param("ew") Wrapper<BeikaojingyanEntity> wrapper);
   	
   	List<BeikaojingyanView> selectListView(Wrapper<BeikaojingyanEntity> wrapper);
   	
   	BeikaojingyanView selectView(@Param("ew") Wrapper<BeikaojingyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BeikaojingyanEntity> wrapper);
   	

}

