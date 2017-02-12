package by.epam.tr.mod2;

public class Task4 {
	public static void main(String[] args){
		double k1;
		double k2;
		double h;
		double s;
		String str = "";
		
		k1 = 3;
		k2 = 4;
		
		if (k1 <= 0 || k2 <= 0){
			str = "Некорректные значения катетов";
		} else {
			h = Math.sqrt(k1 * k1 + k2 * k2);
			s = k1 * k2 / 2;
			
			str = "Гипотенуза треугольника с катетами " + k1 + " и " + k2 + " равна "
					+ h + ", а площадь - " + s;
		}	
		
		System.out.println(str);
					
	}

}
