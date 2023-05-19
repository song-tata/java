package ex2_interface.q2;


public class MyCalc implements Calc {
	
	
	@Override
	public int square(int num) {
		
		return num*num;
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int multi(int num1, int num2) {
		// TODO Auto-generated method stub
		return  num1*num2;
	}

	@Override
	public double divide(int num1, int num2) {
		if(num2!=0) {
			return num1/num2;
		}else {
			return Calc.ERROR;
		}
		
	}
	
	
	
}
