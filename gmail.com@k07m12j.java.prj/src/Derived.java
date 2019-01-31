
public class Derived extends Base_0130 {
	//public class Derived extends Base_0130, Object { } = error임
	
	
	
	
	
	// 눈에 보이지는 않지만 아래와 같은 생성자가 있음
	public Derived() {
		// 상위 클래스의 매개변수가 정수 1개인 생성자를 호출
		super(10); // new Base_0130()을 호출
	}
	
	int a = 10;
	public void display() {
		System.out.println("하위 클래스의 메소드");
		// this. 으로 disp() 부를 수 없다. private 이므로
		
		int a = 20;
		// 아무것도 붙지 않았으므로 메소드 안에서부터 찾음 : 20
		System.out.println("a : " + a);
		// this. 이 붙이면 메소드 안에서는 찾지 않음 : 10
		System.out.println("this.a : " + this.a);
		
		// super. = base에 가서만 찾음
	}
	
	
}
