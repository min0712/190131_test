
public class Derived extends Base_0130 {
	//public class Derived extends Base_0130, Object { } = error��
	
	
	
	
	
	// ���� �������� ������ �Ʒ��� ���� �����ڰ� ����
	public Derived() {
		// ���� Ŭ������ �Ű������� ���� 1���� �����ڸ� ȣ��
		super(10); // new Base_0130()�� ȣ��
	}
	
	int a = 10;
	public void display() {
		System.out.println("���� Ŭ������ �޼ҵ�");
		// this. ���� disp() �θ� �� ����. private �̹Ƿ�
		
		int a = 20;
		// �ƹ��͵� ���� �ʾ����Ƿ� �޼ҵ� �ȿ������� ã�� : 20
		System.out.println("a : " + a);
		// this. �� ���̸� �޼ҵ� �ȿ����� ã�� ���� : 10
		System.out.println("this.a : " + this.a);
		
		// super. = base�� ������ ã��
	}
	
	
}
