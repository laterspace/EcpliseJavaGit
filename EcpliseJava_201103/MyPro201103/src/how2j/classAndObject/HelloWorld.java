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
			System.out.println("坦克");
			break;
		case WIZARD:
			System.out.println("法师");
			break;
		case ASSASSIN:
			System.out.println("刺客");
			break;
		case ASSIST:
			System.out.println("辅助");
			break;
		case WARRIOR:
			System.out.println("近战");
			break;
		case RANGED:
			System.out.println("远程");
			break;
		case PUSH:
			System.out.println("推进");
			break;
		case FARMING:
			System.out.println("打野");
			break;
		default:
			break;
		}
		System.out.println("我是分界线");
		for (HeroType t1 : HeroType.values()) {
			System.out.println(t1);
		}
		
	}
}
