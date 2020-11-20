package how2j.mathAndstring;

public class TestNumber {
	public static void main(String[] args) {
		int i = 5;
		// 基本类型转换成封装类型
		Integer it = new Integer(i);

		// 封装类型转换成基本类型
		int i2 = it.intValue();

		// 自动转换就叫装箱
		Integer it2 = i;

		// 自动转换就叫拆箱
		int i3 = it;
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(it instanceof Number);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Byte.MAX_VALUE);
	}
}
