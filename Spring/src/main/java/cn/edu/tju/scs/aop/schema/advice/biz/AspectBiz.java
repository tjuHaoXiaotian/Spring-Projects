package cn.edu.tju.scs.aop.schema.advice.biz;

public class AspectBiz {
	
	public void biz() {
		System.out.println("AspectBiz biz.");
//		throw new RuntimeException();
	}
	
	public void init(String bizName, int times) {
		System.out.println("AspectBiz init（业务方法！） : " + bizName + "   " + times);
	}

}
