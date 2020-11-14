package charactor1;

public class Hero {
	// 私有化构造方法
	private Hero() {
	}

	// 类属性指向一个实例
	private static Hero instance = new Hero();

	// 返回静态属性
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
