package charactor1;
import charactor.Healer;
import charactor.Hero;

public class Support extends Hero implements Healer{

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void heal(Hero h) {
//		System.out.println(name + "����" + h.name + "����");
//	}
//
//	public void heal(Hero... heros) {
//		for (int i = 0; i < heros.length; i++) {
//			System.out.println(name + "������" + heros[i].name);
//		}
//	}
//
//	public void heal(Hero h, int hp) {
//		System.out.println(name + "��" + h.name + "����" + hp + "hp");
//	}
//
//	public static void main(String[] args) {
//		Support s = new Support();
//		s.name = "�ͽ�����";
//
//		Hero h3 = new Hero();
//		h3.name = "����";
//		Hero h2 = new Hero();
//		h2.name = "��Ī";
//		
//		s.heal(h2);
//		s.heal(h3, 0);
//		s.heal(h2,h3);
//
//	}

}
