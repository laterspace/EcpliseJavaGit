package charactor;

public class GiantDragon {
	// ˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private GiantDragon() {
	}
	
	//����ʽ����ģʽ
//	//׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ��
//	private static GiantDragon instance=new GiantDragon();
//	
//	//public static �������ṩ�������߻�ȡ12�ж���Ķ���
//	public static GiantDragon getInstance() {
//		return instance;
//	}

	//����ʽ����ģʽ
	// ׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
	private static GiantDragon instance;

	// public static ����������ʵ������
	public static GiantDragon getInstance() {
		// ��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
		if (null == instance) {
			instance = new GiantDragon();
		}
		// ���� instanceָ��Ķ���
		return instance;
	}

}
