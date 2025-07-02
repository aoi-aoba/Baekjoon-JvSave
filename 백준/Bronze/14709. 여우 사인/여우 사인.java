import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean check1 = false, check2 = false, check3 = false;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.equals("1 3") || str.equals("3 1")) check1 = true;
            else if (str.equals("3 4") || str.equals("4 3")) check2 = true;
            else if (str.equals("1 4") || str.equals("4 1")) check3 = true;
        }
        if (N == 3 && check1 && check2 && check3) System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
        else System.out.println("Woof-meow-tweet-squeek");
    }
}