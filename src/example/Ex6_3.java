package example;

public class Ex6_3 {
	public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		
//		System.out.println("이름:"+s.name);
//		System.out.println("총점:"+s.getTotal());
//		System.out.println("평균:"+s.getAverage());
//		System.out.println("---------------------------------");
		
//		Ex6_5
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());
		
		
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	Student() {
		
	}
	
	String info() {
		return name+"," + ban+ ","+ no+","+ kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal()/(float)3*10+0.5)/10f;
	}
}