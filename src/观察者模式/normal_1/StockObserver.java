package 观察者模式.normal_1;

/**
 * 看股票同事类
 * -------------------------
 * 作者: yg
 * 时间: 2018-8-8 上午10:13:22   
 *
 */
public class StockObserver {

	private String name;
	private Secretary sub;
	public StockObserver(String name, Secretary sub) {
		this.name = name;
		this.sub = sub;
	}
	
	public void update (){
		System.out.println(sub.getAction() +name + "，赶紧工作");
	}
	
	
}
