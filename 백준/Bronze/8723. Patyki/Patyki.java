import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> triangle = new ArrayList<>();
        for(int i=0; i<3; i++)
            triangle.add(Integer.parseInt(st.nextToken()));
        br.close();
        Collections.sort(triangle);

        boolean canMakeRT = false;
        boolean canMakeET = false;
        if(triangle.get(1).equals(triangle.get(0)) && triangle.get(2).equals(triangle.get(1)))
            canMakeET = true;
        else if(Math.pow(triangle.get(0), 2) + Math.pow(triangle.get(1), 2) == Math.pow(triangle.get(2), 2))
            canMakeRT = true;

        if(canMakeRT) System.out.println(1);
        else if(canMakeET) System.out.println(2);
        else System.out.println(0);
    }
}