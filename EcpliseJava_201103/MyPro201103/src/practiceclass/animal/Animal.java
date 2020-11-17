package practiceclass.animal;

public abstract class Animal {
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
		System.out.println("animal有几只脚:"+legs);
	}
	
	abstract void eat();
	
	public void walk(int legs) {
		System.out.println(legs+"腿走");
	}

}
