package com.pingan.snowTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import com.pingan.snowTest.util.ManifestUtil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testUtil()
    {
    	Map<String, String> manifestProperty = ManifestUtil.getManifestProperty();
    	System.out.println(manifestProperty);
    }

    public void testSnow() throws Exception, Exception
    {
    	/*Properties prop = new Properties();
    	prop.load(getServletContext().getResourceAsStream("/META-INF/MANIFEST.MF"));
    	System.out.println("All attributes:" + prop.stringPropertyNames());
    	System.out.println(prop.getProperty("{whatever attribute you want}"));*/
    	
    	Manifest manifest = new Manifest(new FileInputStream(new File("MANIFEST.MF")));
    	Attributes attr = manifest.getMainAttributes();
    	 
    	System.out.println(attr.getValue("Build-time"));
    	System.out.println(attr.getValue("Manifest-Version"));
    	System.out.println(attr.getValue("X-COMMENT"));
    	
    }
    
    public void testreadManifest()
    {
    	/*
        ZipFile zipFile = new ZipFile(sourceJARFile); 
        Enumeration entries = zipFile.entries(); 

        while (entries.hasMoreElements()) 
        { 
         ZipEntry zipEntry = (ZipEntry) entries.nextElement(); 
         if (zipEntry.getName().equals("META-INF/MANIFEST.MF")) 
         { 
          return toString(zipFile.getInputStream(zipEntry)); 
         } 
        } 

        throw new IllegalStateException("Manifest not found"); 
        */
    }
    
    public void testreadManifest2()
    {/*
    	JarFile jarFile = null;
    	try {
    	　　 // 获取jar的运行路径，因linux下jar的路径为”file:/app/.../test.jar!/BOOT-INF/class!/“这种格式，所以需要去掉”file:“和”!/BOOT-INF/class!/“
    	    String jarFilePath = ClassUtils.getDefaultClassLoader().getResource("").getPath().replace("!/BOOT-INF/classes!/", "");
    	    if (jarFilePath.startsWith("file")) {
    	        jarFilePath = jarFilePath.substring(5);
    	    }
    	    log.debug("jarFilePath:" + jarFilePath);
    	　　 // 通过JarFile的getJarEntry方法读取META-INF/MANIFEST.MF
    	    jarFile = new JarFile(jarFilePath);
    	    JarEntry entry = jarFile.getJarEntry("META-INF/MANIFEST.MF");
    	 　　// 如果读取到MANIFEST.MF文件内容，则转换为string
    	    if (entry != null) {
    	        StringWriter writer = new StringWriter();
    	        FileCopyUtils.copy(new InputStreamReader(jarFile.getInputStream(entry)), writer);
    	        jarFile.close();
    	        String content = IOUtils.toString(new StringReader(writer.toString()));
    	        log.debug("MANIFEST.MF content:" + content);
    	　　　　 return content;
    	    } else {
    	        return null;
    	    }
    	} catch (Exception ex) {
    	    log.error("error when reading MANIFEST.MF", ex);
    	} finally {
    	    if (jarFile != null) {
    	        jarFile.close();
    	    }
    	}
    */}
    
}
