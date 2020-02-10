package design_principles_epam;

public final class Math {
	
	public  int add(int num1, int num2){
		return num1+num2;
	}
	
	public  int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public  int mul(int num1, int num2) {
		return num1*num2;
	}
	// exception: num2!=0
	public  double div(int num1, int num2) throws Exception{
		return num1/num2;
	}
}
