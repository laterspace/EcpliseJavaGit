package how2j.mathAndstring;

public class TestString3 {
	public static void main(String[] args) {

//        String str1 = "the light";
//         
//        String str2 = new String(str1);
//         
//        //==�����ж��Ƿ���ͬһ���ַ�������
//        System.out.println( str1  ==  str2);
//        
//        //String str1 = "the light";
//        String str3 = "the light";
//        System.out.println( str1  ==  str3);
//        
//        String start = "the";
//        String end = "ight";
//         
//        System.out.println(str1.startsWith(start));//��...��ʼ
//        System.out.println(str1.endsWith(end));//��...����

		String[] sx = new String[100];
		// �����ֵ
		String c = "";
		for (int i = 0; i < sx.length; i++) {
			for (int j = 0; j < 2; j++) {
				char[] cx = new char[2];
				cx[j] = (char) (Math.random() * 26 + 'a');
				if (Character.isLetter(cx[j])) {

					c += cx[j];
					if (j == 1) {
						System.out.print(" "+c);
					}

				}

			}

			if (sx.length % 20 == 0) {

				System.out.printf("%n");
			}
		}

	}
}
