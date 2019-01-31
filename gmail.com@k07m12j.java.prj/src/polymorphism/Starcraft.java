package polymorphism;


// 상속관계를 만들기 위한 클래스이므로 객체 생성을 못하도록 abstract class로 만듦
public interface Starcraft {
	// 오버라이딩을 위해서 메소드 추가
	// 실제 이 메소드 호출은 안 함
	// 이런 메소드는 내용이 있을 필요가 없음
	// 이런 경우 abstract 메소드를 만듦
	// 메소드 결과형 앞에 abstract를 추가하면 됨
	// 이 메소드는 abstract class나 interface에만 존재해야 함
	// 상속받은 곳에서 반드시 오버라이딩 해야 함
	
	
	// 인터페이스 안에서는 abstract 가 없어도 추상메소드임
	 public void attack(); 
	/* { // abstract 메소드 만듦 -> { } 부분 없앰
		System.out.println("Starcraft의 attack");
	} */
	
	 
	 
	// public final void attack() {} // 저그, 테란, 프로토스.java에서 error = final 메소드 : 오버라이딩 못해서
	
}
