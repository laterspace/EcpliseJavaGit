package charactor;

import property.Item;
import property.LifePotion;
import property.Mortal;

public class ADHero extends Hero implements AD, Mortal {

	int moveSpeed = 3;

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("AD die!!!");
	}

	public static void battleWin() {
		System.out.println("ad hero battle win");
	}
	
	
	public ADHero() {

		System.out.println("AD Hero�Ĺ��췽��");
	}

	public ADHero(String name) {
		super(name);
		System.out.println("AD Hero�Ĺ��췽��x");
	}

	public int getMoveSpeed() {
		return this.moveSpeed;
	}

	public int getMoveSpeed2() {
		return super.moveSpeed;
	}

	public void useItem(Item i) {
		System.out.println("adhero use item");
		super.useItem(i);
	}

	public static void main(String[] args) {
		ADHero h = new ADHero();
//		System.out.println(h.getMoveSpeed());
//		System.out.println(h.getMoveSpeed2());

		LifePotion lp = new LifePotion();
		h.useItem(lp);
	}

//	public void attack() {
//		System.out.println(name + "������һ�ι��� �����ǲ�ȷ������˭��");
//	}
//
//	public void attack(Hero... heros) {
//		for (int i = 0; i < heros.length; i++) {
//			System.out.println(name + "������" + heros[i].name);
//		}
//
//	}
//
//	public static void main(String[] args) {
//		ADHero bh = new ADHero();
//		bh.name = "�ͽ�����";
//		Hero h1 = new Hero();
//		h1.name = "����";
//		Hero h2 = new Hero();
//		h2.name = "��Ī";
//
//		bh.attack(h1);
//		bh.attack(h1, h2);
//	}

}
