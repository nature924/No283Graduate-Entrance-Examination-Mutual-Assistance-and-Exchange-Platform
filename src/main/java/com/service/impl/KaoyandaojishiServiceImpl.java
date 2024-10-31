package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KaoyandaojishiDao;
import com.entity.KaoyandaojishiEntity;
import com.service.KaoyandaojishiService;
import com.entity.vo.KaoyandaojishiVO;
import com.entity.view.KaoyandaojishiView;

@Service("kaoyandaojishiService")
public class KaoyandaojishiServiceImpl extends ServiceImpl<KaoyandaojishiDao, KaoyandaojishiEntity> implements KaoyandaojishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoyandaojishiEntity> page = this.selectPage(
                new Query<KaoyandaojishiEntity>(params).getPage(),
                new EntityWrapper<KaoyandaojishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoyandaojishiEntity> wrapper) {
		  Page<KaoyandaojishiView> page =new Query<KaoyandaojishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoyandaojishiVO> selectListVO(Wrapper<KaoyandaojishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoyandaojishiVO selectVO(Wrapper<KaoyandaojishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoyandaojishiView> selectListView(Wrapper<KaoyandaojishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoyandaojishiView selectView(Wrapper<KaoyandaojishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
