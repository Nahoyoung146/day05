package array_;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 100, 200, 300 };
		double[] dou = { 1.11, 2.22 };
		String[] str = { "aaa", "bbb", "ccc" };

//		for(int i=0;i<arr.length; i++);
		for (int a : arr) {
			System.out.println(a);
		}
		for (double d : dou) {
			System.out.println(d);
		}
		for (String s : str) {
			System.out.println(s);
		}
	}
}