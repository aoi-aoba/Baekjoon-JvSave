import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		for(int i=0; i<s1.length(); i++) {
            int x = s1.charAt(i) - 'A';
            int y = s2.charAt(i) - 'A';
            if(y >= x) answer.add(y-x);
            else answer.add(y+26-x);
        }
        return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			String s1 = sc.next();
			String s2 = sc.next();

			ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
			System.out.print("Distances: ");

			for(Integer d : answer) {
				System.out.print(d+" ");
			}
			System.out.println();

		}
	}
}
