import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            char[] arr = br.readLine().toCharArray();
            LinkedList<String> linkedList = new LinkedList<>();
            ListIterator<String> iterator = linkedList.listIterator();
            for (char ch : arr) {
                switch (ch) {
                    case '<': if (iterator.hasPrevious()) iterator.previous(); break;
                    case '>': if (iterator.hasNext()) iterator.next(); break;
                    case '-': if (iterator.hasPrevious()) { iterator.previous(); iterator.remove(); } break;
                    default: iterator.add(String.valueOf(ch));
                }
            }
            iterator = linkedList.listIterator();
            while (iterator.hasNext()) sb.append(iterator.next());
            sb.append("\n");
        }
        System.out.print(sb);
    }
}