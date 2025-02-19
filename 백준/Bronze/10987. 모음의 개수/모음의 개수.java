import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;
        for(int i=0; i<str.length(); i++)
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cnt++;
            }
        System.out.println(cnt);
    }
}