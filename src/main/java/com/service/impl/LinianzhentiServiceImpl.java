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


import com.dao.LinianzhentiDao;
import com.entity.LinianzhentiEntity;
import com.service.LinianzhentiService;
import com.entity.vo.LinianzhentiVO;
import com.entity.view.LinianzhentiView;

@Service("linianzhentiService")
public class LinianzhentiServiceImpl extends ServiceImpl<LinianzhentiDao, LinianzhentiEntity> implements LinianzhentiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LinianzhentiEntity> page = this.selectPage(
                new Query<LinianzhentiEntity>(params).getPage(),
                new EntityWrapper<LinianzhentiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LinianzhentiEntity> wrapper) {
		  Page<LinianzhentiView> page =new Query<LinianzhentiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LinianzhentiVO> selectListVO(Wrapper<LinianzhentiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LinianzhentiVO selectVO(Wrapper<LinianzhentiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LinianzhentiView> selectListView(Wrapper<LinianzhentiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LinianzhentiView selectView(Wrapper<LinianzhentiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
