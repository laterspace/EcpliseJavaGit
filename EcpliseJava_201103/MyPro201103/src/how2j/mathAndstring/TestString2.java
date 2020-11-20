package how2j.mathAndstring;

public class TestString2 {
	public static void main(String[] args) {
		String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
		char c=sentence.charAt(0);
		System.out.println(c);
		
		
		char[] cs=sentence.toCharArray();
		System.out.println(sentence.length()==cs.length);
		
		String ss1=sentence.substring(3);
		System.out.println(ss1);
		
		String ss2=sentence.substring(3,5);
		System.out.println(ss2);
		
		
	}
}
