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


import com.dao.KaoyanzhengceDao;
import com.entity.KaoyanzhengceEntity;
import com.service.KaoyanzhengceService;
import com.entity.vo.KaoyanzhengceVO;
import com.entity.view.KaoyanzhengceView;

@Service("kaoyanzhengceService")
public class KaoyanzhengceServiceImpl extends ServiceImpl<KaoyanzhengceDao, KaoyanzhengceEntity> implements KaoyanzhengceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoyanzhengceEntity> page = this.selectPage(
                new Query<KaoyanzhengceEntity>(params).getPage(),
                new EntityWrapper<KaoyanzhengceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoyanzhengceEntity> wrapper) {
		  Page<KaoyanzhengceView> page =new Query<KaoyanzhengceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoyanzhengceVO> selectListVO(Wrapper<KaoyanzhengceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoyanzhengceVO selectVO(Wrapper<KaoyanzhengceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoyanzhengceView> selectListView(Wrapper<KaoyanzhengceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoyanzhengceView selectView(Wrapper<KaoyanzhengceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
