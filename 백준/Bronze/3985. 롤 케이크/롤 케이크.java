import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int lengthOfCake = Integer.parseInt(br.readLine()), peopleNum = Integer.parseInt(br.readLine());
        int[] cakeArr = new int[lengthOfCake + 1], people = new int[peopleNum + 1];
        Arrays.fill(cakeArr, -1);

        int predictedMaxPerson = 0, predictedMaxPiece = 0;
        for(int i = 1; i <= peopleNum; i++) {
            st = new StringTokenizer(br.readLine());
            int startPos = Integer.parseInt(st.nextToken()), endPos = Integer.parseInt(st.nextToken());
            if(endPos - startPos + 1 > predictedMaxPiece) {
                predictedMaxPerson = i;
                predictedMaxPiece = endPos - startPos + 1;
            }
            for(int j = startPos; j <= endPos; j++)  if(cakeArr[j] == -1) cakeArr[j] = i;
        }

        int maxPiecePerson = 0, maxPiece = 0;
        for(int i = 1; i <=  lengthOfCake; i++) {
            if(cakeArr[i] != -1) {
                people[cakeArr[i]]++;
                if(people[cakeArr[i]] > maxPiece) {
                    maxPiece = people[cakeArr[i]];
                    maxPiecePerson = cakeArr[i];
                }
            }
        }

        System.out.println(predictedMaxPerson);
        System.out.println(maxPiecePerson);
        br.close();
    }
}