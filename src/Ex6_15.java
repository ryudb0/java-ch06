
public class Ex6_15 {
	public static void main(String[] args) {
		int result = factorial(3);
		System.out.println(result);
		
	}
	
	static int factorial(int n) {
		if(n<= 0 || n > 12 ) return -1;
		int result = 0;
		
		if(n ==1) {
			result = 1;
		} else {
			result = n * factorial(--n);
		}
		return result;
	}
}
