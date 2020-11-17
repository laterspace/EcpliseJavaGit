package charactor;

import charactor1.Support;
import property.Item;
import property.Mortal;

public class Hero extends Object {
	public String name; // 姓名

	protected float hp;// 血量

	float armor; // 护甲

	int moveSpeed = 2; // 移动速度
	static String copyright;

	public String toString() {
		return name;
	}

	// 类方法，静态方法
	// 通过类就可以直接调用
	public static void battleWin() {
		System.out.println("hero battle win");
	}

	public void useItem(Item i) {
		System.out.println("hero use item");
		i.effect();
	}

	public Hero() {
		System.out.println("Hero的构造方法 ");
	}

	public Hero(String name) {
		System.out.println("Hero一个参数的构造方法");
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
//	public void revive(Hero h) {
//		h = new Hero("提莫", 383);
//	}

	public void kill(Mortal m) {
		m.die();
	}

	public void finalize() {
		System.out.println("Recycle!!!");
	}

	public boolean equals(Object o) {
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			return this.hp == h.hp;
		}
		return false;
	}

	class BattleScore {
		int kill;
		int die;
		int assit;

		public void legendary() {
			if (kill >= 8)
				System.out.println(name + "超神!");
			else
				System.out.println(name + "尚未超神!");
		}

	}
//	static class EnemyCrystal{
//		int hp=5000;
//		
//		public void checkIfVictory() {
//			if (hp==0) {
//				Hero.battleWin();
//				//静态内部类不能直接访问外部类的对象属性
//				System.out.println(name + " win this game");
//			}
//		}
//	}
	
//	public abstract void attack();
	
	public static void main(String[] args) {

//		Hero h1 = new Hero();
//		h1.hp = 300;
//		Hero h2 = new Hero();
//		h2.hp = 400;
//		Hero h3 = new Hero();
//		h3.hp = 300;
//
//		System.out.println(h1.equals(h2));
//		System.out.println(h1.equals(h3));

//		Hero h = new Hero();
//		h.name = "盖伦";
//		System.out.println(h.toString());
//		// 直接打印对象就是打印该对象的toString()返回值
//		System.out.println(h);
//		Hero garen = new Hero();
//		Hero temoo1 = new ADHero();
//		Hero temoo2 = new APHero();
//		Hero temoo3 = new ADAPHero();
//
//		garen.kill((Mortal) temoo1);
//		garen.kill((Mortal) temoo2);
//		garen.kill((Mortal) temoo3);
//
//		Hero h = new ADHero();
//		h.battleWin();
		
//		Hero garen=new Hero();
//		garen.name="盖伦";
//		
//		BattleScore score = garen.new BattleScore();
//		score.kill=9;
//		score.legendary();
		
		
//		//实例化静态内部类
//        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
//        crystal.checkIfVictory();
		Hero h=new Hero() {
			
//			@Override
//			public void attack() {
//				// TODO Auto-generated method stub
//				System.out.println("xxxxxx");
//			}
		};
//		h.attack();
		

	}
}
