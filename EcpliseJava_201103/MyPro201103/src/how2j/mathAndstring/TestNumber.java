package how2j.mathAndstring;

public class TestNumber {
	public static void main(String[] args) {
		int i = 5;
		// ��������ת���ɷ�װ����
		Integer it = new Integer(i);

		// ��װ����ת���ɻ�������
		int i2 = it.intValue();

		// �Զ�ת���ͽ�װ��
		Integer it2 = i;

		// �Զ�ת���ͽв���
		int i3 = it;
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(it instanceof Number);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Byte.MAX_VALUE);
	}
}
