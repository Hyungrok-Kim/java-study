package com.kh.cafe.model.vo;

public class Book /* extends Object */{
	// 모든 클래스는 Object 클래스의 후손이다. 
	// 따라서 Object 클래스의 메소드를 Override 할 수 있다.
	
	private String title;
	private String author;
	private int price;
	
	public Book() {
		// super(); 생략 가능 
		
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
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
	
	//public String bookInfo() {
	//	return title + "," + author + ", " + price + "원";
	//}

		// toString
		// 일반적으로 객체 자신의 풀 패키지명과 해쉬코드를 16진수로
		// 변환한 결과를 합쳐 문자열로 반환하는 메소드
		// 
		// - 오버라이딩이란, 부모 클래스의 메소드와 동일한 이름
		//   동일한 반환자료형, 동일한 매개 변수 (메소드 헤드부분)를
		//   선언하여 자식이 원하는 내용을 출력할 수 있게 재정의하는 것
		// - 접근제한자를 변경할 수 있는데, 부모 메소드보다 더 큰 범위로만
		//   가능하다.
	
	@Override
	public String toString() {
		
		return title + "," + author + ", " + price + "원";
	}


	// equals 메소드 오버라이딩(재정의)
	// equals 메소드는 각 객체를 비교하여 같으면 true, 다르면 false를
	// 반환하는 메소드로, 실제 안의 값을 하나하나 비교하는 것이 아니라
	// 해당 코드의 주소값을 비교하기 때문에
	// 객체 안의 값을 직접 비교하고자 할 경우
	// 반드시 오버라이딩하여 각 필드를 비교하는 
	// 메소드로 구현해 주어야 한다.
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	

}

