import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++) {
            String str = sc.nextLine();
            char prev = ' ';
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) != prev) sb.append(str.charAt(j));
                prev = str.charAt(j);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}