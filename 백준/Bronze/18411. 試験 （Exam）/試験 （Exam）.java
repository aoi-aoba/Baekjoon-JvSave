import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i=0; i<3; i++)
            arrlist.add(Integer.parseInt(st.nextToken()));
        Collections.sort(arrlist);
        System.out.println(arrlist.get(1) + arrlist.get(2));
        br.close();
    }
}