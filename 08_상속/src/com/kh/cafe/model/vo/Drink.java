package com.kh.cafe.model.vo;

// 다른 클래스를 상속받지 않아도 
// 기본적으로 Object라고 하는 클래스를 상속받아 사용한다.
// JVM에 의해 Object 클래스는 자동 상속이 이뤄진다.

public class Drink {
	// 1. 추상화를 통한 필드 변수 생성 
		private String name; // 이름
		private String origin; // 원산지 
		private String size; // 사이즈 
		private int price; // 가격 
		
		// 2. 생성자
		
		public Drink() {
			
		}

		public Drink(String name, String origin, String size, int price) {
			super();
			this.name = name;
			this.origin = origin;
			this.size = size;
			this.price = price;
		}

		
		// 메소드 (Alt + Shift + 'S') 
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOrigin() {
			return origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		public String drinkInfo() {
			return name + "," + origin + "," + size + "," + price;
		}
		
}
