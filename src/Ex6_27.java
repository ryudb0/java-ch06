
public class Ex6_27 {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public Ex6_27()  {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("Ex6_27 ex = new Ex6_27();");
		Ex6_27 ex = new Ex6_27();
		
		
		System.out.println("Ex6_27 ex2 = new Ex6_27();");
		Ex6_27 ex2 = new Ex6_27();
		
		
		
		
	}
}
