import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String str;
        while(true) {
            str = br.readLine();
            if(str == null) break;
            num++;
        }
        System.out.println(num);
    }
}