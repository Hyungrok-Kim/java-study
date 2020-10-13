package com.kh.product.run;

import com.kh.product.model.vo.Product;
import com.kh.product.model.vo.SmartPhone;
import com.kh.product.model.vo.TV;
import com.kh.product.model.vo.Tablet;

public class Main {

	public static void main(String[] args) {
		
		//Product를 상속 받은 TV, SmartPhone, Tablet 
		//객체를 하나씩 만들기 
		/*
		TV tv1 = new TV("UHD TV", 5000000);
		SmartPhone sp1 = new SmartPhone("걘역시S20", 1400000);
		Tablet tb1 = new Tablet("설피스10", 2000000);

		tv1.display();
		sp1.display();
		tb1.display();
		*/
		// 이렇게 하나씩 별도로 사용하게 되면 
		// 같은 전자제품(Product) 더라도 일일히 
		// 선언하여 사용하면서 각각을 관리해야 하는 
		// 불편함이 있다. 
		
		// 다형성!!!!
		// 다형성을 활용하면 각각 다른 객체더라도 
		// 같은 부모의 이름으로 한 번에 묶어 쓸 수 있다. 
		Product[] products = new Product[3];
		products[0] = new TV("UHD TV" , 5000000);
		products[1] = new SmartPhone("걘역시S20", 1400000);
		products[2] = new Tablet("설피스10" , 2000000);
		
		// 강아지 : 말티즈 , 닥스 훈트, 포메라니안, 비글, 진도견, 시츄, 풍산개, 허스키 
		
		
		// 일반 for문
		/*
		for(int i = 0; i < products.length; i++) {
			products[i].display();
		}
		*/
		
		// forEach문 (향상된 for문) 
		// 배열이 존재할 때, 배열을 0번째 방부터 하나하나 마지막까지 
		// 직접 찾아가며 호출하는 방식의 for문을 쓸 수 있다. 
		for(Product amuguna : products) {
			if(amuguna instanceof TV) {
				// 만약 amuguna라는 객체가 TV 클래스로 만들어 졌다면...?
				//TV t1 = (TV)amuguna; // product를 TV로 변경 (down Casting : 하향 형변환)
				//t1.setChannel(200);
				((TV) amuguna).setChannel(200);
			}
			
			amuguna.display();
			
		}
		
		// TV는  Product의 일종이다.
		// >> Product p = new TV("");
		
		// SmartPhone은 Product의 일종이다. 
		// >> Product p2 = new SmartPhone("");
		
		// product[0] = p;
		// product[1] = p2;
		
		// Product는 TV이다. 
		// >> p2.setChannel(000); ... ERROR!
		// ---> Product 중 TV가 있다면...
		//    if(p instanceof TV){ . . . }
	}

}
