import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String divideByTwo(String num, int repeat) {
        if(repeat == 0) return String.valueOf(num);
        if(num.equals("1")) return divideByTwo("0.5", repeat-1);
        StringBuilder divideCase = new StringBuilder("0.");
        int init = 0;
        for(int i=2; i<num.length(); i++) {
            if(num.charAt(i) == 0) continue;
            init += num.charAt(i) - '0';
            divideCase.append(init / 2);
            if(init % 2 == 1) init = init % 2 * 10;
            else init = 0;
        }
        if(init != 0) divideCase.append("5");
        return divideByTwo(divideCase.toString(), repeat-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(divideByTwo("1", N));
        br.close();
    }
}