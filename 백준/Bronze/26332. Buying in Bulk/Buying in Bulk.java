import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int total = 0;
			if(a == 1) {
				total = b;
			}else {
				total = b + (a - 1) * (b - 2);
			}
			System.out.println(a + " " + b);
			System.out.println(total);
		}
		sc.close();
	}
}