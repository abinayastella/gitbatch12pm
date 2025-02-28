package com.git;

public class Git {//class
	int i=10;//variable---1
	public void studentname() {// method-1
		System.out.println("abi");
	}

	public void studentid() {// method-2
		System.out.println(12);
	}

	public void studentlocation() {// method-3
		System.out.println("chennai");
	}

	public void studentnumber() {// method-4
		System.out.println(9876543211l);
	}

	public void studentemailid() {// method-5
		System.out.println("abi@gmail.com");
	}

	public void studentage() {// method-5
		System.out.println(20);
	
	}
	public static void main(String[] args) {
		//object syntax
		Git s = new Git();
		s.studentname();
		s.studentid();
		s.studentnumber();
		s.studentemailid();
		s.studentlocation();
		s.studentage();
	}
}
