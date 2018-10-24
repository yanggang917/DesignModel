package 原型模式.design;

/**
 * 
 * 描述: 实现‘克隆’接口，重写Object类clone方法
 * 作者: yg
 * 时间: 2018-8-1 上午10:39:18   
 *
 */
public class Resume implements Cloneable{
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
	
	@Override
	protected Object clone() {
		Resume r = null;
		try {
			r = (Resume)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return r;
	}
}
