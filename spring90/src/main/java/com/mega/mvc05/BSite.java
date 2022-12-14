package com.mega.mvc05;

import org.springframework.stereotype.Component;
//B
@Component
public class BSite implements BSiteInterface  {

		@Override
		public void search() {
			System.out.println("물건검색하다.");
		}
		@Override
		public void basket() {
			System.out.println("장바구니에 넣다.");
		}
		@Override
		public void productOrder() {
			System.out.println("주문하다.");
		}
}
