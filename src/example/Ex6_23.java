package example;

import java.util.Arrays;

public class Ex6_23 {
	public static int max(int[] arr) {
		int tmp = 0;
		if(arr==null || arr.length==0) {
			tmp = -999999;
		} else {
			tmp = arr[0];
			for(int i=1; i<arr.length; i++) {
				if(tmp < arr[i]) {
					tmp = arr[i];
				}
			}
		}
		
		return tmp;
	}
	
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7 };
		System.out.println(Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {}));
		
		
	}
}
