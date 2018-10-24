package 原型模式.design;

/**
 * 
 * 利用克隆技术，实现对象创建。克隆又分“浅复制”和“深复制”两种
 * 浅复制：只克隆值类型的变量，对于对象类型的只能克隆其引用
 * 作者: yg
 * 时间: 2018-8-1 下午2:14:59   
 *
 */
public class Domain {

	public static void main(String[] args) {
		
		Resume r1 = new Resume("张三");
		r1.setPersionInfo("男", "23");
		r1.setWorkExperience("江苏南京", "阿里巴巴");
		r1.display();
		
		Resume r2 = (Resume) r1.clone();
		r2.setWorkExperience("浙江杭州", "alibaba");
		r2.display();
		
	}
}
