import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int N=Integer.parseInt(st.nextToken());
        int P=Integer.parseInt(st.nextToken());
        int min=0;
        
        Stack<Integer>[] stacks=new Stack[P+1];
        for(int i=1; i<=P;i++){
            stacks[i]=new Stack<>();
        }
        
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());
            int fret=Integer.parseInt(st.nextToken());
            
            Stack<Integer> stack=stacks[num];
            
            while(!stack.isEmpty()&&stack.peek()>fret){
                stack.pop();
                min++;
            }
            
            if(!stack.isEmpty()&&stack.peek()==fret){
                continue;
            }
            stack.push(fret);
            min++;
        }
        System.out.print(min);
    }
}