package lab1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) //��������
public class testPara {
private int input;   //��������
private int expected;  //�������
private money mon=null;
public testPara(int input,int expected){
this.input = input;
this.expected = expected;
} 
@Before
public void setUp(){
mon = new money();  //�������Զ���
} 
@Parameters
public static Collection<Object[]> getData(){
return Arrays.asList(new Object[][]{ //���Բ�������
{0,1},
{12,1},
{39,0},
{99,0}
});
} 
@Test
public void testPa() { //���Ժ���
assertEquals(this.expected,mon.yuan(input));
}
}