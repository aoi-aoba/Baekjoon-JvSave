import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        class wordInDict {
            int correctness;
            String word;
            wordInDict(int num, String str) {
                correctness = num;
                word = str;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String target = br.readLine();
            int dictSize = Integer.parseInt(br.readLine());
            wordInDict[] dictionary = new wordInDict[dictSize];
            for (int i = 0; i < dictSize; i++) {
                wordInDict word = new wordInDict(0, br.readLine());
                for (int j = 0; j < target.length(); j++)
                    if (word.word.charAt(j) == target.charAt(j))
                        word.correctness++;
                dictionary[i] = word;
            }
            Arrays.sort(dictionary, new Comparator<wordInDict>() {
                @Override
                public int compare(wordInDict word1, wordInDict word2) {
                    return Integer.compare(word2.correctness, word1.correctness);
                }
            });
            output.append(dictionary[0].word).append("\n");
        }
        System.out.print(output);
    }
}