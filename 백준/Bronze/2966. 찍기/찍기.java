import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean AdrianCorrects(int index, char target) {
        if (index % 3 == 0 && target == 'A') return true;
        else if (index % 3 == 1 && target == 'B') return true;
        else return (index % 3 == 2 && target == 'C');
    }

    public static boolean BrunoCorrects(int index, char target) {
        if (index % 4 == 1 && target == 'A') return true;
        else if ((index % 4 == 0 || index % 4 == 2) && target == 'B') return true;
        else return (index % 4 == 3 && target == 'C');
    }

    public static boolean GoranCorrects(int index, char target) {
        if ((index % 6 == 0 || index % 6 == 1) && target == 'C') return true;
        else if ((index % 6 == 2 || index % 6 == 3) && target == 'A') return true;
        else return ((index % 6 == 4 || index % 6 == 5) && target == 'B');
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), adrian = 0, bruno = 0, goran = 0, max = 0;
        char[] str = br.readLine().toCharArray();
        for (int i = 0; i < N; i++) {
            adrian += AdrianCorrects(i, str[i]) ? 1 : 0;
            bruno += BrunoCorrects(i, str[i]) ? 1 : 0;
            goran += GoranCorrects(i, str[i]) ? 1 : 0;
            max = Math.max(Math.max(adrian, bruno), goran);
        }
        System.out.println(max);
        if (adrian == max) System.out.println("Adrian");
        if (bruno == max) System.out.println("Bruno");
        if (goran == max) System.out.println("Goran");
        br.close();
    }
}