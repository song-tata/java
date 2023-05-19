package makeup.q3;

public class CreateChampion extends Sumerner implements IChampion{
	String name;
	String spellD;
	String spellF;
	
	char[] SKILLSET = {'Q','W','E','R','q','w','e','r'};
			
	
	@Override
	void setSumernerSpellD(String spell) {
		this.spellD = spell;
	}
	@Override
	void setSumernerSpellF(String spell) {
		this.spellF = spell;
	}

	
	
	
	public CreateChampion() {}
	
	public CreateChampion(String name) {
		this.name = name;
		System.out.printf("체력 %d %\n",HP);
	}
//	@Override
//	public void useQ(String string) {
//		System.out.println(this.name+"챔피언이 q스킬을 씁니다. 스킬명: "+string);
//	}
//
//	@Override
//	public void useW(String string) {
//		System.out.println(this.name+"챔피언이 w스킬을 씁니다. 스킬명: "+string);		
//	}
//
//	@Override
//	public void useE(String string) {
//		System.out.println(this.name+"챔피언이 e스킬을 씁니다. 스킬명: "+string);		
//	}
//
//	@Override
//	public void useR(String string) {
//		System.out.println(this.name+"챔피언이 r스킬을 씁니다. 스킬명: "+string);		
//	}

	@Override
	public void useSkill(char a) {
		
		for(char b : this.SKILLSET) {
			if(a == b) {
				System.out.println( this.name+"이(가) " +b+" 스킬 사용");
				break;
			}
		}
		
		
	}
	@Override
	public void setAvarter() {
		
	}

}
