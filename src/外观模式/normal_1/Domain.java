package 外观模式.normal_1;

/**
 * 如果要投多支股票，需要一个一个去选
 * -------------------------
 * 作者: yg
 * 时间: 2018-8-7 上午11:37:55   
 *
 */
public class Domain {

	public static void main(String[] args) {
		Stock1 s1 = new Stock1();
		Stock2 s2 = new Stock2();
		Stock3 s3 = new Stock3();
		NationalDebt1 n1 = new NationalDebt1();
		Realty1 r1 = new Realty1();
		
		s1.buy();
		s2.buy();
		s3.buy();
		n1.buy();
		r1.buy();
		
		
	}
}
