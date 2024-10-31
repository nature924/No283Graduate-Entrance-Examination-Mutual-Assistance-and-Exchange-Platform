package com.dao;

import com.entity.BeikaojingyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BeikaojingyanVO;
import com.entity.view.BeikaojingyanView;


/**
 * 备考经验
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface BeikaojingyanDao extends BaseMapper<BeikaojingyanEntity> {
	
	List<BeikaojingyanVO> selectListVO(@Param("ew") Wrapper<BeikaojingyanEntity> wrapper);
	
	BeikaojingyanVO selectVO(@Param("ew") Wrapper<BeikaojingyanEntity> wrapper);
	
	List<BeikaojingyanView> selectListView(@Param("ew") Wrapper<BeikaojingyanEntity> wrapper);

	List<BeikaojingyanView> selectListView(Pagination page,@Param("ew") Wrapper<BeikaojingyanEntity> wrapper);
	
	BeikaojingyanView selectView(@Param("ew") Wrapper<BeikaojingyanEntity> wrapper);
	

}
