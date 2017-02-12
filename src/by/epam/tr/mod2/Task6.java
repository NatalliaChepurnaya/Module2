package by.epam.tr.mod2;

import java.util.Scanner;
import by.epam.tr.mod2.InputCheck;

public class Task6 {
	public static void main(String[] args){
		
		double a;
		double b;
		double c;		
		double res;
		Scanner sc = new Scanner(System.in);
		
		a = InputCheck.getDouble(sc,"Enter a:");
		b = InputCheck.getDouble(sc,"Enter b:");
		c = InputCheck.getDouble(sc,"Enter c:");
		
		res = a * a - (b - c) * (b - c) + Math.log(b * b + 1);
		
		System.out.println("Result: " + res);
		
		
		
	}

}
