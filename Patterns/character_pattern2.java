package patterns1;
//for n= 4

//ABCD
//BCDE
//CDEF
//DEFG
import java.util.Scanner;

public class character_pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		
		while(i<=n) {
			int j=1;
			char a=(char)('A'+i-1);
			while(j<=n) {
				System.out.print(a);
				a++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
