
public class TestMultiInherit implements C{
    public void testc() {
    }
    public void testa() {
    }
    public void testb() {
    }
    public static void main(String[] args) {
		
	}
}


interface A {
    void testa();
}
interface B {
    void testb();
}
/**�ӿڿ��Զ�̳У��ӿ�C�̳нӿ�A��B*/
interface C extends A, B {
    void testc();
}
//public class Test  {
//    public void testc() {
//    }
//    public void testa() {
//    }
//    public void testb() {
//    }
//}