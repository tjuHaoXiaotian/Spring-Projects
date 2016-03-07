package cn.edu.tju.scs.Account.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
  转账案例的业务层实现类 
  **/

public class AccountDaoImp extends JdbcDaoSupport implements AccountDao{
	
	public void outMoney(String out,Double money){
		
		String sql = "update account set money = money - ? where name = ?";
		
		this.getJdbcTemplate().update(sql,money,out);
	}
	
	public void inMoney(String in,Double money){
		
		String sql = "update account set money = money + ? where name = ?";
		
		this.getJdbcTemplate().update(sql,money,in);
	}
	

}