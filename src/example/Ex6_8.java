package example;

class PlayCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayCard(int k, int n) {
		kind = k;
		num = n;
	}
}

public class Ex6_8 {
	public static void main(String[] args) {
		PlayCard card = new PlayCard(1, 1);
	}
}

//		클래스변수: width, height
//		인스턴스변수: kind, num
//		지역변수: k, n, card, args