import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static String whatIsRecursion(int N) {
        String str1 = "\"재귀함수가 뭔가요?\"";
        String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
        String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
        String str5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
        String str6 = "라고 답변하였지.\n";
        if(N == 0) {
            System.out.print(sb.toString());
            System.out.println(str1);
            System.out.print(sb.toString());
            System.out.println(str5);
            return (sb.toString()) + str6;
        } else {
            System.out.print(sb.toString());
            System.out.println(str1);
            System.out.print(sb.toString());
            System.out.println(str2);
            System.out.print(sb.toString());
            System.out.println(str3);
            System.out.print(sb.toString());
            System.out.println(str4);
            sb.append("____");
            return whatIsRecursion(N-1) + (sb.delete(0,4).toString()) + str6;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        System.out.println(whatIsRecursion(N));
    }
}