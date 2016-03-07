package cn.edu.tju.scs.test.Account.demo3_AspectJ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import cn.edu.tju.scs.Account.demo3_AspectJ.AccountService;
import cn.edu.tju.scs.test.base.UnitTestBase;

/**
 * Spring 声明式事务管理第二种：基于AspectJ的xml配置方式
 * @author jack
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAccount extends UnitTestBase {
	
	public TestAccount() {
		super("classpath:transactionApplicationContext3.xml");
	}
	
	@Test
	public void testAccountService() {
	
		AccountService accountService = (AccountService)super.getBean("accountService");
		accountService.transfer("a", "b", 100d);
	}
	
	
}
