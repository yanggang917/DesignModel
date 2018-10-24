package 外观模式.design;

public class Fund {
	private Stock1 s1;
	private Stock2 s2;
	private Stock3 s3;
	private NationalDebt1 n1;
	private Realty1 r1;

	//基金初始化
	public Fund() {
		this.s1 = new Stock1();
		this.s2 = new Stock2();
		this.s3 = new Stock3();
		this.n1 = new NationalDebt1();
		this.r1 = new Realty1();
	}

	/**
	 * 买入基金
	 */
	public void buyFund() {
		s1.buy();
		s2.buy();
		s3.buy();
		n1.buy();
		r1.buy();
	}
	
	/**
	 * 赎回基金
	 */
	public void sellFund() {
		s1.sell();
		s2.sell();
		s3.sell();
		n1.sell();
		r1.sell();
	}
}
