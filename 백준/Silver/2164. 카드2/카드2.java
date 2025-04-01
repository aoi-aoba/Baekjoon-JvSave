import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++) queue.addLast(i);
        while(queue.size() != 1) {
            queue.removeFirst();
            int moveDownCard = queue.removeFirst();
            queue.addLast(moveDownCard);
        }
        System.out.print(queue.get(0));
        br.close();
    }
}