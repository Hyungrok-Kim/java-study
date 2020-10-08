package com.kh.test;

public class Book {

	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
		
	}
	
	
	
	

	public String BookInfo(){
		return (title + "," + author + "," + 
	publisher + "," + price + "원," + (int)(discountRate*100) + "% 할인" 
	+ "\n" + "할인된 가격 : " + (int)(price*(1-discountRate)) + "원");
		
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}	
}
