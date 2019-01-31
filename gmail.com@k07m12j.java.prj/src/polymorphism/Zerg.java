package polymorphism;

public class Zerg implements Starcraft {
	public void attack() {
		System.out.println("저그의 공격");
	}
	
	// 추상 abstract 메소드 : { } 안의 내용 없는 메소드
	// public abstract void attack2();
}
