import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine().toLowerCase();
            if(str.equals("#")) break;
            int cnt = 0;
            for(int i=0; i<str.length(); i++) {
                switch(str.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}