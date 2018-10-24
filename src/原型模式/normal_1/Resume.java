package 原型模式.normal_1;

/**
 * 
 * 描述: 简历 
 * 作者: yg
 * 时间: 2018-8-1 上午10:39:18   
 *
 */
public class Resume {
	private String name;
	private String age;
	private String sex;
	private String address;
	private String company;
	
	public Resume(String name) {
		super();
		this.name = name;
	}

	public  void setPersionInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String address, String company){
		this.address = address;
		this.company = company;
	}
	
	public void display(){
		System.out.println(this.name + " " + this.age + " " + this.sex + " " + this.address + " " + this.company);
	}
	
}
