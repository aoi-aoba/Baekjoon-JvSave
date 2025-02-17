import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr_str = new String[N];
        for(int i=0; i<N; i++) arr_str[i] = sc.next();
        // result (N)

        StringBuilder ans = new StringBuilder();

        boolean isSame = true; // boolean var for check
        for(int i=0; i<arr_str[0].length(); i++) {
            char c = arr_str[0].charAt(i);
            isSame = true; // initialize to same

            for(int j=1; j<arr_str.length; j++) {
                if (c != arr_str[j].charAt(i)) {
                    // if letter is different
                    isSame = false;
                    break;
                }
            }

            if(isSame) ans.append(c);
            // if same for all, append letter to answer
            else ans.append("?");
            // if not same, append letter to ?(wildcard)
        }
        System.out.println(ans);
    }
}