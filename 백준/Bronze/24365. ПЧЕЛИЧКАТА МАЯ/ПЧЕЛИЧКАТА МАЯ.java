import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> beeCntList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
        final int distance = - beeCntList.get(0) + beeCntList.get(2);
        System.out.print(distance);
        br.close();
    }
}