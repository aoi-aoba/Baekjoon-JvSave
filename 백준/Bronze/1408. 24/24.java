import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int hNow = Integer.parseInt(st.nextToken());
        int mNow = Integer.parseInt(st.nextToken());
        int sNow = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ":");
        int hEnd = Integer.parseInt(st.nextToken());
        int mEnd = Integer.parseInt(st.nextToken());
        int sEnd = Integer.parseInt(st.nextToken());
        int hRes = hEnd - hNow, mRes = mEnd - mNow, sRes = sEnd - sNow;
        if(sRes < 0) {
            sRes += 60;
            mRes -= 1;
        }
        if(mRes < 0) {
            mRes += 60;
            hRes -= 1;
        }
        if(hRes < 0) hRes += 24;
        System.out.println((hRes < 10 ? "0" + hRes : hRes) + ":" + (mRes < 10 ? "0" + mRes : mRes) + ":" + (sRes < 10 ? "0" + sRes : sRes));
        br.close();
    }
}