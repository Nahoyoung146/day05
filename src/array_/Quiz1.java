package array_;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
//		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };
//		for (int a : arr) {
//			if (a % 2 == 0)
//				System.out.println("짝수 : " + a);
//			else
//				System.out.println("홀수 : " + a);
//		}

//		Scanner input = new Scanner(System.in);
//		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };
//		String odd_even = null;
//		System.out.print("짝수, 홀수 입력 : ");
//		odd_even = input.next();
//		if (odd_even.equals("짝수")) {
//			for (int a : arr) {
//				if (a % 2 == 0)
//					System.out.println("짝수 : " + a);
//			}
//		} else {
//			for (int a : arr) {
//				if (a % 2 != 0)
//					System.out.println("홀수 : " + a);
//			}
//		}

		Scanner input = new Scanner(System.in);
		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };
		String odd_even = null;
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
	}
}