package property;

public interface Mortal {
	public void die();
	
	default public void revive() {
		System.out.println("±¾Ó¢ÐÛ¸´»î");
	}
}
