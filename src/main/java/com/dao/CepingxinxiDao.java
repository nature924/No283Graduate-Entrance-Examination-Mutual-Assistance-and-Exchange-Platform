package com.dao;

import com.entity.CepingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CepingxinxiVO;
import com.entity.view.CepingxinxiView;


/**
 * 测评信息
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface CepingxinxiDao extends BaseMapper<CepingxinxiEntity> {
	
	List<CepingxinxiVO> selectListVO(@Param("ew") Wrapper<CepingxinxiEntity> wrapper);
	
	CepingxinxiVO selectVO(@Param("ew") Wrapper<CepingxinxiEntity> wrapper);
	
	List<CepingxinxiView> selectListView(@Param("ew") Wrapper<CepingxinxiEntity> wrapper);

	List<CepingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CepingxinxiEntity> wrapper);
	
	CepingxinxiView selectView(@Param("ew") Wrapper<CepingxinxiEntity> wrapper);
	

}
