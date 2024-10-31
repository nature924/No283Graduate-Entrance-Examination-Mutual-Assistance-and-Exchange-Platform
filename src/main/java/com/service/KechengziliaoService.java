package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengziliaoView;


/**
 * 课程资料
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface KechengziliaoService extends IService<KechengziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengziliaoVO> selectListVO(Wrapper<KechengziliaoEntity> wrapper);
   	
   	KechengziliaoVO selectVO(@Param("ew") Wrapper<KechengziliaoEntity> wrapper);
   	
   	List<KechengziliaoView> selectListView(Wrapper<KechengziliaoEntity> wrapper);
   	
   	KechengziliaoView selectView(@Param("ew") Wrapper<KechengziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengziliaoEntity> wrapper);
   	

}

