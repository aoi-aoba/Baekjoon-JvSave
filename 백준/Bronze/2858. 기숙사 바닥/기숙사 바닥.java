import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(s.nextToken());    //바깥쪽 빨간타일
        int b = Integer.parseInt(s.nextToken());    //안쪽 갈색타일

        //방크기=가로*세로 -> 임의로 가로(l) 세로(w)로 잡고 l>=w조건 존재
        //방크기(9)=가로(l=3)*세로(w=3)일때 빨간타일 8개, 갈색타일 1개가 유일한 정답의 최소조건이므로
        //l과 w의 초기값은 3으로 시작하고 w는 l보다 작거나 같을때까지 구해야 l>=w를 만족한다.
        
        for (int l = 3; l <= r; l++) {
            for (int w = 3; w <= l; w++) {
                if(l*2+(w-2)*2 == r && (l-2)*(w-2)==b){
                    bw.write(l+" "+w);
                    break;
                }
            }
        }

        bw.close();
    }
}