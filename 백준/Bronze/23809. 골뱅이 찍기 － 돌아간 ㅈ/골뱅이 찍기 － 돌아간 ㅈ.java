import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) System.out.print('@');
            for (int j = 0; j < 3 * N; ++j) System.out.print(' ');
            for (int j = 0; j < N; ++j) System.out.print('@');
            System.out.print('\n');
        }

        // N개의 줄에 N개의 골뱅이, 2N개의 공백, N개의 골뱅이
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) System.out.print('@');
            for (int j = 0; j < 2 * N; ++j) System.out.print(' ');
            for (int j = 0; j < N; ++j) System.out.print('@');
            System.out.print('\n');
        }

        // N개의 줄에 3N개의 골뱅이
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < 3 * N; ++j) System.out.print('@');
            System.out.print('\n');
        }

        // N개의 줄에 N개의 골뱅이, 2N개의 공백, N개의 골뱅이
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) System.out.print('@');
            for (int j = 0; j < 2 * N; ++j) System.out.print(' ');
            for (int j = 0; j < N; ++j) System.out.print('@');
            System.out.print('\n');
        }

        // N개의 줄에 N개의 골뱅이, 3N개의 공백, N개의 골뱅이
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) System.out.print('@');
            for (int j = 0; j < 3 * N; ++j) System.out.print(' ');
            for (int j = 0; j < N; ++j) System.out.print('@');
            System.out.print('\n');
        }
    }
}