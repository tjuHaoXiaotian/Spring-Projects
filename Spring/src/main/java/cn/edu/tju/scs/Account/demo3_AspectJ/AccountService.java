package cn.edu.tju.scs.Account.demo3_AspectJ;

/**
  转账案例的业务层实现类 
  **/

public interface AccountService{
	public void transfer(String out,String in,Double money);
}