package property;


public class Item {
	String name;
	int price;
	
	private Item() {}
	
	private static Item instance;
	
	public static Item getInstance() {
		
		if (instance==null) {
			instance =new Item();
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		//Item i = new //Item();
		Item i1=Item.getInstance();
		Item i2=Item.getInstance();
		Item i3=Item.getInstance();
		
		
		System.out.println(i1==i2);
		System.out.println(i2==i3);
		
	}
	
}
