package example;

import java.util.Arrays;

public class Ex6_20 {
	public static int[] shuffle(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int n = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i] = arr[n];
			arr[n] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
		
	}
}
