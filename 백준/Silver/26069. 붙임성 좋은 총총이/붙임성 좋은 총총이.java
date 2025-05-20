import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashSet<String> chongPeople = new HashSet<>();
        chongPeople.add("ChongChong");
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken(), B = st.nextToken();
            if (chongPeople.contains(A) || chongPeople.contains(B)) {
                chongPeople.add(A);
                chongPeople.add(B);
            }
        }
        System.out.println(chongPeople.size());
    }
}

// 키에 대해서 ChongChong을 만난 사람에 대해서는 HashSet을 활용하여 따로 빼서 개수 세기