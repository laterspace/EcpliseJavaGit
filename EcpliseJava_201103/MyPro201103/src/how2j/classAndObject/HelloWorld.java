package how2j.classAndObject;

public class HelloWorld {
	public static void main(String[] args) {
//		Season season=Season.WINTER;
//		switch (season) {
//		case SPRING:
//			System.out.println("spring");
//			break;
//		case SUMMER:
//			System.out.println("summer");
//			break;
//		case AUTUMN:
//			System.out.println("autumn");
//			break;
//		case WINTER:
//			System.out.println("winter");
//			break;
//		}
//		for (Season s : Season.values()) {
//			System.out.println(s);
//		}
		
		HeroType t=HeroType.ASSIST;
		switch (t) {
		case TANK:
			System.out.println("̹��");
			break;
		case WIZARD:
			System.out.println("��ʦ");
			break;
		case ASSASSIN:
			System.out.println("�̿�");
			break;
		case ASSIST:
			System.out.println("����");
			break;
		case WARRIOR:
			System.out.println("��ս");
			break;
		case RANGED:
			System.out.println("Զ��");
			break;
		case PUSH:
			System.out.println("�ƽ�");
			break;
		case FARMING:
			System.out.println("��Ұ");
			break;
		default:
			break;
		}
		System.out.println("���Ƿֽ���");
		for (HeroType t1 : HeroType.values()) {
			System.out.println(t1);
		}
		
	}
}
