import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int h1 = Integer.parseInt(st.nextToken()), m1 = Integer.parseInt(st.nextToken()), s1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ":");
        int h2 = Integer.parseInt(st.nextToken()), m2 = Integer.parseInt(st.nextToken()), s2 = Integer.parseInt(st.nextToken());

        if (s2 < s1) {
            m2--;
            s2 += 60;
        }
        int s_res = s2 - s1;
        if (m2 < m1) {
            h2--;
            m2 += 60;
        }
        int m_res = m2 - m1;
        if (h2 < h1) h2 += 24;
        int h_res = h2 - h1;
        if (h_res == 0 && m_res == 0 && s_res == 0) h_res = 24;

        System.out.println((h_res < 10 ? "0" + h_res : h_res) + ":" + (m_res < 10 ? "0" + m_res : m_res) + ":" + (s_res < 10 ? "0" + s_res : s_res));
    }
}