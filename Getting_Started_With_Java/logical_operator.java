import java.util.Scanner;

public class logical_operator {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b= s.nextInt();
		int c=s.nextInt();
		
//		Logical AND operator --- Both must be true
		boolean isLarge=(a>=b && a>=c);
		System.out.println(isLarge);

		
//		Logical OR operator --- either one is true
//		boolean isLarge=(a>=b || a>=c);
//		System.out.println(isLarge);
	}

}
