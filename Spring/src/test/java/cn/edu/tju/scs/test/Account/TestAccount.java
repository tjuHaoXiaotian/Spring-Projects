package cn.edu.tju.scs.test.Account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import cn.edu.tju.scs.Account.AccountService;
import cn.edu.tju.scs.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAccount extends UnitTestBase {
	
	public TestAccount() {
		super("classpath:transactionApplicationContext.xml");
	}
	
	@Test
	public void testAccountService() {
	
		AccountService accountService = (AccountService)super.getBean("accountService");
		accountService.transfer("a", "b", 100d);
	}
	
	
}
