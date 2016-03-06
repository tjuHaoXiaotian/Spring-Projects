package cn.edu.tju.scs.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {
	
/*	@Value("${url}")
	private String url;
	
	@Value("${jdbc.username}")   // ${username} 会取到当前电脑登录用户的username
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Bean
	public MyDriverManager myDriverManager() {
		return new MyDriverManager(url, username, password);
	}*/
	
	


	
/*	@Bean(name = "stringStore", initMethod="init", destroyMethod="destroy")
	public Store stringStore() {
		return new StringStore();
	}*/
	
/*	@Bean // 注解后，默认的 bean 的id 是： 方法的名称， 并且可以指定名称    @Bean(name="stringStore",initMethod="",destroyMethod="")
	public StringStore getStringStore() {
		return new StringStore();
	}*/
	
/*	@Bean(name = "stringStore")
	@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Store stringStore() {
		return new StringStore();
	}*/
	
	
	@Autowired
	private Store<String> s1;
	
	@Autowired
	private Store<Integer> s2;
	
	@Bean
	public IntegerStore integerStore() {
		return new IntegerStore();
	}
	
	@Bean
	public StringStore stringStore(){
		return new StringStore();
	}
	
	@Bean(name = "stringStoreTest")
	public Store stringStoreTest() {   // 返回值是 泛型 Store 保证了，同一时间只有一个明确的StringStore在内存中，放在s1 Autowired失败
		System.out.println("s1 : " + s1.getClass().getName());
		System.out.println("s2 : " + s2.getClass().getName());
		return new StringStore();
	}
	

}
