package polymorphism;

public class Main {

	public static void main(String[] args) {
		// ������ ����
		Starcraft star = new Zerg();
		star.attack();
		
		// �׶��� ����
		star = new Terran();
		star.attack();
		
		// �����佺�� ����
		star = new Protoss();
		star.attack();
		
		// starcraft�� �Ϲ� Ŭ������� �ν��Ͻ� ���� ����
		// but, starcraft�� ��Ӱ��踦 ����� ���� Ŭ�����̰�, ���� ����� Ŭ������ �ƴ�. �ν��Ͻ� ������ ���ϵ��� �ؾ���
		// => class �տ� abstract�� �߰���
		// abstract Ŭ������ ��ü�� �����Ϸ��� �ϸ� �ν��Ͻ��� �� �� ���ٰ� ���� �߻�
		// star = new Starcraft();
		
		final int a = 10;
		// final ������ ���� �Ұ�
		//=> a = 20; �Ұ���
		
		
		
	}

}
