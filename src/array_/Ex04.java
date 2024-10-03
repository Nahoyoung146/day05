package array_;

public class Ex04 {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 10, 20, 30, 40 }, { 100, 200, 300, 400 } };
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);

		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);

		for (int i = 0; i < 3; i++) {// i<arr.length
//			System.out.println(i);
			for (int j = 0; j < 4; j++) {// j<arr[i].length
				System.out.print(i + " , " + j + " => ");
				System.out.println(arr[i][j]);
			}

			System.out.println("arr.length : " + arr.length);
			System.out.println("arr[].length : " + arr[0].length);
		}

		for (int i = 0; i < arr.length; i++) {// i<arr.length
//			System.out.println(i);
			for (int j = 0; j < arr[i].length; j++) {// j<arr[i].length
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}