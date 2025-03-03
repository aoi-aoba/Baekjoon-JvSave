import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(a.charAt(i) != b.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}