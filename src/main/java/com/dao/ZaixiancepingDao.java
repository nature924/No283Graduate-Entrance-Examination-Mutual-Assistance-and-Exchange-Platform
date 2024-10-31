package com.dao;

import com.entity.ZaixiancepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixiancepingVO;
import com.entity.view.ZaixiancepingView;


/**
 * 在线测评
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface ZaixiancepingDao extends BaseMapper<ZaixiancepingEntity> {
	
	List<ZaixiancepingVO> selectListVO(@Param("ew") Wrapper<ZaixiancepingEntity> wrapper);
	
	ZaixiancepingVO selectVO(@Param("ew") Wrapper<ZaixiancepingEntity> wrapper);
	
	List<ZaixiancepingView> selectListView(@Param("ew") Wrapper<ZaixiancepingEntity> wrapper);

	List<ZaixiancepingView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixiancepingEntity> wrapper);
	
	ZaixiancepingView selectView(@Param("ew") Wrapper<ZaixiancepingEntity> wrapper);
	

}
