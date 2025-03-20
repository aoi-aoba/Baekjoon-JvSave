import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[20];
        Arrays.fill(arr, false);

        long M = Long.parseLong(br.readLine());
        while(M > 0) {
            String opLine = br.readLine();
            if(opLine.contains("all")) {
                Arrays.fill(arr, true);
            } else if(opLine.contains("empty")) {
                Arrays.fill(arr, false);
            } else {
                StringTokenizer st = new StringTokenizer(opLine);
                String op = st.nextToken();
                int i = Integer.parseInt(st.nextToken()) - 1;

                if(op.equals("add")) arr[i] = true;
                else if(op.equals("remove")) arr[i] = false;
                else if(op.equals("toggle")) arr[i] = !arr[i];
                else if(op.equals("check")) sb.append(arr[i] ? 1 : 0).append("\n");
            }

            M--;
        }

        System.out.println(sb.toString());
        br.close();
    }
}