import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t1 = sc.nextInt();
		int m1 = sc.nextInt();
		int t2 = sc.nextInt();
		int m2 = sc.nextInt();
		int total = 0;
		
		if(t1 < t2) {
			if(m1 <= m2) {
				total += (t2 - t1) * 60;
				total += m2 - m1;
			}else if(m1 > m2){
				total += (t2 - t1 - 1) * 60;
				total += 60 - m1 + m2;
			}
		}else if(t1 > t2){
			if(m1 <= m2) {
				total += (24 - t1 + t2) * 60;
				total += m2 - m1;
			}else if(m1 > m2){
				total += (23 - t1 + t2) * 60;
				total += 60 - m1 + m2;
			}
		}else {
			if(m1 <= m2) {
				total += m2 - m1;
			}else if(m1 > m2) {
				total += 23 * 60;
				total += 60 - m1 + m2;
			}
		}
		
		System.out.println(total + " " + total / 30);
		sc.close();
	}
}