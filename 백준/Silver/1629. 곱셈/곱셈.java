import java.io.*;
import java.util.*;

public class Main {
	public static long modPow(long base, long exp, long modNum) {		
        if (exp == 1) return base % modNum;
		else {
			long partialMod = modPow(base, exp/2, modNum);
			if (exp % 2 == 0) return (partialMod * partialMod) % modNum;
			else return ((partialMod * partialMod) % modNum * base) % modNum;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		System.out.println(modPow(a, b, k));
	}
}