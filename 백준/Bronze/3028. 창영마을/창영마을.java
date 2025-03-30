import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int[] cup = {1, 0, 0};
        for (char shuffleType : str) shuffle(cup, shuffleType);
        if (cup[0] == 1) System.out.println(1);
        else if (cup[1] == 1) System.out.println(2);
        else System.out.println(3);
    }

    public static void shuffle(int[] cup, char shuffleType) {
        int temp = 0;
        switch (shuffleType) {
            case 'A': temp = cup[0]; cup[0] = cup[1]; cup[1] = temp; break;
            case 'B': temp = cup[1]; cup[1] = cup[2]; cup[2] = temp; break;
            case 'C': temp = cup[2]; cup[2] = cup[0]; cup[0] = temp; break;
        }
    }
}