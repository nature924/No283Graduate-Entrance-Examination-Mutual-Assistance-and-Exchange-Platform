package com.dao;

import com.entity.KaoyandaojishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoyandaojishiVO;
import com.entity.view.KaoyandaojishiView;


/**
 * 考研倒计时
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public interface KaoyandaojishiDao extends BaseMapper<KaoyandaojishiEntity> {
	
	List<KaoyandaojishiVO> selectListVO(@Param("ew") Wrapper<KaoyandaojishiEntity> wrapper);
	
	KaoyandaojishiVO selectVO(@Param("ew") Wrapper<KaoyandaojishiEntity> wrapper);
	
	List<KaoyandaojishiView> selectListView(@Param("ew") Wrapper<KaoyandaojishiEntity> wrapper);

	List<KaoyandaojishiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoyandaojishiEntity> wrapper);
	
	KaoyandaojishiView selectView(@Param("ew") Wrapper<KaoyandaojishiEntity> wrapper);
	

}
