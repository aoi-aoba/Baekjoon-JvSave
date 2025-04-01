import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i<=N; i++) linkedList.addLast(i);
        int index = -1;
        while(!linkedList.isEmpty()) {
            index += K;
            if(index >= linkedList.size()) index %= linkedList.size();
            result.add(linkedList.remove(index));
            index -= 1;
        }
        sb.append("<");
        for(int i=0; i<result.size(); i++)
            sb.append(i != result.size()-1 ? result.get(i) + ", " : result.get(i));
        System.out.println(sb + ">");
        br.close();
    }
}