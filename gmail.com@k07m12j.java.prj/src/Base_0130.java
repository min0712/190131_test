
public class Base_0130 {
	// �Ű������� ���� ������
	/* public Base_0130() {
		System.out.println("���� Ŭ������ �Ű������� ���� ������");
	}*/
	// �Ű������� �ִ� ������
	// �Ű������� ���� �����ڰ� ���� Ŭ������ ��ӹ����� �⺻������ error
	// �ڽ��� ���� Ŭ������� �Ű������� ���� �����ڸ� �߰��ϴ� ���� ����
	// �����Ǵ� Ŭ������� ��ӹ޴� Ŭ�������� �����ڸ� ���� �� super�� �̿��ؼ� ���� Ŭ������ �����ڸ� ȣ���� �־�� ��
	public Base_0130(int a) {
		System.out.println("���� Ŭ������ �Ű������� �ִ� ������");
	}
	
	
	// private : �ڽ��� Ŭ���� ���ο����� ��� ����
	// ����� ������ ���� Ŭ�������� ���� �Ұ���
	// �ν��Ͻ��� ���� �Ұ���
	private void disp() {
		System.out.println("private �޼ҵ�");
	}
	
	// public : �ڽ��� Ŭ���� �� ���� Ŭ������ �׸��� �ν��Ͻ��� ��� ����
	public void print() {
		System.out.println("public �޼ҵ�");
	}
	
}