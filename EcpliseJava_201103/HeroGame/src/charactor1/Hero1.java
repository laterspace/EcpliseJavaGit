package charactor1;

public class Hero1 {
	public String name;
	protected float hp;
	public void attckHero(Hero h) throws EnemyHeroIsDeadException {
		if (h.hp==0) {
			throw new EnemyHeroIsDeadException(h.name+" 已经挂了,不需要施放技能")
		}
	}
	
	class EnemyHeroIsDeadException extends Exception{
		
	}
	
}
