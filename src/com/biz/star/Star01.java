package com.biz.star;

public class Star01 {

	public static void main(String[] args) {
		// 1부터 5까지 반복 코드
		for (int j = 0; j < 5; j++) {
			// 내부의 for는
			// i 값이 1씩 증가하는 동안
			// 총 5번의 반복을 실행한다.
			for (int i = 1; i <= 5; i++) {

				System.out.print("* ");

			}
			System.out.println();
		}

	}

}
