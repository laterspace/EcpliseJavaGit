package how2j.practice;

import java.util.Scanner;

public class TesrBMI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please input your height(m):");
		float height = s.nextFloat();
		System.out.println("please input your weight(kg):");
		float weight = s.nextFloat();
		s.close();

		float bmi = weight / (height * height);
		System.out.println("当前的BMI是:" + bmi);
		if (bmi < 18.5) {
			System.out.println("身体状态是:体重过轻");
		} else if (18.5 <= bmi && bmi < 24) {
			System.out.println("身体状态是:正常范围");
		} else if (24 <= bmi && bmi < 27) {
			System.out.println("身体状态是:体重过重");
		} else if (27 <= bmi && bmi < 30) {
			System.out.println("身体状态是:轻度肥胖");
		} else if (30 <= bmi && bmi < 35) {
			System.out.println("身体状态是:中毒肥胖");
		} else if (35 <= bmi) {
			System.out.println("身体状态是:重度肥胖");
		}

	}
}
