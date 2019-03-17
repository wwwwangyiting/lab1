package lab1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) //批量测试
public class testPara {
private int input;   //测试输入
private int expected;  //期望输出
private money mon=null;
public testPara(int input,int expected){
this.input = input;
this.expected = expected;
} 
@Before
public void setUp(){
mon = new money();  //创建测试对象
} 
@Parameters
public static Collection<Object[]> getData(){
return Arrays.asList(new Object[][]{ //测试参数数组
{0,1},
{12,1},
{39,0},
{99,0}
});
} 
@Test
public void testPa() { //测试函数
assertEquals(this.expected,mon.yuan(input));
}
}