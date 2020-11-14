package charactor1;
import charactor.Healer;
import charactor.Hero;

public class Support extends Hero implements Healer{

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println("进行治疗");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void heal(Hero h) {
//		System.out.println(name + "给了" + h.name + "治疗");
//	}
//
//	public void heal(Hero... heros) {
//		for (int i = 0; i < heros.length; i++) {
//			System.out.println(name + "治疗了" + heros[i].name);
//		}
//	}
//
//	public void heal(Hero h, int hp) {
//		System.out.println(name + "给" + h.name + "加了" + hp + "hp");
//	}
//
//	public static void main(String[] args) {
//		Support s = new Support();
//		s.name = "赏金猎人";
//
//		Hero h3 = new Hero();
//		h3.name = "盖伦";
//		Hero h2 = new Hero();
//		h2.name = "提莫";
//		
//		s.heal(h2);
//		s.heal(h3, 0);
//		s.heal(h2,h3);
//
//	}

}
