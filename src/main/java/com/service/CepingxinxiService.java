package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CepingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CepingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CepingxinxiView;


/**
 * 测评信息
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface CepingxinxiService extends IService<CepingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CepingxinxiVO> selectListVO(Wrapper<CepingxinxiEntity> wrapper);
   	
   	CepingxinxiVO selectVO(@Param("ew") Wrapper<CepingxinxiEntity> wrapper);
   	
   	List<CepingxinxiView> selectListView(Wrapper<CepingxinxiEntity> wrapper);
   	
   	CepingxinxiView selectView(@Param("ew") Wrapper<CepingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CepingxinxiEntity> wrapper);
   	

}

