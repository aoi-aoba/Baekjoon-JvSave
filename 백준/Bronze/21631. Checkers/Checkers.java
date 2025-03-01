import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long max = 0;
		
		if(a >= b) {
			max = b;
		}else if(a < b) {
			max = a + 1;
		}
		
		System.out.println(max);
		sc.close();
	}
}