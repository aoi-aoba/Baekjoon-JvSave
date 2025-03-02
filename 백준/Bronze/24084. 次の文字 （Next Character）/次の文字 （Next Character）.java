import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        for(int i=0; i<N-1; i++) {
            if(str.charAt(i+1) == 'J')
                System.out.println(str.charAt(i));
        }

        sc.close();
    }
}