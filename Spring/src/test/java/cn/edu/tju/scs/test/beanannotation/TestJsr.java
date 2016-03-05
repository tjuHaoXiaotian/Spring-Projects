package cn.edu.tju.scs.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import cn.edu.tju.scs.beanannotation.jsr.JsrServie;
import cn.edu.tju.scs.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase {
	
	public TestJsr() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testSave() {
		JsrServie service = getBean("jsrServie");
		service.save();
	}
	
}
