package how2j.mathAndstring;

public class TestString4 {
	public static void main(String[] args) {
//		String str1="let there";
//		StringBuffer sb = new StringBuffer(str1);
//		
//		sb.append("be light");
//		
//		System.out.println(sb);
//		sb.delete(4, 10);
//		System.out.println(sb);
//		
//		
//		sb.insert(4, "there ");
//		System.out.println(sb);
//		
//		sb.reverse();
//		System.out.println(sb);
//		
//		
//		System.out.println(sb.length());//���ݳ���
//		System.out.println(sb.capacity());//�ܿռ�
		
		
		int max=10000;
		String str3=randomString(10);
		long start1 = System.currentTimeMillis();
		String str2="";
		for(int i=1;i<=max;i++){//.java�� ��̬����������ֱ�ӵ��÷Ǿ�̬�����ͳ�Ա��Ҳ����ʹ��this�ؼ���
			
			str2+=str3;
		}
		long end1=System.currentTimeMillis();
		System.out.println("ʹ��String��+,����10000������ַ���,���ģ�"+(end1-start1)+"s");
		
		
		//��ʹ��StringBuffer����10000������ַ���,�������ĵ�ʱ��
		long start2 = System.currentTimeMillis();
		StringBuffer str5 = new StringBuffer(str2);
		max*=100;
		for(int i =1;i<=max;i++){
			str5.append(str3);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("ʹ��StringBuffer����1000000������ַ���,���ģ�"+(end2-start2)+"s");

		
		
		
		
		
		
//		StringBuffer sb2 = new StringBuffer("the");
//		System.out.println(sb2.capacity());
//		System.out.println(sb2.length());
	}
	
	private static String randomString(int length) {
		String str1="";
		for (int i = 'A'; i < 'Z'; i++) {
			str1+=i;
		}
		for (int i = '0'; i < '9'; i++) {
			str1+=i;
		}
		
		for (int i = 'a'; i < 'z'; i++) {
			str1+=i;
		}
		
		
		
		char[] c = new char[length];
		for (int j = 0; j < c.length; j++) {
			int index=(int)(Math.random()*str1.length());
			c[j]=str1.charAt(index);
		}
		String result=new String(c);
		return result;
	}
}
