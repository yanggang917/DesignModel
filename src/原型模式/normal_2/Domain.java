package 原型模式.normal_2;

/**
 * 
 * 描述: 引用的方式，
 * 作者: yg
 * 时间: 2018-8-1 下午2:08:10   
 *
 */
public class Domain {

	public static void main(String[] args) {
		Resume r1 = new Resume("张三");
		r1.setPersionInfo("男", "23");
		r1.setWorkExperience("江苏南京", "阿里巴巴");
		
		
		r1.display();
		Resume r2 = r1;
		r2.display();
		Resume r3 = r1;
		r3.display();
	}
}
