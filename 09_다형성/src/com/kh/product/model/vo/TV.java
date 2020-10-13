package com.kh.product.model.vo;

public class TV extends Product{

	private int channel = 1;
	
	public TV() {}
	
	public TV(String modelName, int price) {
		super(modelName, price);
	}
	
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	@Override
	public void display() {
		System.out.println(super.getModelName() + " : " +
						channel + "번 채널을 보여줍니다. " );
		
	}


}
