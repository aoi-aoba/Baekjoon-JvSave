import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int level = Integer.parseInt(br.readLine());
        int[][] arcane = new int[][]{{200, 210, 220}, {210, 220, 225}, {220, 225, 230}, {225, 230, 235}, {230, 235, 245},
                {235, 245, 250}}, grandis = new int[][]{{260, 265, 270}, {265, 270, 275}, {270, 275, 280}, {275, 280, 285},
                {280, 285, 290}, {285, 290, 295}, {290, 295, 300}};
        for (int i = 0; i < 6; i++) {
            if (level >= arcane[i][2]) output.append("100 ");
            else if (level >= arcane[i][1]) output.append("300 ");
            else if (level >= arcane[i][0]) output.append("500 ");
            else output.append("0 ");
        }
        output.append("\n");
        for (int i = 0; i < 7; i++) {
            if (level >= grandis[i][2]) output.append("100 ");
            else if (level >= grandis[i][1]) output.append("300 ");
            else if (level >= grandis[i][0]) output.append("500 ");
            else output.append("0 ");
        }
        System.out.print(output);
    }
}