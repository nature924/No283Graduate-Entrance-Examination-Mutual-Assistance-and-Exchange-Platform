package com.dao;

import com.entity.YuanxiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxiaoxinxiVO;
import com.entity.view.YuanxiaoxinxiView;


/**
 * 院校信息
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface YuanxiaoxinxiDao extends BaseMapper<YuanxiaoxinxiEntity> {
	
	List<YuanxiaoxinxiVO> selectListVO(@Param("ew") Wrapper<YuanxiaoxinxiEntity> wrapper);
	
	YuanxiaoxinxiVO selectVO(@Param("ew") Wrapper<YuanxiaoxinxiEntity> wrapper);
	
	List<YuanxiaoxinxiView> selectListView(@Param("ew") Wrapper<YuanxiaoxinxiEntity> wrapper);

	List<YuanxiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxiaoxinxiEntity> wrapper);
	
	YuanxiaoxinxiView selectView(@Param("ew") Wrapper<YuanxiaoxinxiEntity> wrapper);
	

}
