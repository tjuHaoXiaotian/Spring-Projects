package cn.edu.tju.scs.test.Account;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.tju.scs.Account.AccountService;
import cn.edu.tju.scs.test.base.UnitTestBase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:transactionApplicationContext.xml")
public class TestAccount2 {
	
	@Resource
	private AccountService accountService;

	
	@Test
	public void testAccountService() {
		
		accountService.transfer("a", "b", 100d);
	}
	
	
}
