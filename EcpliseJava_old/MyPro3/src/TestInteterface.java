
public class TestInteterface {
	public static void main(String[] args) {
		Volant volant=new Angel();
		volant.fly();
		System.out.println(Volant.FLY_HIGHT);
		
		Honest honest = new GoodMan2();
		honest.helpOther();
		
	}
}

/**���нӿ�*/
interface Volant{
	int FLY_HIGHT=100; //����:public static final���͵�;
	void fly();	//����:public abstract void fly();
}
/**�����ӿ�*/
interface Honest{
	void helpOther();
}
/**Angel��ʵ�ַ��нӿں������ӿ�*/
class Angel implements Volant,Honest{
	public void fly() {
		System.out.println("������ʹ,��������!");
	}
	
	public void helpOther() {
		System.out.println("�������̹�·!");
	}
}

class GoodMan2 implements Honest{
	public void helpOther() {
		System.out.println("�������̹���·!");
	}
}

class BirdMan2 implements Volant{
	public void fly() {
		System.out.println("��������,���ڷ�....................");
	}
}










