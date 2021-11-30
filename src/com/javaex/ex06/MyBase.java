package com.javaex.ex06;

public class MyBase extends Base{

    //메소드 오버라이딩 문제
    public void service(String state) {

        if (state.equals("낮")) { 
            day();
        }if (state.equals("오후")) {
        	afternoon();
        } if(state.equals("밤")) {
        	night();
        } else {
        	
        }
    }

    public void afternoon() {
    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
    
    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

}

   
