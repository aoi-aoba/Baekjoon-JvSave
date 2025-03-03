import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '0') {
				System.out.println("0000");
				System.out.println("0  0");
				System.out.println("0  0");
				System.out.println("0  0");
				System.out.println("0000");
			}else if(a.charAt(i) == '1') {
				System.out.println("   1");
				System.out.println("   1");
				System.out.println("   1");
				System.out.println("   1");
				System.out.println("   1");
			}else if(a.charAt(i) == '2') {
				System.out.println("2222");
				System.out.println("   2");
				System.out.println("2222");
				System.out.println("2");
				System.out.println("2222");
			}else if(a.charAt(i) == '3') {
				System.out.println("3333");
				System.out.println("   3");
				System.out.println("3333");
				System.out.println("   3");
				System.out.println("3333");
			}else if(a.charAt(i) == '4') {
				System.out.println("4  4");
				System.out.println("4  4");
				System.out.println("4444");
				System.out.println("   4");
				System.out.println("   4");
			}else if(a.charAt(i) == '5') {
				System.out.println("5555");
				System.out.println("5");
				System.out.println("5555");
				System.out.println("   5");
				System.out.println("5555");
			}else if(a.charAt(i) == '6') {
				System.out.println("6666");
				System.out.println("6");
				System.out.println("6666");
				System.out.println("6  6");
				System.out.println("6666");
			}else if(a.charAt(i) == '7') {
				System.out.println("7777");
				System.out.println("   7");
				System.out.println("   7");
				System.out.println("   7");
				System.out.println("   7");
			}else if(a.charAt(i) == '8') {
				System.out.println("8888");
				System.out.println("8  8");
				System.out.println("8888");
				System.out.println("8  8");
				System.out.println("8888");
			}else if(a.charAt(i) == '9') {
				System.out.println("9999");
				System.out.println("9  9");
				System.out.println("9999");
				System.out.println("   9");
				System.out.println("   9");
			}
			System.out.println();
		}
		sc.close();
	}
}