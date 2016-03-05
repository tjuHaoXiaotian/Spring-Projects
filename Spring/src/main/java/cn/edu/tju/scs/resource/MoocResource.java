package cn.edu.tju.scs.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;


public class MoocResource implements ApplicationContextAware  {
	
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException {
		
        // 默认情况下，会根据 ApplicationContext来寻找资源位置，由于此处ApplicationContext是由Xml根据classpath配置而成，所以继承为 classpath
		Resource resource = applicationContext.getResource("config.txt");
		
		// 以 class path 方式加载资源文件，由于 src/main/resource 已经在classpath中，所以直接可以找到
//		Resource resource = applicationContext.getResource("classpath:config.txt");
		
		// 以 url 方式从网络上加载资源文件
//		Resource resource = applicationContext.getResource("url:http://www.imooc.com/learn/196");

		// 以 file 方式从文件系统加载资源文件
//		Resource resource = applicationContext.getResource("file:H:\\Java_Further_study\\spring-mvc study\\5427bf120001c7b000000000\\Spring\\src\\main\\resources\\config.txt");
		
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
		
	}

}
