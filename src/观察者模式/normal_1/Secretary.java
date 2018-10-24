package 观察者模式.normal_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台秘书类
 * -------------------------
 * 作者: yg
 * 时间: 2018-8-8 上午10:12:40   
 *
 */
public class Secretary {

	private List<StockObserver> list = new ArrayList<StockObserver>();
	
	private String action;

	public void attach(StockObserver ob){
		list.add(ob);
	}
	
	public void notifyObj(){
		for(StockObserver so:list){
			so.update();
		}
	}
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
}
