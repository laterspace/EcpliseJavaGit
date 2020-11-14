package charactor1;

public class Hero {
	// ˽�л����췽��
	private Hero() {
	}

	// ������ָ��һ��ʵ��
	private static Hero instance = new Hero();

	// ���ؾ�̬����
	public static Hero getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		// Hero h=new Hero();

		Hero h1 = Hero.getInstance();
		Hero h2 = Hero.getInstance();
		Hero h3 = Hero.getInstance();

		System.out.println(h1 == h2);
		System.out.println(h2 == h3);
	}
}
