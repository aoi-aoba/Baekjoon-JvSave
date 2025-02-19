import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int people = sc.nextInt()*sc.nextInt();
        int[] arr = new int[5];
        for(int i=0; i<5; i++)
            sb.append(sc.nextInt()-people).append(" ");
        System.out.println(sb);
    }
}