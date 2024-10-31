package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DakaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DakaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DakaxinxiView;


/**
 * 打卡信息
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface DakaxinxiService extends IService<DakaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DakaxinxiVO> selectListVO(Wrapper<DakaxinxiEntity> wrapper);
   	
   	DakaxinxiVO selectVO(@Param("ew") Wrapper<DakaxinxiEntity> wrapper);
   	
   	List<DakaxinxiView> selectListView(Wrapper<DakaxinxiEntity> wrapper);
   	
   	DakaxinxiView selectView(@Param("ew") Wrapper<DakaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DakaxinxiEntity> wrapper);
   	

}

