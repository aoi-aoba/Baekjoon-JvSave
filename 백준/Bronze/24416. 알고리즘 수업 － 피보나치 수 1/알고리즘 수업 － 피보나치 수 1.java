import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int fibCnt = 0;
	public static int fibonacciCnt = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		fib(n);
		fibonacci(n);
		
		System.out.println(fibCnt + " " + fibonacciCnt);
		
	}

	private static int fib(int n) {
		if(n == 1 || n == 2) {
			fibCnt++;
			return 1;
		}
		else return (fib(n-1) + fib(n-2));
	}
	
	private static int fibonacci(int n) {
		int[] f = new int[n+1];
		f[1] = f[2] = 1;
		for(int i=3; i<=n; i++) {
			fibonacciCnt++;
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
}