package lab1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class test {
	private money mon;
	@Before
	public void setUp() throws Exception {
	         mon = new money();  //创建测试对象
	}
    @Test
	public void test0() {
	assertEquals("判断x为0时",1,mon.yuan(0));
	}
    @Test
	public void test1() {
	assertEquals("判断x<=83并且可分配时",1,mon.yuan(7));
	}
    public void test2() {
    	assertEquals("判断x<=83但是不可分配时",0,mon.yuan(79));
    	}
    @Test
	public void test3() {
	assertEquals("判断x>83时",0,mon.yuan(85));
	}
}
