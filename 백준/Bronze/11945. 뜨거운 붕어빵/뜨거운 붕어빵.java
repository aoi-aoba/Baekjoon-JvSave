import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            for(int j=m-1; j>=0; j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}