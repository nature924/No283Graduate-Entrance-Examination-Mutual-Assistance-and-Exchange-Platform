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


import com.dao.BeikaojingyanDao;
import com.entity.BeikaojingyanEntity;
import com.service.BeikaojingyanService;
import com.entity.vo.BeikaojingyanVO;
import com.entity.view.BeikaojingyanView;

@Service("beikaojingyanService")
public class BeikaojingyanServiceImpl extends ServiceImpl<BeikaojingyanDao, BeikaojingyanEntity> implements BeikaojingyanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BeikaojingyanEntity> page = this.selectPage(
                new Query<BeikaojingyanEntity>(params).getPage(),
                new EntityWrapper<BeikaojingyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BeikaojingyanEntity> wrapper) {
		  Page<BeikaojingyanView> page =new Query<BeikaojingyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BeikaojingyanVO> selectListVO(Wrapper<BeikaojingyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BeikaojingyanVO selectVO(Wrapper<BeikaojingyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BeikaojingyanView> selectListView(Wrapper<BeikaojingyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BeikaojingyanView selectView(Wrapper<BeikaojingyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
