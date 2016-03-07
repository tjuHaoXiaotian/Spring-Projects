package cn.edu.tju.scs.Account.demo4_Annotation;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * 基于注解的事务管理，实现 转账案例的业务层实现类
 * @author jack
 * 
 * 
 * @Transactionnal 注解中的属性
 *   propagation: 事务的传播行为
 *   isolation: 事务的隔离级别
 *   readOnly: 只读信息(boolean)
 *   rollbackFor:发生哪些异常回滚
     noRollbackFor:发生哪些异常不会滚
     noRollbackForClassName: 通过类名儿，指定
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
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