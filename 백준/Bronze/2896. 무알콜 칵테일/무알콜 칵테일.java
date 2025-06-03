import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());  // 칵테일에 필요한 각 주스의 비율
        double I = Double.parseDouble(st.nextToken());
        double J = Double.parseDouble(st.nextToken());
        double K = Double.parseDouble(st.nextToken());

        // 칵테일을 최대한 많이 만들 때, 각 주스가 남는 양을 구하기
        
        // 칵테일의 최대 양은 A / I, B / J, C / K중 가장 작은 값
        double cocktail = A / I;
        cocktail = Math.min(cocktail, B / J);
        cocktail = Math.min(cocktail, C / K);

        // 이를 각각의 값에서 빼면 남는 값이 됨
        A -= cocktail * I;
        B -= cocktail * J;
        C -= cocktail * K;

        sb.append(A).append(' ').append(B).append(' ').append(C);

        System.out.print(sb);
        br.close();
    }
}