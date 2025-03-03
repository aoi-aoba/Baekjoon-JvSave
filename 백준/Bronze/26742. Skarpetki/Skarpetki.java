import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int countB = 0;
		int countC = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'B') {
				countB++;
			}else if(a.charAt(i) == 'C') {
				countC++;
			}
		}
		
		countB = countB / 2;
		countC = countC / 2;
		System.out.println(countB + countC);
		sc.close();
	}
}