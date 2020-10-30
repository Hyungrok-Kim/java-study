package com.kh.test.duck.model.vo;

public class RubberDuck extends Duck{

	public static String PLACE = "석촌호수";
	
	private int weigth;

	public RubberDuck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RubberDuck(String name, String kinds ,int weigth) {
		super(name, kinds);
		this.weigth = weigth;
		// TODO Auto-generated constructor stub
	}



	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		
		return super.toString() + "몸무게는" + weigth + "kg입니다. 하지만 전 말을 하지 못해요.";
	}
	
	@Override
    public void quack() {
    	System.out.println(super.toString() + "몸무게는" + weigth + "kg입니다. 하지만 전 말을 하지 못해요."
	);
    }
	

	

	
	
	
	
}
