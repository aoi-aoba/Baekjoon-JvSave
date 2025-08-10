import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            hashMap.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        List<String> nameList = new ArrayList<>(hashMap.keySet());
        Collections.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                if (hashMap.get(name1).equals(hashMap.get(name2)))
                    return name1.compareTo(name2);
                else return Integer.compare(hashMap.get(name2), hashMap.get(name1));
            }
        });

        bw.write(String.valueOf(nameList.get(0)));
        bw.flush();
    }
}