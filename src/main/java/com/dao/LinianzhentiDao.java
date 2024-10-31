package com.dao;

import com.entity.LinianzhentiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LinianzhentiVO;
import com.entity.view.LinianzhentiView;


/**
 * 历年真题
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface LinianzhentiDao extends BaseMapper<LinianzhentiEntity> {
	
	List<LinianzhentiVO> selectListVO(@Param("ew") Wrapper<LinianzhentiEntity> wrapper);
	
	LinianzhentiVO selectVO(@Param("ew") Wrapper<LinianzhentiEntity> wrapper);
	
	List<LinianzhentiView> selectListView(@Param("ew") Wrapper<LinianzhentiEntity> wrapper);

	List<LinianzhentiView> selectListView(Pagination page,@Param("ew") Wrapper<LinianzhentiEntity> wrapper);
	
	LinianzhentiView selectView(@Param("ew") Wrapper<LinianzhentiEntity> wrapper);
	

}
