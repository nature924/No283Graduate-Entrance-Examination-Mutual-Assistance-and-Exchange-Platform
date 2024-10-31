package com.dao;

import com.entity.KaoyanzhengceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoyanzhengceVO;
import com.entity.view.KaoyanzhengceView;


/**
 * 考研政策
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface KaoyanzhengceDao extends BaseMapper<KaoyanzhengceEntity> {
	
	List<KaoyanzhengceVO> selectListVO(@Param("ew") Wrapper<KaoyanzhengceEntity> wrapper);
	
	KaoyanzhengceVO selectVO(@Param("ew") Wrapper<KaoyanzhengceEntity> wrapper);
	
	List<KaoyanzhengceView> selectListView(@Param("ew") Wrapper<KaoyanzhengceEntity> wrapper);

	List<KaoyanzhengceView> selectListView(Pagination page,@Param("ew") Wrapper<KaoyanzhengceEntity> wrapper);
	
	KaoyanzhengceView selectView(@Param("ew") Wrapper<KaoyanzhengceEntity> wrapper);
	

}
