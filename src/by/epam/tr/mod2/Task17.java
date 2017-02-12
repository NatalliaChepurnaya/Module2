package by.epam.tr.mod2;

public class Task17 {
	public static void main(String[] args){
		double x = -10; 
		double f;

		if (x <= -3){
			f = 9;
		} else{
			f = 1 / (x * x + 1);
		}
		System.out.println("x: " + x + " F = " + f);
	}
}
