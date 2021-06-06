package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member userJeong = new Member();
		userJeong.setId("jws");
		userJeong.setName("정우성");
		userJeong.setPoint(50000);
		
		userJeong.showInfo();
		
		Member userYoo = new Member();
		userYoo.setId("yjs");
		userYoo.setName("유재석");
		userYoo.setPoint(30000);
		
		userYoo.showInfo();
		
		Member userLee = new Member();
		userLee.setId("lhr");
		userLee.setName("이효리");
		userLee.setPoint(40000);
		
		userLee.showInfo();
		
	}

}
