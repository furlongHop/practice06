package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		
		User[] uArray = new User[3];
		
		User u1 = new Customer("jws","j1234","정우성",1000);
		User u2 = new Customer("yjs","y2345","유재석",2000);
		User u3 = new Employee("master","m7788","운영자",5000000);
		
		uArray[0]=u1;
		uArray[1]=u2;
		uArray[2]=u3;
		
		for(int i=0;i<uArray.length;i++){
			uArray[i].showInfo();
		}
	}

}
