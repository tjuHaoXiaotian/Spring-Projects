package cn.edu.tju.scs.Account.demo3_AspectJ;

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



	public void transfer(String out,String in,Double money){
		
		System.out.println("the transfer is begin:----------------");
		accountDao.outMoney(out, money);
		 int i = 1 / 0;
		accountDao.inMoney(in, money);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}