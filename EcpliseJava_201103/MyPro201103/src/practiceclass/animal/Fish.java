package practiceclass.animal;

public class Fish extends Animal implements Pet {
	
	private String name;
	
	public Fish() {
		super(0);
	}
	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("�㿪��");
	}

	@Override
	public void walk(int legs) {
		// TODO Auto-generated method stub
		super.walk(legs);
		System.out.println("�㲻������"+legs+"��");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
