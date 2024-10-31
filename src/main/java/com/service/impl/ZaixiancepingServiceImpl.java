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


import com.dao.ZaixiancepingDao;
import com.entity.ZaixiancepingEntity;
import com.service.ZaixiancepingService;
import com.entity.vo.ZaixiancepingVO;
import com.entity.view.ZaixiancepingView;

@Service("zaixiancepingService")
public class ZaixiancepingServiceImpl extends ServiceImpl<ZaixiancepingDao, ZaixiancepingEntity> implements ZaixiancepingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixiancepingEntity> page = this.selectPage(
                new Query<ZaixiancepingEntity>(params).getPage(),
                new EntityWrapper<ZaixiancepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixiancepingEntity> wrapper) {
		  Page<ZaixiancepingView> page =new Query<ZaixiancepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixiancepingVO> selectListVO(Wrapper<ZaixiancepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixiancepingVO selectVO(Wrapper<ZaixiancepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixiancepingView> selectListView(Wrapper<ZaixiancepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixiancepingView selectView(Wrapper<ZaixiancepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
