package property;




public class Weapon extends Item{
    int damage; //������
    
    
     
    @Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return false;
	}



	public static void main(String[] args) {
        Weapon infinityEdge = new Weapon();
        infinityEdge.damage = 65; //damage��������Weapon������Ƶ�
         
        infinityEdge.name = "�޾�֮��";//name���ԣ��Ǵ�Item�м̳����ģ��Ͳ���Ҫ�ظ������
        infinityEdge.price = 3600;
         
    }
     
}