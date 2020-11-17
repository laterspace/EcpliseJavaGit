package property;

import charactor.Hero;

public class MagicPotion extends Item {
	@Override
	public void effect() {
		System.out.println("蓝瓶使用后，可以回魔法");
	}

	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
