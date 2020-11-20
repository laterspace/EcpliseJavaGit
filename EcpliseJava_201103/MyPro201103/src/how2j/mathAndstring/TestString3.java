package how2j.mathAndstring;

public class TestString3 {
	public static void main(String[] args) {

//        String str1 = "the light";
//         
//        String str2 = new String(str1);
//         
//        //==用于判断是否是同一个字符串对象
//        System.out.println( str1  ==  str2);
//        
//        //String str1 = "the light";
//        String str3 = "the light";
//        System.out.println( str1  ==  str3);
//        
//        String start = "the";
//        String end = "ight";
//         
//        System.out.println(str1.startsWith(start));//以...开始
//        System.out.println(str1.endsWith(end));//以...结束

		String[] sx = new String[100];
		// 随机赋值
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
