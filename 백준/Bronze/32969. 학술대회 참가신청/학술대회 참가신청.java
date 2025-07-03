import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dataTheme = new String[]{"bigdata", "public", "society"};
        String theme = br.readLine();
        for (String target : dataTheme) {
            if (theme.contains(target)) {
                System.out.println("public bigdata");
                return;
            }
        }
        System.out.println("digital humanities");
    }
}