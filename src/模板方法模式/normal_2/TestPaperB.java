package 模板方法模式.normal_2;

public class TestPaperB extends TestPaper{

	public void testQuestion1(){
		super.testQuestion1();
		System.out.println("选择A");
	}
	
	public void testQuestion2(){
		super.testQuestion2();
		System.out.println("选择C");
	}
	public void testQuestion3(){
		super.testQuestion3();
		System.out.println("选择A");
	}
	public void testQuestion4(){
		super.testQuestion4();
		System.out.println("选择D");
	}
}
