package com.pingan.snowTest;

/*
import java.io.File; 
import java.net.URL; 
import java.util.jar.Attributes; 
import java.util.jar.Manifest; 

import org.apache.commons.lang.StringUtils; 
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
*/

public class AppVersion { 
	/*
    private static final Logger log = LoggerFactory.getLogger(AppVersion.class); 

    private static String version; 

    public static String get() { 
    if (StringUtils.isBlank(version)) { 
     Class<?> clazz = AppVersion.class; 
     String className = clazz.getSimpleName() + ".class"; 
     String classPath = clazz.getResource(className).toString(); 
     if (!classPath.startsWith("jar")) { 
     // Class not from JAR 
     String relativePath = clazz.getName().replace('.', File.separatorChar) + ".class"; 
     String classFolder = classPath.substring(0, classPath.length() - relativePath.length() - 1); 
     String manifestPath = classFolder + "/META-INF/MANIFEST.MF"; 
     log.debug("manifestPath={}", manifestPath); 
     version = readVersionFrom(manifestPath); 
     } else { 
     String manifestPath = classPath.substring(0, classPath.lastIndexOf("!") + 1) + "/META-INF/MANIFEST.MF"; 
     log.debug("manifestPath={}", manifestPath); 
     version = readVersionFrom(manifestPath); 
     } 
    } 
    return version; 
    } 

    private static String readVersionFrom(String manifestPath) { 
    Manifest manifest = null; 
    try { 
     manifest = new Manifest(new URL(manifestPath).openStream()); 
     Attributes attrs = manifest.getMainAttributes(); 

     String implementationVersion = attrs.getValue("Implementation-Version"); 
     implementationVersion = StringUtils.replace(implementationVersion, "-SNAPSHOT", ""); 
     log.debug("Read Implementation-Version: {}", implementationVersion); 

     String implementationBuild = attrs.getValue("Implementation-Build"); 
     log.debug("Read Implementation-Build: {}", implementationBuild); 

     String version = implementationVersion; 
     if (StringUtils.isNotBlank(implementationBuild)) { 
     version = StringUtils.join(new String[] { implementationVersion, implementationBuild }, '.'); 
     } 
     return version; 
    } catch (Exception e) { 
     log.error(e.getMessage(), e); 
    } 
    return StringUtils.EMPTY; 
    } 
    */
} 
