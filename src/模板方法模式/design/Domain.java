package 模板方法模式.design;

/**
 * 模板方法模式：
 * 1、模板方法模式是通过将不变行为搬移到超类，去除子类中的重复代码来体现它的优势；
 * 2、模板方法模式就是提供了一个很好的代码复用平台；
 * 3、当不变的和可变的行为在子类的方法实现中混合在一起的时候，不变的行为就会在子类中重复出现。我们通过模板方法模式把这些行为搬移到单一的地方，这样就帮助子类摆脱重复的不变行为的纠缠。
 * -------------------------
 * 作者: yg
 * 时间: 2018-8-6 下午4:29:37   
 *
 */
public class Domain {

	public static void main(String[] args) {
		System.out.println("学生甲抄的题目");
		TestPaper t1 = new TestPaperA();
		t1.testQuestion1();
		t1.testQuestion2();
		t1.testQuestion3();
		t1.testQuestion4();
	
	}
}
