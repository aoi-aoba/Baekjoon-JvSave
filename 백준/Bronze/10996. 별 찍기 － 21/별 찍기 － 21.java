import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N*2; i++) {
            for (int j = 0; j < N; j++) {
                if ((i+j)%2==0){
                    System.out.print("*");
                }
                if ((i+j)%2!=0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}