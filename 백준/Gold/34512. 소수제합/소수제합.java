import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine().trim());

        if (N == 2) {
            System.out.println(-1);
            return;
        }
        if (N == 3) {
            System.out.println("2 5 29");
            return;
        }
        if (N == 4) {
            System.out.println("2 2 3 17");
            return;
        }

        List<int[]> residues = new ArrayList<>();
        for (int r2 = 0; r2 < 30; r2++) {
            for (int r3 = 0; r3 < 30; r3++) {
                if ((r2 + r3) % 5 != 0) continue;
                for (int r5 = 0; r5 < 30; r5++) {
                    if ((r3 + r5) % 2 == 0 && (r2 + r5) % 3 == 0) {
                        residues.add(new int[]{r2, r3, r5});
                    }
                }
            }
        }

        long finalC2 = 0, finalC3 = 0, finalC5 = 0;
        boolean found = false;

        for (int[] r : residues) {
            long s = (long) r[0] + r[1] + r[2];
            if (s > N) continue;
            if ((N - s) % 30 != 0) continue;
            long t = (N - s) / 30;

            java.util.function.Predicate<long[]> valid = arr -> {
                int nz = 0;
                if (arr[0] > 0) nz++;
                if (arr[1] > 0) nz++;
                if (arr[2] > 0) nz++;
                return nz >= 2;
            };

            long c2 = r[0] + 30 * t, c3 = r[1], c5 = r[2];
            if (valid.test(new long[]{c2, c3, c5})) {
                finalC2 = c2; finalC3 = c3; finalC5 = c5; found = true; break;
            }

            if (t >= 1) {
                long c2a = r[0] + 30 * (t - 1), c3a = r[1] + 30, c5a = r[2];
                if (c2a >= 0 && valid.test(new long[]{c2a, c3a, c5a})) {
                    finalC2 = c2a; finalC3 = c3a; finalC5 = c5a; found = true; break;
                }
                long c2b = r[0] + 30 * (t - 1), c3b = r[1], c5b = r[2] + 30;
                if (c2b >= 0 && valid.test(new long[]{c2b, c3b, c5b})) {
                    finalC2 = c2b; finalC3 = c3b; finalC5 = c5b; found = true; break;
                }
                if (t >= 2) {
                    long c2c = r[0] + 30 * (t - 2), c3c = r[1] + 30, c5c = r[2] + 30;
                    if (c2c >= 0 && valid.test(new long[]{c2c, c3c, c5c})) {
                        finalC2 = c2c; finalC3 = c3c; finalC5 = c5c; found = true; break;
                    }
                }
            }

            int cap = 500;
            if (t <= cap && !found) {
                for (long t2 = 0; t2 <= t && !found; t2++) {
                    for (long t3 = 0; t3 <= t - t2 && !found; t3++) {
                        long t5 = t - t2 - t3;
                        long cc2 = r[0] + 30 * t2;
                        long cc3 = r[1] + 30 * t3;
                        long cc5 = r[2] + 30 * t5;
                        if (valid.test(new long[]{cc2, cc3, cc5})) {
                            finalC2 = cc2; finalC3 = cc3; finalC5 = cc5;
                            found = true;
                        }
                    }
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < finalC2; i++) sb.append("2 ");
        for (long i = 0; i < finalC3; i++) sb.append("3 ");
        for (long i = 0; i < finalC5; i++) sb.append("5 ");
        System.out.println(sb);
    }
}
