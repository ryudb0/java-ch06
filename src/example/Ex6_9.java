package example;

class Marine {
	int x=0, y=0;				// Marine의 위치좌표
	int hp = 60;				// 현재 체력
	static int weapon = 6;		// 공격력
	static int armor = 0;		// 방어력
	
	static void weaponUp() {
		weapon++;
	}
	
	static void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
	
//	공격력과 방어력은 모든 마린이 공통적으로 가져야하므로
//	static변수를 선언해야한다
//	그리고 인스턴스 변수를 사용하지않는 메서드는 클래스 메서드로 변환해야한다.
public class Ex6_9 {
	
//	Ex6_10
//	b, e
	
//	Ex6_11
//	b,
	
//	Ex6_12   틀렸음 d도 포함
//	c, 
	
//	Ex6_13
//	b, c, d
	
//	Ex6_14
//	c, e
	
//	Ex6_15
//	a
	
//	Ex6_16
//	a, e
	
//	Ex6_17
//	b, 
	
}
