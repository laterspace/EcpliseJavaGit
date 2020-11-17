package charactor;

import property.Mortal;

public class APHero extends Hero implements AP, Mortal {

	@Override
	public void magicAttack() {
		// TODO Auto-generated method stub
		System.out.println("½øÐÐÄ§·¨¹¥»÷");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("AP die!!!");
	}

}
