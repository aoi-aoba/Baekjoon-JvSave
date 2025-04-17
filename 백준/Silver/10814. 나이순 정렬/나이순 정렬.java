import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static class User {
        String name;
        int age, registerNum;
        public User() {
            name = "";
            age = 0;
            registerNum = 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        User[] users = new User[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            users[i] = new User();
            users[i].registerNum = i;
            users[i].age = Integer.parseInt(st.nextToken());
            users[i].name = st.nextToken();
        }

        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                if (user1.age != user2.age) return Integer.compare(user1.age, user2.age);
                else return Integer.compare(user1.registerNum, user2.registerNum);
            }
        });

        for (User user : users) sb.append(user.age).append(" ").append(user.name).append("\n");
        System.out.print(sb);
        br.close();
    }
}