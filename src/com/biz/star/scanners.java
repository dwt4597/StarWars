package com.biz.star;
import java.util.Scanner;
public class scanners {
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
	System.out.print("두 수를 입력해라:");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	System.out.println("첫째값 : " + a);
	int b = scanner.nextInt();
	System.out.println("둘째값 : " + b);
	
	System.out.println("덧셈++++++++++");
	dutsem(a,b);
	System.out.println("곱셈**********");
	gobsem(a,b);
	
}
public static void dutsem(int i, int j) {
	int sum = i + j ;
	System.out.println(i+ "+" + j + "="+ sum);
	
}

public static void gobsem(int i , int j) {
	int summ = i * j;
	System.out.println(i+ "*" + j + "=" + summ);
}

}