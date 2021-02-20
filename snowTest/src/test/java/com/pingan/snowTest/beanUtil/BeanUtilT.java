package com.pingan.snowTest.beanUtil;

import org.junit.Test;
import org.springframework.cglib.beans.BeanCopier;

import com.alibaba.fastjson.JSON;
import com.pingan.snowTest.dto.UserDTO;
import com.pingan.snowTest.dto.UserDomain;
import com.pingan.snowTest.entity.UserEntity;
import com.pingan.snowTest.po.UserDO;
import com.pingan.snowTest.util.DataUtil;
import com.pingan.snowTest.util.UserConverter;

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

	
}
