package 模板方法模式.design;

/**
 * 试卷抽象类
 * -------------------------
 * 作者: yg
 * 时间: 2018-8-6 下午4:38:01   
 *
 */
public abstract class TestPaper {

	public void testQuestion1(){
		System.out.println("第一题：");
		System.out.println("答案："+answer1());
	}
	
	public void testQuestion2(){
		System.out.println("第二题：");
		System.out.println("答案："+answer2());
	}
	public void testQuestion3(){
		System.out.println("第三题：");
		System.out.println("答案："+answer3());
	}
	public void testQuestion4(){
		System.out.println("第四题：");
		System.out.println("答案："+answer4());
	}
	
	public abstract String answer1();
	public abstract String answer2();
	public abstract String answer3();
	public abstract String answer4();
}
