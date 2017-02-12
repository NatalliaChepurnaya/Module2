package by.epam.tr.mod2;

public class Task15 {
	public static void main(String[] args){
		double a = 1; //Start point
		double b = 15; //End point
		double h = 1; //Increment
		double f = 0;
		
		double i = a;
		while (i <= b){
			f = 2 * Math.tan(i / 2) + 1;
			System.out.println("x: " + i + " F = " + f + "\n");
			i += h;
		}
	}

}
