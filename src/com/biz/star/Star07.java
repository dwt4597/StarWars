package com.biz.star;
import java.util.Scanner;
public class Star07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음에 나열된 두 숫자의 덧셈, 곱셈을
		 * 계산하여 콘솔에 보여주는 코드를 
		 * 작성하시오
		 * 30,40
		 * 50,20
		 * 100,200
		 * 3,100
		 * 5,20
		 * 
		 */
		//Scanner scanner = new Scanner(system.in);
		//int a = scanner.nextInt();
		//int b = scanner.nextInt();
		//dutsem(a,b);
		//gobsem(a,b);
		System.out.println("덧셈++++++++++");
		dutsem(30,40);
		dutsem(50,20);
		dutsem(100,200);
		dutsem(3,100);
		dutsem(5,20);
		System.out.println("곱셈**********");
		gobsem(30,40);
		gobsem(50,20);
		gobsem(100,200);
		gobsem(3,100);
		gobsem(5,20);
		
	}
	public static void dutsem(int i, int j) {
		int sum = i + j ;
		System.out.println(i+ "+" + j + "="+ sum);
		
	}
	
	public static void gobsem(int i , int j) {
		int sum = i * j;
		System.out.println(i+ "*" + j + "=" + sum);
	}

}
