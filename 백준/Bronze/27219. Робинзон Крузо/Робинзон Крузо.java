import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int vnum = n/5;
        int inum = n%5;
        for(int i=0; i<vnum; i++) sb.append("V");
        for(int i=0; i<inum; i++) sb.append("I");
        System.out.println(sb);
    }
}