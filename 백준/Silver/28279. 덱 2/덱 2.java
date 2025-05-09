import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[1000001];
        int N = Integer.parseInt(br.readLine()), front = 0, back = 1000000, numItems = 0;

        while (N-- > 0) {
            String op = br.readLine();
            switch (op.charAt(0)) {
                case '1' :
                    StringTokenizer st1 = new StringTokenizer(op);
                    st1.nextToken();
                    front = (front - 1 < 0) ? 1000000 : front - 1;
                    arr[front] = Integer.parseInt(st1.nextToken());
                    numItems++;
                    break;
                case '2' :
                    StringTokenizer st2 = new StringTokenizer(op);
                    st2.nextToken();
                    back = (back + 1 > 1000000) ? 0 : back + 1;
                    arr[back] = Integer.parseInt(st2.nextToken());
                    numItems++;
                    break;
                case '3' :
                    if (numItems != 0) {
                        sb.append(arr[front]).append("\n");
                        front = (front + 1 > 1000000) ? 0 : front + 1;
                        numItems--;
                    } else sb.append("-1\n");
                    break;
                case '4' :
                    if (numItems != 0) {
                        sb.append(arr[back]).append("\n");
                        back = (back - 1 < 0) ? 1000000 : back - 1;
                        numItems--;
                    } else sb.append("-1\n");
                    break;
                case '5' :
                    sb.append(numItems).append("\n");
                    break;
                case '6' :
                    sb.append(numItems == 0 ? 1 : 0).append("\n");
                    break;
                case '7' :
                    if (numItems != 0) sb.append(arr[front]).append("\n");
                    else sb.append("-1\n");
                    break;
                case '8' :
                    if (numItems != 0) sb.append(arr[back]).append("\n");
                    else sb.append("-1\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}