package practiceclass.animal;

public class Cat extends Animal implements Pet{
	private String name;
	public  Cat(String name) {
		super(4);
		this.name=name;
	}
	public Cat(){
		this("");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ð¡Ã¨¿ª³Ô");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	
}
