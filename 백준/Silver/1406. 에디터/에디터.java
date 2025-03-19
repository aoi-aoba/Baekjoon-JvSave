import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] init = br.readLine().toCharArray();
        List<String> list = new LinkedList<>();
        ListIterator<String> listItr = list.listIterator();
        for (char c : init) listItr.add(String.valueOf(c));
        int T = Integer.parseInt(br.readLine());
        while(T > 0) {
            String operation = br.readLine();
            if(operation.charAt(0) == 'L') {
                if(listItr.hasPrevious()) listItr.previous();
            } else if(operation.charAt(0) == 'D') {
                if(listItr.hasNext()) listItr.next();
            } else if(operation.charAt(0) == 'B') {
                if(listItr.hasPrevious()) {
                    listItr.previous();
                    listItr.remove();
                }
            } else listItr.add(String.valueOf(operation.charAt(2)));
            T--;
        }
        for(String s : list) bw.write(s);
        bw.flush();
        bw.close();
    }
}

/*
    커서를 왼쪽으로 옮김 (맨 앞이면 무시) >> L
    커서를 오른쪽으로 옮김 (맨 뒤이면 무시) >> D
    커서 왼쪽에 있는 문자 삭제 (맨 앞이면 무시) / 커서가 한 칸 이동한 것처럼 나타나지만 오른쪽 문자 그대로 >> B
    문자를 커서 왼쪽에 추가함 >> P (문자)
 */