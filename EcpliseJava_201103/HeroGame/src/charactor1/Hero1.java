package charactor1;

public class Hero1 {
	public String name;
	protected float hp;
	public void attckHero(Hero h) throws EnemyHeroIsDeadException {
		if (h.hp==0) {
			throw new EnemyHeroIsDeadException(h.name+" �Ѿ�����,����Ҫʩ�ż���")
		}
	}
	
	class EnemyHeroIsDeadException extends Exception{
		
	}
	
}
