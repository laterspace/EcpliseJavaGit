package how2j.classAndObject;

public class Hero {
	String name; // ����

	float hp; // Ѫ��

	float armor; // ����

	int moveSpeed; // �ƶ��ٶ�

	public Hero() {
		System.out.println("ʵ����һ�������ʱ��,��Ȼ���ù��췽��");
	}

	public Hero(String name) {
//		System.out.println("һ�������Ĺ��췽��");
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
	public void revive(Hero h) {
		h = new Hero("��Ī", 383);
	}

	public static void main(String[] args) {
		Hero teemo =  new Hero("��Ī",383);
        
        //�ܵ�400�˺�������
        teemo.hp = teemo.hp - 400;
         
        teemo.revive(teemo);
         
        //���⣺ System.out.println(teemo.hp); ������٣� ��ô��⣿
	}
}
