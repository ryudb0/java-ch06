package example;

public class Ex6_18 {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; 		객체생성없이 iv 참조불가  A
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);  객체생성없이 iv 참조불가 B
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();		객체생성없이 인스턴스메서드 호출불가 D
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
