package cn.edu.tju.scs.aop.api;


public class BizLogicImpl implements BizLogic {
	
	public String save() {
		System.out.println("BizLogicImpl : BizLogicImpl save.");
		return "BizLogicImpl save.";
//		throw new RuntimeException();
	}

}