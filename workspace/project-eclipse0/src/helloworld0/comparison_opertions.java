package helloworld0;

public class comparison_opertions {
	public static void main(String [] array){
		int a, b, c;
		a = 2;
		b = 3;
		
		if (a<b) System.out.println(a+" меньше "+b);
		if (a==b) System.out.println(a+" равно "+b);
		System.out.println();
		c = a - b;
		System.out.println("c ="+c);
		if (c >= 0) System.out.println("c - не отрицательное число");
		if (c < 0 ) System.out.println("c - отрицательное число");
		System.out.println();
		c = b - a;
		System.out.println("c= "+c);
		if (c >= 0 ) System.out.println("c -  не отрицательное число");
		if ( c < 0 ) System.out.println("c- отрицательное число");
		
	}

}
