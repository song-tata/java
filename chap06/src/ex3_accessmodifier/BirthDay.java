package ex3_accessmodifier;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 13) {
			this.isValid = false; 
		}
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.printf("%d 년 %d 월 %d 일",year,month,day);
		}else {
			System.out.println("유효하지않습니다");
		}
	}
	

}
