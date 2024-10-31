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


import com.dao.CepingxinxiDao;
import com.entity.CepingxinxiEntity;
import com.service.CepingxinxiService;
import com.entity.vo.CepingxinxiVO;
import com.entity.view.CepingxinxiView;

@Service("cepingxinxiService")
public class CepingxinxiServiceImpl extends ServiceImpl<CepingxinxiDao, CepingxinxiEntity> implements CepingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CepingxinxiEntity> page = this.selectPage(
                new Query<CepingxinxiEntity>(params).getPage(),
                new EntityWrapper<CepingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CepingxinxiEntity> wrapper) {
		  Page<CepingxinxiView> page =new Query<CepingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CepingxinxiVO> selectListVO(Wrapper<CepingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CepingxinxiVO selectVO(Wrapper<CepingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CepingxinxiView> selectListView(Wrapper<CepingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CepingxinxiView selectView(Wrapper<CepingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
