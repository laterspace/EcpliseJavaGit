package how2j.mathAndstring;

public class MyStringBuffer implements IStringBuffer {

	int capacity = 16;
	int length = 0;
	char[] value;

	// �޲ι���
	public MyStringBuffer() {
		value = new char[capacity];
	}

	// �вι���
	public MyStringBuffer(String str) {
		this();
		if (null != str)
			value = str.toCharArray();
		length = value.length;
		if (capacity < value.length) {
			capacity = value.length * 2;
		value=new char[capacity];}
		
		if(capacity>=str.length())
            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
          
        length = str.length();
	}// ??

	@Override
	public void append(String str) {
		// TODO Auto-generated method stub
		System.out.println("�˷�������ĩβ׷���ַ���");
		String s = "123xx";// �����á�������Ϊԭ�ַ�����
		s += str;
		System.out.print(s);
	}

	@Override
	public void append(char c) {
		// TODO Auto-generated method stub
		System.out.println("�˷�������ĩβ׷���ַ���");
		String s = "123xx";// �����á�������Ϊԭ�ַ�����
		s += c;
		System.out.println(s);
	}

	@Override
	public void insert(int pos, char b) {
		// TODO Auto-generated method stub
		String s = "i can do it!";
		String s2 = "";
		String s3 = "";

		char[] c = s.toCharArray();

		for (int i = 0; i < pos; i++) {
			s2 += c[i];

		}

		for (int i = 0; i < c.length; i++) {

		}

	}

	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub
		// �߽������ж�
		if (pos < 0)
			return;
		if (pos > length)
			return;
		if (b == null)
			return;

		// ����
		while (length + b.length() > capacity) {
			capacity = (int) ((length + b.length()) * 1.5f);
			char[] newValue = new char[capacity];
			System.arraycopy(value, 0, newValue, 0, length);
			value = newValue;
		}
		char[] cs = b.toCharArray();

		// �Ȱ��Ѿ����ڵ�����������
		//System.arraycopy(value, pos, value, pos + cs.length, length - pos);
		System.arraycopy(value, pos, value, pos + cs.length, length - pos);
		// ��Ҫ��������ݲ��뵽ָ��λ��
		System.arraycopy(cs, 0, value, pos, cs.length);

		length = length + cs.length;

	}

	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub
		if (start < 0)
			return;
		if (start > length)
			return;
		if (end < 0)
			return;
		if (start > length)
			return;
		if (start >= end)
			return;

		System.arraycopy(value, end, value, start, length - end);
		length -= end - start;

	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		for (int i = 0; i < length / 2; i++) {
			char temp = value[i];
			value[i] = value[length - 1 - i];
			value[length - 1 - i] = temp;
		}

	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		MyStringBuffer sb = new MyStringBuffer("there light");
		System.out.println(sb);
		sb.insert(0, "let ");
		System.out.println(sb);

		sb.insert(10, "be ");
		System.out.println(sb);
		sb.insert(0, "God Say:");
		System.out.println(sb);
		sb.append("!");
		System.out.println(sb);
		sb.append('?');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		sb.delete(0, 4);
		System.out.println(sb);
		sb.delete(4);
		System.out.println(sb);
	}

}
