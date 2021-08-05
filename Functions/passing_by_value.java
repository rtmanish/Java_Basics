package functions;

public class passing_by_value {

	public static void increment(int n) {
		n=n+1;
	}
	public static void main(String[] args) {
		
		int a=10;
		increment(a);
		System.out.println(a);
	}

}

//Output will be 10 not 11 because we are just passing the value in the increment function
