package studyJava.middle;

class Tv {
	boolean power; // 전원상태
	int channel; // 채널
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}

class CaptionTv extends Tv {
	
	String text; // 캡션 내용
	void caption() {}
}

public class Java13_poly {

	public static void main(String[] args) {
		// 다형성(polymorphism)
		// 사전적의 의미 : 여러개 형태를 취할 수 있는 능력
		// P/G적 의미 : 상속관계에 있을 경우 조상의 참조변수로 자손 타입의 객체를 다룰 수 있다
		
//		Tv t = new Tv(); 5개 요소를 다룰 수 있다
//		CaptionTv c = new CaptionTv(); 7개의 요소를 다룰 수 있다
		
		Tv t = new CaptionTv(); // 다형성
		// 다형성 : 부모타입(Tv)의 참조변수가 자손타입의 객체(CaptionTv)를 다룰 수 있다
		// 부모타입의 참조변수일 지라도 자손타입의 모든 요소를 다룰 수는 없고
		// 부모타입의 멤버요소만 다룰 수 있다
		t.power = false;
		t.channel = 17;
		t.channelUp();
		t.channelDown();
		
		// t.text; 에러
		// t.captio(); 에러
		
		// 참조변수가 조상타입일 때 자손타입일 때의 차이점은?
		// 참조변수로 사용할 수 있는 멤버의 갯수가 달라진다
		
//		CaptionTv c = new Tv(); 에러
		// 자손타입의 참조변수로 조상타입의 객체를 다룰 수 없다
		
		// 참조변수의 형변환
		int b = 10;
		double a = (double)b;
		double c = b;
		
		CaptionTv ct = (CaptionTv)new Tv(); // 다운 캐스팅 (부모 -> 자식) : 부모요소 5개 + 자식 요소 2개 총 7개 사용 가능
		ct.channel = 11;
		ct.power = false;
		ct.text = "꽁냥 꽁냥";
		ct.caption();
		ct.channelDown();
		ct.channelUp();
		ct.power();
		
		Tv tv = ct; // 업 캐스팅(자식 -> 부모) : 부모요소 5개만 사용가능
		tv.channel = 22;
		tv.power = true;
		tv.channelDown();
		tv.channelUp();
		tv.power();
		
//		tv.text = "aaa";
//		tv.caption();
		// 부모 참조 변수로 자식요소를 다룰 수 없다
		
		// Product 설계도를 만들어 매개변수의 다형성을 알아보자
		

	}

}
