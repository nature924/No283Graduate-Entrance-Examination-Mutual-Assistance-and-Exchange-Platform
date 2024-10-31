package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KaoyandaojishiEntity;
import com.entity.view.KaoyandaojishiView;

import com.service.KaoyandaojishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 考研倒计时
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
@RestController
@RequestMapping("/kaoyandaojishi")
public class KaoyandaojishiController {
    @Autowired
    private KaoyandaojishiService kaoyandaojishiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaoyandaojishiEntity kaoyandaojishi,
		HttpServletRequest request){
        EntityWrapper<KaoyandaojishiEntity> ew = new EntityWrapper<KaoyandaojishiEntity>();

		PageUtils page = kaoyandaojishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoyandaojishi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaoyandaojishiEntity kaoyandaojishi, 
		HttpServletRequest request){
        EntityWrapper<KaoyandaojishiEntity> ew = new EntityWrapper<KaoyandaojishiEntity>();

		PageUtils page = kaoyandaojishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoyandaojishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaoyandaojishiEntity kaoyandaojishi){
       	EntityWrapper<KaoyandaojishiEntity> ew = new EntityWrapper<KaoyandaojishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaoyandaojishi, "kaoyandaojishi")); 
        return R.ok().put("data", kaoyandaojishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoyandaojishiEntity kaoyandaojishi){
        EntityWrapper< KaoyandaojishiEntity> ew = new EntityWrapper< KaoyandaojishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaoyandaojishi, "kaoyandaojishi")); 
		KaoyandaojishiView kaoyandaojishiView =  kaoyandaojishiService.selectView(ew);
		return R.ok("查询考研倒计时成功").put("data", kaoyandaojishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaoyandaojishiEntity kaoyandaojishi = kaoyandaojishiService.selectById(id);
        return R.ok().put("data", kaoyandaojishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaoyandaojishiEntity kaoyandaojishi = kaoyandaojishiService.selectById(id);
        return R.ok().put("data", kaoyandaojishi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoyandaojishiEntity kaoyandaojishi, HttpServletRequest request){
    	kaoyandaojishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoyandaojishi);
        kaoyandaojishiService.insert(kaoyandaojishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoyandaojishiEntity kaoyandaojishi, HttpServletRequest request){
    	kaoyandaojishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoyandaojishi);
        kaoyandaojishiService.insert(kaoyandaojishi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaoyandaojishiEntity kaoyandaojishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaoyandaojishi);
        kaoyandaojishiService.updateById(kaoyandaojishi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaoyandaojishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KaoyandaojishiEntity> wrapper = new EntityWrapper<KaoyandaojishiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = kaoyandaojishiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
