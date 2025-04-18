import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(), suffix = "", subStr = "";
        int cnt = 0;

        for (int i = str.length() - 1; i >= 0; i--) { // 우측부터 문자열 탐색
            suffix = str.substring(i+1); // 현재 i보다 뒤에 있는 문자열을 잘라내기
            for (int j = i; j < str.length(); j++) {
                subStr = str.substring(i, j+1); // i부터 j+1까지 substring을 생성
                if (!suffix.contains(subStr)) cnt++; // suffix가 subStr을 포함하지 않으면 cnt 증가
            }
        }
        // 문자열을 뒤에서부터 읽는 suffix가 있기 때문에 subStr은 이미 suffix 선에서 중복 처리가 가능함
        // 이미 나왔던 subStr은 전부 suffix가 'contain'하고 있음

        System.out.println(cnt);
        br.close();
    }
}