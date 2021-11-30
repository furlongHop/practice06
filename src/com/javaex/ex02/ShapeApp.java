package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
		/*
		<결과 예측>
		s1:생성자 Shape(2) 실행 →  String 2개짜리 생성자가 필요하므로 부모 클래스의 Shape 2개짜리 생성자가 사용되었다.
		t1:생성자 Shape(0) 실행>생성자 Triangle(0) 실행 → 값이 입력되지 않았으므로 기본 생성자가 쓰였다.
		이때, 자식 클래스인 Triangle을 이용해 메모리 로딩을 했으므로 부모 클래스인 Shape의 기본 생성자도 사용되었다.
		t2:생성자 Shape(2) 실행>생성자 Triangle(2) 실행 → int 2개짜리 생성자가 필요하므로 Triangle의 2개짜리 생성자가
		사용되었다. 그런데! 해당 생성자가 부모 클래스인 Shape의 2개짜리 생성자를 호출했으므로 결과적으로는 둘 다 사용되었다.
		참고로 부모 클래스가 순서적으로 먼저 우선시되기 때문에 부모 클래스의 생성자가 먼저 사용되었다.
		t3:생성자 Shape(2) 실행>생성자 Triangle(4) 실행 → 부모 클래스 생성자와 자식 클래스 생성자가 모두 사용되었다.
		이때, String 값 두 개가 모두 입력되었으므로 새로 값을 받을 수 있게 부모 생성자를 호출한 4개짜리 자식 클래스 생성자가 사용되었다.
		*/
	}

}

