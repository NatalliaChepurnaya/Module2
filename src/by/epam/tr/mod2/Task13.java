package by.epam.tr.mod2;

public class Task13 {
	public static void main(String[] args){
		double a = 1; //Input parameters
		double b = 2; //Input parameters
		double c = 3; //Input parameters
		double d = 4; //Input parameters
		double resA = 0;
		double resB = 0;
		
		resA = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
		resB = 1 / d; 
		
		System.out.println("Formula A: " + resA
				+ "\nFormula B: " + resB);
		
	}

}
