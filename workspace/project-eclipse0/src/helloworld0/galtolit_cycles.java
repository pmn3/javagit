package helloworld0;

public class galtolit_cycles {
	public static void main (String[] array){
		double gallons, liters;
		int counter;
		System.out.println("перевод из галлонов в литры");
		counter = 0;
		for (gallons=1; gallons<=100; gallons++){
		liters = gallons * 3.7854;
		System.out.println(gallons +" соответствует "+ liters);
		counter++;
		if (counter == 10){
			System.out.println();
			counter=0;
		}
		}
		System.out.println("готово");
	}
}
