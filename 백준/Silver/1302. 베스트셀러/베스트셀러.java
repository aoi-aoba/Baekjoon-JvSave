import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> bookSet = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String bookName = br.readLine();
            if (bookSet.containsKey(bookName))
                bookSet.replace(bookName, bookSet.get(bookName) + 1);
            else bookSet.put(bookName, 1);
        }

        List<String> keySet = new ArrayList<>(bookSet.keySet());
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String book1, String book2) {
                if (!bookSet.get(book1).equals(bookSet.get(book2)))
                    return bookSet.get(book1).compareTo(bookSet.get(book2));
                // 개수 중복이 없다면 last index에 답이 올 것
                else return book2.compareTo(book1);
                // 개수 중복이 있어도 last index에 답이 오려면 사전 역순 정렬 필요
            }
        });

        bw.write(keySet.get(keySet.size() - 1));
        bw.flush();
    }
}
