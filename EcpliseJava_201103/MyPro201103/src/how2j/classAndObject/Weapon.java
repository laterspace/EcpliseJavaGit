package how2j.classAndObject;

//public class Weapon {
//	String name;
//	int price;
//	int damage; // ������
//}

public class Weapon extends Item{
    int damage; //������
     
    public static void main(String[] args) {
        Weapon infinityEdge = new Weapon();
        infinityEdge.damage = 65; //damage��������Weapon������Ƶ�
         
        infinityEdge.name = "�޾�֮��";//name���ԣ��Ǵ�Item�м̳����ģ��Ͳ���Ҫ�ظ������
        infinityEdge.price = 3600;
         
    }
     
}