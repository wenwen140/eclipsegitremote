package com.pingan.snowTest;

import java.io.File;
import java.io.Reader;
import java.util.Map;

import org.junit.Test;
import org.springframework.util.StringUtils;

import com.pingan.snowTest.util.ManifestUtil;

public class Jtest {
	
	@Test
	public void test(){
		System.out.println("aa");
		System.out.println("aa");
	}
	
	@Test
	public void testpath(){
        System.out.println(Jtest.class.getResource(""));
        System.out.println(Jtest.class.getResource("/"));
	}
	@Test
	public void testpath2(){
		Jtest t = new Jtest();
        System.out.println(t.getClass());
        System.out.println(t.getClass().getClassLoader());
        System.out.println(t.getClass().getClassLoader().getResource(""));
        System.out.println(t.getClass().getClassLoader().getResource("/"));//null
	}
	
	@Test
    public void testUtil()
    {
    	Map<String, String> manifestProperty = ManifestUtil.getManifestProperty();
    	System.out.println(manifestProperty);
    	
    	String buildTime = manifestProperty.get("Build-time");
    	if(!StringUtils.isEmpty(buildTime)){
    		System.err.println(buildTime);
    	}
    	
    }
	
	@Test
	public void testUtil2()
	{
		File f = new File("D:\\workspace\\ecl_neon3\\snowTest\\target\\snowTest-0.0.1-SNAPSHOT.jar");
//		Reader r = ManifestUtils.manifestReaderFromExplodedDirectory(f);
//		String str = r.toString();
//		System.out.println(str);
	}

}
