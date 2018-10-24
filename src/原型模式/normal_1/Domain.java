package 原型模式.normal_1;

/**
 * 
 * 描述: 需要多份简历，创建多个对象并赋值，若有地方需改动，则每份简历都要变动
 * 作者: yg
 * 时间: 2018-8-1 下午2:08:10   
 *
 */
public class Domain {

	public static void main(String[] args) {
		Resume r1 = new Resume("张三");
		r1.setPersionInfo("男", "23");
		r1.setWorkExperience("江苏南京", "阿里巴巴");
		
		Resume r2 = new Resume("张三");
		r2.setPersionInfo("男", "23");
		r2.setWorkExperience("江苏南京", "阿里巴巴");
		
		Resume r3 = new Resume("张三");
		r3.setPersionInfo("男", "23");
		r3.setWorkExperience("江苏南京", "阿里巴巴");
		
		r1.display();
		r2.display();
		r3.display();
	}
}
