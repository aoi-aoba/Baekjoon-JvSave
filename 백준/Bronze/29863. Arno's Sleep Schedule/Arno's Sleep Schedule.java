import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start_time = Integer.parseInt(br.readLine());
        int end_time = Integer.parseInt(br.readLine());
        int hours = 0;
        if(start_time >= 20) {
            hours += 24-start_time;
            hours += end_time;
        } else {
            hours += end_time-start_time;
        }
        System.out.println(hours);
    }
}