package array_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = new int[5];
//		arr = [0,0,0,0,0]
//		index=>0 1 2 3 4
		arr[3] = 4000;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		double n = 1.111;
		double dos[] = new double[] { n, 2.22, 3.33 };
//		dos = [1.11 2.22.3.33]
//		index    0   1    2
		for (int i = 0; i < 3; i++) {
			System.out.println(i + " : " + dos[i]);
		}
		System.out.println("length : " + dos.length);

		System.out.println("----------------------------");

		String[] str = new String[3];
		System.out.println("str[0] : " + str[0]);
		System.out.println("str.length : " + str.length);

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < str.length; i++) {
			System.out.print(i + ".번째 입력");
			str[i] = input.next();
		}
		System.out.println("------출력------");
		for (int i = 0; i < str.length; i++) {
			System.out.println(i + " ." + str[i]);
		}
	}
}