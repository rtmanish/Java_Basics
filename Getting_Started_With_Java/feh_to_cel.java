import java.util.Scanner;

public class feh_to_cel {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int feh=s.nextInt();
		int cel=(5*(feh-32))/9;
		System.out.println(cel);
	}

}
