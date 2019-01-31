package polymorphism;

public class Main {

	public static void main(String[] args) {
		// 저그의 공격
		Starcraft star = new Zerg();
		star.attack();
		
		// 테란의 공격
		star = new Terran();
		star.attack();
		
		// 프로토스의 공격
		star = new Protoss();
		star.attack();
		
		// starcraft가 일반 클래스라면 인스턴스 생성 가능
		// but, starcraft는 상속관계를 만들기 위한 클래스이고, 실제 사용할 클래스가 아님. 인스턴스 생성을 못하도록 해야함
		// => class 앞에 abstract를 추가함
		// abstract 클래스의 객체를 생성하려고 하면 인스턴스를 할 수 없다고 에러 발생
		// star = new Starcraft();
		
		final int a = 10;
		// final 변수는 수정 불가
		//=> a = 20; 불가능
		
		
		
	}

}
