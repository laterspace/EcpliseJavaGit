package charactor;

import charactor1.Support;
import property.Item;
import property.Mortal;

public class Hero extends Object {
	public String name; // ����

	protected float hp;// Ѫ��

	float armor; // ����

	int moveSpeed = 2; // �ƶ��ٶ�
	static String copyright;

	public String toString() {
		return name;
	}

	// �෽������̬����
	// ͨ����Ϳ���ֱ�ӵ���
	public static void battleWin() {
		System.out.println("hero battle win");
	}

	public void useItem(Item i) {
		System.out.println("hero use item");
		i.effect();
	}

	public Hero() {
		System.out.println("Hero�Ĺ��췽�� ");
	}

	public Hero(String name) {
		System.out.println("Heroһ�������Ĺ��췽��");
		this.name = name;
	}

	public Hero(String name, float hp) {
		this(name);
//		System.out.println("���������Ĺ��췽��");
		this.hp = hp;
	}

	// practice
	public Hero(String name, float hp, float armor, int moveSpeed) {
		this(name, hp);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
	}

	// ��Ѫ
	public void huixue(int xp) {
		hp = hp + xp;
		// ��Ѫ��Ϻ�Ѫƿ=0
		xp = 0;
	}

	// ����һ��Ӣ�ۣ���������damage��Ѫ
	public void attack(Hero hero, int damage) {
		hero.hp = hero.hp - damage;
	}

	// ��ӡ�ڴ��е������ַ
	public void showAddressInMemory() {
		System.out.println("��ӡthis�����������ַ��" + this);
	}

	// ����
//	public void revive(Hero h) {
//		h = new Hero("��Ī", 383);
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
				System.out.println(name + "����!");
			else
				System.out.println(name + "��δ����!");
		}

	}
//	static class EnemyCrystal{
//		int hp=5000;
//		
//		public void checkIfVictory() {
//			if (hp==0) {
//				Hero.battleWin();
//				//��̬�ڲ��಻��ֱ�ӷ����ⲿ��Ķ�������
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
//		h.name = "����";
//		System.out.println(h.toString());
//		// ֱ�Ӵ�ӡ������Ǵ�ӡ�ö����toString()����ֵ
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
//		garen.name="����";
//		
//		BattleScore score = garen.new BattleScore();
//		score.kill=9;
//		score.legendary();
		
		
//		//ʵ������̬�ڲ���
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
