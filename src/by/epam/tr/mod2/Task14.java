package by.epam.tr.mod2;

public class Task14 {
	public static void main(String[] args){
		double a = 11;
		double b = -2;
		double c = 4;
		
		System.out.println("Result A: " + power(a)
				+ "\nResult B: " + power(b)
				+ "\nResult C: " + power(c));
	}
	
	public static double power(double x){
		if (x >= 0){
			return Math.pow(x, 2);
		} else {
			return Math.pow(x, 4);
		}
	}
	
		
}
	
	

