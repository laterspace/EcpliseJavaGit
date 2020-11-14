package charactor;

import charactor1.Support;

public class Hero {
	public String name; // 姓名

	protected float hp;// 血量

	float armor; // 护甲

	int moveSpeed; // 移动速度
	static String copyright;

	public Hero() {
		System.out.println("实例化一个对象的时候,必然条用构造方法");
	}

	public Hero(String name) {
//		System.out.println("一个参数的构造方法");
		this.name = name;
	}

	public Hero(String name, float hp) {
		this(name);
//		System.out.println("两个参数的构造方法");
		this.hp = hp;
	}

	// practice
	public Hero(String name, float hp, float armor, int moveSpeed) {
		this(name, hp);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
	}

	// 回血
	public void huixue(int xp) {
		hp = hp + xp;
		// 回血完毕后，血瓶=0
		xp = 0;
	}

	// 攻击一个英雄，并让他掉damage点血
	public void attack(Hero hero, int damage) {
		hero.hp = hero.hp - damage;
	}

	// 打印内存中的虚拟地址
	public void showAddressInMemory() {
		System.out.println("打印this看到的虚拟地址：" + this);
	}

	// 复活
	public void revive(Hero h) {
		h = new Hero("提莫", 383);
	}

	public static void main(String[] args) {
		Hero h = new Hero();

		ADHero ad = new ADHero();
		
		Support s = new Support();

		// 类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型

		// 把ad引用所指向的对象的类型是ADHero
		// h引用的类型是Hero
		// 把ADHero当做Hero使用，一定可以

		
		h = s;
		//h = ad;
		ad = (ADHero) h;
	}
}
