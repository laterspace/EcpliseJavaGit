import com.x.HuMan2;

public class TestEncapsulation1 {

	public static void main(String[] args) {
	HuMan2 h =new HuMan2();
	//h.name="123";
	//h.age=18;
	//h.sayAge();
	//h.height=123;
	Girl g =new Girl();
	g.sayHello();
}
}
/*
class HuMan2 {
	private int age;
	String name;
	int height;
	
	void sayAge() {
		System.out.println("age:"+age);
	}
}
*/
class Girl extends HuMan2{
	void sayHello() {
		//System.out.println(name);
	}
}