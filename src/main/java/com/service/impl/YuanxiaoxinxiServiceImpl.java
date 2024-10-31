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


import com.dao.YuanxiaoxinxiDao;
import com.entity.YuanxiaoxinxiEntity;
import com.service.YuanxiaoxinxiService;
import com.entity.vo.YuanxiaoxinxiVO;
import com.entity.view.YuanxiaoxinxiView;

@Service("yuanxiaoxinxiService")
public class YuanxiaoxinxiServiceImpl extends ServiceImpl<YuanxiaoxinxiDao, YuanxiaoxinxiEntity> implements YuanxiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxiaoxinxiEntity> page = this.selectPage(
                new Query<YuanxiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<YuanxiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxiaoxinxiEntity> wrapper) {
		  Page<YuanxiaoxinxiView> page =new Query<YuanxiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxiaoxinxiVO> selectListVO(Wrapper<YuanxiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxiaoxinxiVO selectVO(Wrapper<YuanxiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxiaoxinxiView> selectListView(Wrapper<YuanxiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxiaoxinxiView selectView(Wrapper<YuanxiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
