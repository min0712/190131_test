
public class Main_0130 {

	public static void main(String[] args) {
		// ���� Ŭ������ �ν��Ͻ� ���� - Base
		Base_0130 b = new Base_0130(20);
		b.print();
		
		// ���� Ŭ������ �ν��Ͻ� ���� - Derived
		// �ڽ��� public �޼ҵ�� Base�� public �޼ҵ� ��� ����
		// ���� Ŭ������ �ν��Ͻ��� �����ϸ�, ���� Ŭ������ �����ڸ� ȣ���ؼ� ���� Ŭ������ �ν��Ͻ� �κ��� �����, ���� Ŭ������ �����ڸ� ȣ���ؼ� ���� Ŭ������ �ν��Ͻ� �κ��� ������
		Derived d = new Derived();
		d.print();
		d.display();

	}

}
