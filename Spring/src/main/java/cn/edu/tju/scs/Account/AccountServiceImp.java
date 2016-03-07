package cn.edu.tju.scs.Account;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
  转账案例的业务层实现类 
  **/

public class AccountServiceImp implements AccountService{
	
	private AccountDao accountDao;
	
	
	
	public AccountDao getAccountDao() {
		return accountDao;
	}



	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

    // 注入事务管理的模板
	private TransactionTemplate transactionTemplate;
	

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}



	public void transfer(final String out,final String in,final Double money){
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				System.out.println("the transfer is begin:----------------");
				accountDao.outMoney(out, money);
				 int i = 1 / 0;
				accountDao.inMoney(in, money);
			}
		});
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}