package array_;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		System.out.println("1. 배열의 짝수, 홀수 값을 따로 출력");
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };
		for (int a : arr) {
			if (a % 2 == 0)
				System.out.println("짝수 : " + a);
			else
				System.out.println("홀수 : " + a);
		}
		System.out.println("====================================");

		System.out.println("2. 짝수, 홀수를 입력받아 따로 출력");
		System.out.print("짝수, 홀수 입력 : ");
		String odd_even = input.next();
		if (odd_even.equals("짝수")) {
			for (int a : arr) {
				if (a % 2 == 0)
					System.out.println("짝수 : " + a);
			}
		} else {
			for (int a : arr) {
				if (a % 2 != 0)
					System.out.println("홀수 : " + a);
			}
		}
		System.out.println("====================================");

		System.out.println("3. 짝수, 홀수를 입력받고 index가 짝수, 홀수인 값을 출력");
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next();
		if (odd_even.equals("짝수")) {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0)
					System.out.println(arr[i]);
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 != 0)
					System.out.println(arr[i]);
			}
		}

		System.out.println("------다른 방법1------");
		int k;
		if (odd_even.equals("짝")) {
			k = 0;
		} else {
			k = 1;
		}
		for (; k < arr.length; k += 2) {
			System.out.println(arr[k]);
		}

		System.out.println("------다른 방법2------");
		// 변수 = (식) ? 참 : 거짓;
		for (k = odd_even.equals("짝") ? 0 : 1; k < arr.length; k += 2) {
			System.out.println(arr[k]);
		}
	}
}