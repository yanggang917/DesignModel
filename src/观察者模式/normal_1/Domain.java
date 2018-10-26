package 观察者模式.normal_1;

/**
 * 观察者模式
 * -------------------------
 * 作者: yg
 * 时间: 2018-10-26 下午3:27:04   
 *
 */
public class Domain {

	public static void main(String[] args) {
		Secretary xiaojiejie = new Secretary();
		
		//看股票的同事，对小姐姐交代了一番
		StockObserver zhangsan = new StockObserver("张三", xiaojiejie);
		StockObserver lisi = new StockObserver("李四", xiaojiejie);
		
		//小姐姐关注了这两个人
		xiaojiejie.attach(zhangsan);
		xiaojiejie.attach(lisi);
		
		//发现了情况
		xiaojiejie.setAction("老板来啦，");
		
		//赶紧通知
		xiaojiejie.notifyObj();
	}
	
}
