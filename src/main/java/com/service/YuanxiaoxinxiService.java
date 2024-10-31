package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxiaoxinxiView;


/**
 * 院校信息
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface YuanxiaoxinxiService extends IService<YuanxiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxiaoxinxiVO> selectListVO(Wrapper<YuanxiaoxinxiEntity> wrapper);
   	
   	YuanxiaoxinxiVO selectVO(@Param("ew") Wrapper<YuanxiaoxinxiEntity> wrapper);
   	
   	List<YuanxiaoxinxiView> selectListView(Wrapper<YuanxiaoxinxiEntity> wrapper);
   	
   	YuanxiaoxinxiView selectView(@Param("ew") Wrapper<YuanxiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxiaoxinxiEntity> wrapper);
   	

}

