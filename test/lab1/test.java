package lab1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class test {
	private money mon;
	@Before
	public void setUp() throws Exception {
	         mon = new money();  //�������Զ���
	}
    @Test
	public void test0() {
	assertEquals("�ж�xΪ0ʱ",1,mon.yuan(0));
	}
    @Test
	public void test1() {
	assertEquals("�ж�x<=83���ҿɷ���ʱ",1,mon.yuan(7));
	}
    public void test2() {
    	assertEquals("�ж�x<=83���ǲ��ɷ���ʱ",0,mon.yuan(79));
    	}
    @Test
	public void test3() {
	assertEquals("�ж�x>83ʱ",0,mon.yuan(85));
	}
}
