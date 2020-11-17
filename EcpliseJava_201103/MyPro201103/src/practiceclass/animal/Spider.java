package practiceclass.animal;

public class Spider extends Animal {
	//int legs=8;
	public Spider(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ö©Öë¿ª³Ô");
	}
	
	public static void main(String[] args) {
		Spider s = new Spider(8);
	}
	
}
