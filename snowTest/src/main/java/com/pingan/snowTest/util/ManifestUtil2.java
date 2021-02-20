package com.pingan.snowTest.util;

import org.springframework.util.ClassUtils;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
 
/**
 * Manifest 文件操作工具.
 */
public class ManifestUtil2 {
 
    /**
     * 获取Manifest文件配置属性值
     *
     * @return
     * @throws IOException
     */
    public static Map<String, String> getManifestProperty() {
//    	String jarFilePath = "file:D:\\workspace\\ecl_neon3\\snowTest\\target\\snowTest-0.0.1-SNAPSHOT.jar";
    	String jarName ="snowTest-0.0.1-SNAPSHOT.jar";
    	
    	Map<String, String> property = new HashMap<String, String>();
        JarFile jarFile = null;
        String content = "";
        try {
            // 获取jar的运行路径，因linux下jar的路径为”file:/app/.../test.jar!/BOOT-INF/class!/“这种格式，所以需要去掉”file:“和”!/BOOT-INF/class!/“
//            String jarFilePath = ClassUtils.getDefaultClassLoader().getResource("").getPath().replace("!/BOOT-INF/classes!/", "");
        	
        	ClassLoader defaultClassLoader = ClassUtils.getDefaultClassLoader();
        	URL resource = defaultClassLoader.getResource("");
        	String path = resource.getPath();
        	System.err.println(path);
        	
            String jarFilePath = path.replace("test-classes/", "");

            if (jarFilePath.startsWith("file")) {
                jarFilePath = jarFilePath.substring(5);
            }
            
            jarFilePath = jarFilePath + File.separator + jarName;
            
            // 通过JarFile的getJarEntry方法读取META-INF/MANIFEST.MF
            jarFile = new JarFile(jarFilePath);
            JarEntry entry = jarFile.getJarEntry("META-INF/MANIFEST.MF");
            // 如果读取到MANIFEST.MF文件内容，则转换为string
            if (entry != null) {
                StringWriter writer = new StringWriter();
                FileCopyUtils.copy(new InputStreamReader(jarFile.getInputStream(entry), "utf-8"), writer);
                jarFile.close();
                content = writer.toString();
            } else {
                return property;
            }
        } catch (Exception ex) {
            return property;
        } finally {
            try {
                if (jarFile != null) {
                    jarFile.close();
                }
            } catch (IOException e) {
                return property;
            }
        }
        return getProperty(content);
    }
 
    /**
     * 通过字符解析，MANIFEST.MF 文件中的属性值
     *
     * @param content MANIFEST.MF 文件中的字符串
     * @return
     */
    private static Map<String, String> getProperty(String content) {
        Map<String, String> result = new HashMap<String, String>();
        if ("".equals(content.trim())) {
            return result;
        }
        String[] propertys = content.split("\n");
        if (propertys == null || propertys.length == 0) {
            return result;
        }
        String[] temp;
        try {
            for (int i = 0; i < propertys.length; i++) {
                temp = propertys[i].split(":");
                if (temp.length == 2) {
                    result.put(temp[0].trim(), temp[1].trim());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
