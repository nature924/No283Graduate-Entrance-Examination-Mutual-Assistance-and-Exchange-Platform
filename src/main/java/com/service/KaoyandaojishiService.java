package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoyandaojishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoyandaojishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoyandaojishiView;


/**
 * 考研倒计时
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface KaoyandaojishiService extends IService<KaoyandaojishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoyandaojishiVO> selectListVO(Wrapper<KaoyandaojishiEntity> wrapper);
   	
   	KaoyandaojishiVO selectVO(@Param("ew") Wrapper<KaoyandaojishiEntity> wrapper);
   	
   	List<KaoyandaojishiView> selectListView(Wrapper<KaoyandaojishiEntity> wrapper);
   	
   	KaoyandaojishiView selectView(@Param("ew") Wrapper<KaoyandaojishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoyandaojishiEntity> wrapper);
   	

}

