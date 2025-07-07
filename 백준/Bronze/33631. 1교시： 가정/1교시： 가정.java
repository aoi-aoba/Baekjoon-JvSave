import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        StringTokenizer token = new StringTokenizer(input.readLine());
        int flourHave = Integer.parseInt(token.nextToken()), chocoHave = Integer.parseInt(token.nextToken()),
                eggHave = Integer.parseInt(token.nextToken()), butterHave = Integer.parseInt(token.nextToken());
        token = new StringTokenizer(input.readLine());
        int flourStd = Integer.parseInt(token.nextToken()), chocoStd = Integer.parseInt(token.nextToken()),
                eggStd = Integer.parseInt(token.nextToken()), butterStd = Integer.parseInt(token.nextToken());
        int query = Integer.parseInt(input.readLine()), nowCookie = 0;
        while (query-- > 0) {
            token = new StringTokenizer(input.readLine());
            int op = Integer.parseInt(token.nextToken()), i = Integer.parseInt(token.nextToken());
            switch (op) {
                case 1 :
                    if (flourHave >= flourStd * i && chocoHave >= chocoStd * i && eggHave >= eggStd * i &&
                    butterHave >= butterStd * i) {
                        flourHave -= flourStd * i;
                        chocoHave -= chocoStd * i;
                        eggHave -= eggStd * i;
                        butterHave -= butterStd * i;
                        nowCookie += i;
                        output.append(nowCookie).append("\n");
                    } else output.append("Hello, siumii\n");
                    break;
                case 2 :
                    flourHave += i;
                    output.append(flourHave).append("\n");
                    break;
                case 3:
                    chocoHave += i;
                    output.append(chocoHave).append("\n");
                    break;
                case 4:
                    eggHave += i;
                    output.append(eggHave).append("\n");
                    break;
                case 5:
                    butterHave += i;
                    output.append(butterHave).append("\n");
                    break;
            }
        }
        System.out.print(output);
    }
}