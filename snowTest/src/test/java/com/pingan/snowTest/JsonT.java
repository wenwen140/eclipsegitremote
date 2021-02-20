package com.pingan.snowTest;

import java.io.File;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pingan.snowTest.util.JsonUtil;

public class JsonT {
	
	@Test
	public void test_read_jsonFile(){
		String jsonPath = this.getClass().getResource("jsonfile/json.json").getPath();
		String jsonStr = JsonUtil.readJsonFile(jsonPath);
		System.out.println("jsonStr:" + jsonStr);
		JSONObject jobj = JSON.parseObject(jsonStr);
		System.out.println("jobj:" + jobj);
	}
	
	@Test
	public void test2(){
		File f = new File(this.getClass().getResource("/").getPath());
		System.out.println(f);
		File f2 = new File(this.getClass().getResource("").getPath());// 如果不加“/”
		System.out.println(f2);
		File f3 = new File(this.getClass().getResource("jsonfile/json.json").getPath());
		System.out.println(f3);

		String path = JsonT.class.getClassLoader().getResource("test.json").getPath();
		System.out.println("path" + path);
		String s = JsonUtil.readJsonFile(path);
		System.out.println("s" + s);
		JSONObject jobj = JSON.parseObject(s);
		System.out.println("jobj" + jobj);
		
	}
	
	@Test
	public void test(){
        String path = JsonT.class.getClassLoader().getResource("test.json").getPath();
        String s = JsonUtil.readJsonFile(path);
        
        System.out.println("s"+s);
        
        JSONObject jobj = JSON.parseObject(s);
        System.out.println("jobj"+jobj);
        
    }
	
	

}
