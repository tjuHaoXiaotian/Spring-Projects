package cn.edu.tju.scs.test.Account.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import cn.edu.tju.scs.Account.demo2.AccountService;
import cn.edu.tju.scs.test.base.UnitTestBase;

/**
 * Spring 声明式事务管理第一种：基于TransactionProxyFactoryBean配置方式
 * @author jack
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAccount extends UnitTestBase {
	
	public TestAccount() {
		super("classpath:transactionApplicationContext2.xml");
	}
	
	@Test
	public void testAccountService() {
	
		AccountService accountService = (AccountService)super.getBean("accountServiceProxy");
		accountService.transfer("a", "b", 100d);
	}
	
	
}
