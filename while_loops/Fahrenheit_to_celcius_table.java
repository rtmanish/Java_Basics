package While_loops;

import java.util.Scanner;

//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.


public class Fahrenheit_to_celcius_table {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);

	        int S=s.nextInt();
	        int E=s.nextInt();
	        int W=s.nextInt();
	        int c;
	        while (S<=E) {
	        	c=(5*(S-32))/9;
	        	System.out.println(S+"  "+c);
	        	S=S+W;
	        }
	}

}
