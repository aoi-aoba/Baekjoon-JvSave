import java.io.*;
import java.util.*;

public class Main {
	public static int MOD = 1_000_000_007;	public static int[] factMod;

	public static void fact(int n) {
		factMod[0] = factMod[1] = 1;
		for (int i = 2; i <= n; i++)
			factMod[i] = (int)(((long)factMod[i-1] * i) % MOD);
	}

	public static long modPow(long base, int exp) {
		if (exp == 1) return base % MOD;
		else {
			long partialMod = modPow(base, exp/2);
			if (exp % 2 == 0) return (partialMod * partialMod) % MOD;
			else return ((partialMod * partialMod) % MOD * base) % MOD;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
        factMod = new int[n+1];
		fact(n);

		long den = ((long)factMod[k] * factMod[n-k]) % MOD;
		System.out.println((factMod[n] * modPow(den, MOD-2)) % MOD);
	}
}

/*
	nCr = n!/r!(n-r)! = A / B = AB^(-1)이라 하면
	페르마의 소정리에 의해 어떤 정수 a와 소수 p에 대해 a^p = a (mod p)
	a와 p가 서로소인 경우 a^(p-1) = 1 (mod p)이며 합동식이므로 
	양변을 a로 나누면 역원 a^(p-2) = a^(-1)을 도출할 수 있음에 따라서
	AB^(-1) (mod p) = AB^(p-2) (mod p)임이 자명함에 의해
	n! × {r! × (n-r)!}^(p-2)를 계산하면 됨
	이때 값이 커져 오버플로우가 되는 것을 방지하기 위하여 모듈러 분배법칙
	ab mod p = ((a mod p)(b mod p)) mod p를 사용함
*/