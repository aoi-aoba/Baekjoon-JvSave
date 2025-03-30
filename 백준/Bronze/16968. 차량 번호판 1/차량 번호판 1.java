import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] license = br.readLine().split("");
        int c = 26, d = 10, result = 1;
        for(int i = 0; i < license.length; i++) {
            if(0 < i && license[i].equals(license[i-1])) {
                if (license[i].equals("c")) {
                    if(c != 25) c--;
                } else {
                    if(d != 9) d--;
                }
            } else if(0 < i && !license[i].equals(license[i-1])) {
                c = 26;
                d = 10;
            }
            if(license[i].equals("c")) result *= c;
            else result *= d;
        }
        System.out.println(result);
    }
}