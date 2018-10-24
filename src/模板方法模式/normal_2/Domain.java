package 模板方法模式.normal_2;

import 模板方法模式.normal_2.TestPaperA;
import 模板方法模式.normal_2.TestPaperB;

/**
 * 改造一下，试卷题目抽象出来
 * 作者: yg
 * 时间: 2018-8-6 下午3:34:15   
 *
 */
public class Domain {

	public static void main(String[] args) {
		System.out.println("学生甲抄的题目");
		TestPaperA t1 = new TestPaperA();
		t1.testQuestion1();
		t1.testQuestion2();
		t1.testQuestion3();
		t1.testQuestion4();
		
		System.out.println("学生乙抄的题目");
		TestPaperB t2 = new TestPaperB();
		t2.testQuestion1();
		t2.testQuestion2();
		t2.testQuestion3();
		t2.testQuestion4();
	}
}
