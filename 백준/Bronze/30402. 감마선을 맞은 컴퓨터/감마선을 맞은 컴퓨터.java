import java.io.*;
import java.util.*;

public class Main {
    private static final double PI = Math.PI;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String answer = "";

        for (int i = 0; i < 15; i++) {
            String str = br.readLine();

            for (int j = 0; j < 29; j++) {
                char word = str.charAt(j);

                if (word == 'w'){
                    answer = "chunbae";
                }else if(word == 'b'){
                    answer = "nabi";
                }else if(word == 'g'){
                    answer = "yeongcheol";
                }
            }

        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}