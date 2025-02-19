import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++) {
            String str = sc.nextLine();
            sb.append(i).append(". ").append(str).append("\n");
        }
        System.out.println(sb);
    }
}