import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str;
        while(true) {
            if(!sc.hasNextLine()) break;
            str = sc.nextLine();
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == 'i') sb.append('e');
                else if(str.charAt(i) == 'e') sb.append('i');
                else if(str.charAt(i) == 'I') sb.append('E');
                else if(str.charAt(i) == 'E') sb.append('I');
                else sb.append(str.charAt(i));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}