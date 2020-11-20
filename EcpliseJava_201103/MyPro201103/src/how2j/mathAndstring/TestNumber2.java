package how2j.mathAndstring;

public class TestNumber2 {
	public static void main(String[] args) {

		// 数字转字符串
		int i = 5;
		// 1
		String str = String.valueOf(i);
		System.out.println(str);

		// 2
		Integer it = i;
		String str2 = it.toString();
		System.out.println(str2);
		
		
		
		// 字符串转数字
		String str3 = "999";
		int i20=Integer.parseInt(str3);
		System.out.println(i20+str3.getClass().toString());
		
		System.out.println("练习::");
		float f=3.14f;
		str3=Float.toString(f);
		System.out.println("字符串:"+f);
		
		float fx=Float.parseFloat(str3);
		System.out.println("浮点数"+fx);
		
		String st="3.1a4";
		System.out.println(Float.MAX_VALUE);
		//fx=Float.parseFloat(st);
		//爆出数字格式异常
		System.out.println(st);
		

	}
}
