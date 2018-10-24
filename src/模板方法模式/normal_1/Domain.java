package 模板方法模式.normal_1;


/**
 * 同样一份试卷，每个同学都需要抄写一份题目和答案
 * 作者: yg
 * 时间: 2018-8-6 上午10:38:55   
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
