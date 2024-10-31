package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoyanzhengceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoyanzhengceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoyanzhengceView;


/**
 * 考研政策
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface KaoyanzhengceService extends IService<KaoyanzhengceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoyanzhengceVO> selectListVO(Wrapper<KaoyanzhengceEntity> wrapper);
   	
   	KaoyanzhengceVO selectVO(@Param("ew") Wrapper<KaoyanzhengceEntity> wrapper);
   	
   	List<KaoyanzhengceView> selectListView(Wrapper<KaoyanzhengceEntity> wrapper);
   	
   	KaoyanzhengceView selectView(@Param("ew") Wrapper<KaoyanzhengceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoyanzhengceEntity> wrapper);
   	

}

