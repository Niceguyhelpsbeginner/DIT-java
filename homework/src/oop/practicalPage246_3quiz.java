package oop;

import java.util.Scanner;

class Grade {
	String name;
	int java;
	int web;
	int os;
	
	Grade(String name, int java,int web,int os){
		this.name = name;
		this.java = java;
		this.web = web;
		this.os = os;
		
	}
	String getName() {
		return name;
	}
	double getAverage() {
		return (double)(java + web + os)/3;
	}
}

public class practicalPage246_3quiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int java = scanner.nextInt();
		int web = scanner.nextInt();
		int os = scanner.nextInt();
		Grade st = new Grade(name,java,web,os);
		System.out.println(st.getName() + "'s average is "+ st.getAverage());
	}
}
