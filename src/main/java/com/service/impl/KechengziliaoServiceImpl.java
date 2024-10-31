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


import com.dao.KechengziliaoDao;
import com.entity.KechengziliaoEntity;
import com.service.KechengziliaoService;
import com.entity.vo.KechengziliaoVO;
import com.entity.view.KechengziliaoView;

@Service("kechengziliaoService")
public class KechengziliaoServiceImpl extends ServiceImpl<KechengziliaoDao, KechengziliaoEntity> implements KechengziliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengziliaoEntity> page = this.selectPage(
                new Query<KechengziliaoEntity>(params).getPage(),
                new EntityWrapper<KechengziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengziliaoEntity> wrapper) {
		  Page<KechengziliaoView> page =new Query<KechengziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengziliaoVO> selectListVO(Wrapper<KechengziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengziliaoVO selectVO(Wrapper<KechengziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengziliaoView> selectListView(Wrapper<KechengziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengziliaoView selectView(Wrapper<KechengziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
