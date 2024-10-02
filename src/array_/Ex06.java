package array_;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		String[] n = new String[3];
		int count = 0;
		Scanner input = new Scanner(System.in);
		while (true) {
			while (count < n.length) {
				System.out.println(count + " . " + n[count]);
				if (n[count] == null) {
					System.out.println(count + ".번째 입력");
					n[count] = input.next();
					break;
				}
				count++;

			}
			System.out.println("-------------------------");
			System.out.println("cnt : " + count);
			System.out.println("n.length : " + n.length);
		}
	}
}