package com.javaex.ex03;

public class Shape {
	
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//1.필드 오류: private로 부모 클래스의 필드가 보호되어 있어 자식 클래스에서 인식되지 못했다.
	//그래서 부모 클래스 필드의 접근제한자를 protected로 수정하여 자식 클래스에서도 인식할 수 있게 해주었다.  
	
	//생성자
	public Shape() {
		
	}
	//2. 생성자 오류: 부모 클래스의 기본 생성자가 존재하지 않아 자식 클래스의 생성자를 사용하는 과정에 오류가 있었다.
	//그래서 사라진 부모 클래스의 기본 생성자를 직접 만들어 주었다.
	
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드 setter
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
	
	
}

