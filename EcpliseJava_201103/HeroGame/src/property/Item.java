package property;



public abstract class Item extends Object {
	String name;
	int price;
	
	public void buy() {
		System.out.println("购买");
	}
	public void effect() {
		System.out.println("物品使用后,可以有效果");
	}
	
	//=======================
	public abstract boolean disposable();
	//=======================
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Item) {
			Item i=(Item) o;
			return this.price==i.price;
		}
		return false;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+"当前对象正在被回收");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+price;
	}
	
	
	
	//====单例模式==========================
//	private Item() {}
//	
//	private static Item instance;
//	
//	public static Item getInstance() {
//		
//		if (instance==null) {
//			instance =new Item();
//		}
//		return instance;
//	}
	//===========================================
	
	public static void main(String[] args) {
		
		
		
		
//		Item i = new Item();
//		//i.effect();
//		i.price=12;
//		i.name="xxxx";
//		Item i1  = new Item();
//		//i1.effect();\
//		i1.price=12;
//		
//		Item i2 = new Item();
//		i2.price=10;
//		
//		System.out.println("toString:"+i.toString());
//		
//		System.out.println(i.equals(i1));
//		System.out.println(i1.equals(i2));
//		Item itx;
//		for (int j = 0; j <222200000; j++) {
//			itx=new Item();			
//		}
		
		
		
	
		
//		Item i2 = new MagicPotion();
//		System.out.print("i1  是Item类型，执行effect打印:");
//        i1.effect();
//        System.out.print("i2也是Item类型，执行effect打印:");
//        i2.effect();
		
		//Item i = new //Item();
//		Item i1=Item.getInstance();
//		Item i2=Item.getInstance();
//		Item i3=Item.getInstance();
//		
//		
//		System.out.println(i1==i2);
//		System.out.println(i2==i3);
		
	}
	
	
}
