package charactor;

import property.Mortal;

public class ADAPHero extends Hero implements AD, AP, Mortal {

	@Override
	public void magicAttack() {
		// TODO Auto-generated method stub
		System.out.println("进行魔法攻击");
	}

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("进行物理攻击");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("ADAP die!!!");
	}



}
