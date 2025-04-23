import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken()), price = Integer.parseInt(tokenizer.nextToken());
        List<Integer> coinList = new ArrayList<>();
        for (int i = 0; i < n; i++) coinList.add(Integer.parseInt(reader.readLine()));

        int cnt = 0;
        for (int i = coinList.size()-1; i >= 0; i--) {
            if (coinList.get(i) <= price) {
                cnt += (price / coinList.get(i));
                price %= coinList.get(i);
            }
            if (price == 0) break;
        }

        System.out.println(cnt);
        reader.close();
    }
}