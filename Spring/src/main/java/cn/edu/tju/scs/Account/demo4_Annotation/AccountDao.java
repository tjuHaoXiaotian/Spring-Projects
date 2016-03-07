package cn.edu.tju.scs.Account.demo4_Annotation;

/**
  转账案例的业务层实现类 
  **/

public interface AccountDao{
	
	public void outMoney(String out,Double money);
	
	public void inMoney(String in,Double money);
	
}