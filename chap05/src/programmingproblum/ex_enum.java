package programmingproblum;

public class ex_enum {
	

	
	    public static void main(String[] args) {
	        Gender gender = Gender.MALE;
	        if (gender.equals(Gender.MALE) )
	            System.out.println(Gender.MALE + "은 병역 의무가 있다.");
	        else
	            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");

	        for(Gender g : Gender.values())
	            System.out.println(g.name()+","+g.getB()+","+g.getF());

	        System.out.println(Gender.valueOf("MALE"));
	    }
	}

	enum Gender {
	    MALE("남성", "MAN"), FEMALE("여성","WOMEN");

	    private String f;
	    private String b;

	    Gender(String f,String b) {
	        this.f = f;
	        this.b = b;
	    }

		public String getF() {
			return f;
		}

		public String getB() {
			return b;
		}

		public void setF(String f) {
			this.f = f;
		}

		public void setB(String b) {
			this.b = b;
		}
	    
	   
	}

