import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w1 = sc.nextInt();
		int h1 = sc.nextInt();
		int w2 = sc.nextInt();
		int h2 = sc.nextInt();
		int total = 0;
		
		total += w1 + 2 + w2 + 2 + h1 + h2 + h1 + h2;
		if(w1 > w2) {
			total += w1 - w2;
		}else if(w1 < w2) {
			total += w2 - w1;
		}
		
		System.out.println(total);
		sc.close();
	}
}