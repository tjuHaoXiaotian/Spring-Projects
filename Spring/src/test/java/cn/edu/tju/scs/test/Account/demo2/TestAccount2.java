package cn.edu.tju.scs.test.Account.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.tju.scs.Account.demo2.AccountService;


/**
 * Spring 声明式事务管理第一种：基于TransactionProxyFactoryBean配置方式
 * @author jack
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:transactionApplicationContext2.xml")
public class TestAccount2 {
	
	/**
	 * 一定要注入代理类，代理类才会进行事务增强
	 */
//	@Resource(name="accountService")
	@Resource(name="accountServiceProxy")
	private AccountService accountService;

	
	@Test
	public void testAccountService() {
		accountService.transfer("a", "b", 100d);
	}
	
	
}
