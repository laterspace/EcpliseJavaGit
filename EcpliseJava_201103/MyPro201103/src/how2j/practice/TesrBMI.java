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
		System.out.println("��ǰ��BMI��:" + bmi);
		if (bmi < 18.5) {
			System.out.println("����״̬��:���ع���");
		} else if (18.5 <= bmi && bmi < 24) {
			System.out.println("����״̬��:������Χ");
		} else if (24 <= bmi && bmi < 27) {
			System.out.println("����״̬��:���ع���");
		} else if (27 <= bmi && bmi < 30) {
			System.out.println("����״̬��:��ȷ���");
		} else if (30 <= bmi && bmi < 35) {
			System.out.println("����״̬��:�ж�����");
		} else if (35 <= bmi) {
			System.out.println("����״̬��:�ضȷ���");
		}

	}
}
