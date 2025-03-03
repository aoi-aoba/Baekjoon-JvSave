import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valOfPeople = 0;
        String className = "";
        for(int i=0; i<7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String nameTemp = st.nextToken();
            int temp = Integer.parseInt(st.nextToken());
            if(valOfPeople < temp) {
                valOfPeople = temp;
                className = nameTemp;
            }
        }
        System.out.println(className);
        br.close();
    }
}