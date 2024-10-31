package com.dao;

import com.entity.KechengziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengziliaoVO;
import com.entity.view.KechengziliaoView;


/**
 * 课程资料
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface KechengziliaoDao extends BaseMapper<KechengziliaoEntity> {
	
	List<KechengziliaoVO> selectListVO(@Param("ew") Wrapper<KechengziliaoEntity> wrapper);
	
	KechengziliaoVO selectVO(@Param("ew") Wrapper<KechengziliaoEntity> wrapper);
	
	List<KechengziliaoView> selectListView(@Param("ew") Wrapper<KechengziliaoEntity> wrapper);

	List<KechengziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<KechengziliaoEntity> wrapper);
	
	KechengziliaoView selectView(@Param("ew") Wrapper<KechengziliaoEntity> wrapper);
	

}
