package com.pingan.snowTest.beanUtil;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.cglib.beans.BeanCopier;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pingan.snowTest.dto.UserDTO;
import com.pingan.snowTest.dto.UserDomain;
import com.pingan.snowTest.entity.UserEntity;
import com.pingan.snowTest.po.UserDO;
import com.pingan.snowTest.str.PrdInfoVOStr;
import com.pingan.snowTest.util.DataUtil;
import com.pingan.snowTest.util.JsonUtil;
import com.pingan.snowTest.util.UserConverter;
import com.pingan.snowTest.vo.Nav;
import com.pingan.snowTest.vo.PrdInfoVO;
import com.pingan.snowTest.vo.Rate;

public class BeanUtilT {
	
	@Test
	public void test_normalCopy(){

		// 模拟查询出数据
	    UserDO userDO = DataUtil.createData();
	    System.out.println("拷贝前：userDO:{}"+JSON.toJSONString(userDO));
	    // 第一个参数：源对象， 第二个参数：目标对象，第三个参数：是否使用自定义转换器（下面会介绍），下同
	    BeanCopier b = BeanCopier.create(UserDO.class, UserDTO.class, false);
	    UserDTO userDTO = new UserDTO();
	    b.copy(userDO, userDTO, null);
		System.out.println("userDTO:" + JSON.toJSONString(userDTO));

		
	}
	
	@Test
	public void test_sameNameDifferentType(){
		
	    // 模拟查询出数据
	    UserDO userDO = DataUtil.createData();
	    System.out.println("拷贝前：userDO:"+JSON.toJSONString(userDO));
	 
	    BeanCopier b = BeanCopier.create(UserDO.class, UserEntity.class, false);
	    UserEntity userEntity = new UserEntity();
	    b.copy(userDO, userEntity, null);

		System.out.println("userEntity:" + JSON.toJSONString(userEntity));
		
//		BeanCopier.create(source, target, useConverter);
	}
	
	
	@Test
	public void test_noConverterTest(){
	    // 模拟查询出数据
	    UserDO userDO = DataUtil.createData();
	    System.out.println("拷贝前：userDO:{}"+JSON.toJSONString(userDO));
	    BeanCopier copier = BeanCopier.create(UserDO.class, UserDomain.class, false);
	    UserDomain userDomain = new UserDomain();
	    copier.copy(userDO, userDomain, null);
		System.out.println("userDomain:" + JSON.toJSONString(userDomain));
		
	}
	
	@Test
	public void test_converterTest(){
		
	    // 模拟查询出数据
	    UserDO userDO = DataUtil.createData();
	    System.out.println("拷贝前：userDO:{}"+JSON.toJSONString(userDO));
	    BeanCopier copier = BeanCopier.create(UserDO.class, UserDomain.class, true);
	    UserConverter converter = new UserConverter();
	    UserDomain userDomain = new UserDomain();
	    copier.copy(userDO, userDomain, converter);
	    
		System.out.println("userDomain:" + JSON.toJSONString(userDomain));

	}
	
	@Test
	public void test_prdInfo(){
		
		PrdInfoVO prdInfo = new PrdInfoVO(22, "产品名称", LocalDateTime.now(), new BigDecimal("88.88"));
		List<Nav> navList = new ArrayList<>();
		List<Rate> rateList = new ArrayList<>();
		Nav n2 = new Nav("净值2", "2020-11-11", new BigDecimal("1.00"), new BigDecimal("2.22"));
		Nav n3 = new Nav("净值3", "2020-12-22", new BigDecimal("1.00"), new BigDecimal("3.33"));
		Rate r2 = new Rate("收益率2", "1999-6-6", new BigDecimal("33.55"));
		Rate r3 = new Rate("收益率3", "1999-6-7", new BigDecimal("44.99"));
		navList.add(n2);
		navList.add(n3);
		rateList.add(r2);
		rateList.add(r3);
		prdInfo.setNavList(navList);
		prdInfo.setRateList(rateList);
		System.out.println("prdInfo:" + JSON.toJSONString(prdInfo));
	}
	
	@Test
	public void test_prdInfo2(){
		String path = this.getClass().getResource("../jsonfile/prdInfo.json").getPath();
        String s = JsonUtil.readJsonFile(path);
        JSONObject jobj = JSON.parseObject(s);
        System.out.println("jobj"+jobj);
        PrdInfoVO prdVo = jobj.toJavaObject(PrdInfoVO.class);
	    System.err.println("拷贝前：prdVo:"+JSON.toJSONString(prdVo));
	    BeanCopier copier = BeanCopier.create(PrdInfoVO.class, PrdInfoVOStr.class, true);
	    UserConverter converter = new UserConverter();
	    PrdInfoVOStr prdStr = new PrdInfoVOStr();
	    copier.copy(prdVo, prdStr, converter);
		System.out.println("拷贝后：prdStr:" + JSON.toJSONString(prdStr));
	}
	
}
