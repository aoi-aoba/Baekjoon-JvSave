import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        br.close();
        char[] array=str.toCharArray();
        int length = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]=='c'){
                if((i+1<array.length)&&(array[i+1]=='=')){
                    i++;
                    length++;
                }
                else if((i+1<array.length)&&(array[i+1]=='-')){
                    i++;
                    length++;
                }
                else{
                    length++;
                }
            }
            else if(array[i]=='d'){
                if((i+1<array.length)&&(array[i+1]=='z')){
                    if((i+2<array.length)&&(array[i+2]=='=')){
                        i=i+2;
                        length++;
                    }
                    else{
                        length++;
                    }
                }
                else if((i+1<array.length)&&(array[i+1]=='-')){
                    i++;
                    length++;
                }
                else{
                    length++;
                }
            }
            else if(array[i]=='l'){
                if((i+1<array.length)&&(array[i+1]=='j')){
                    i++;
                    length++;
                }
                else{
                    length++;
                }
            }
            else if(array[i]=='n'){
                if((i+1<array.length)&&(array[i+1]=='j')){
                    i++;
                    length++;
                }
                else{
                    length++;
                }
            }
            else if(array[i]=='s'){
                if((i+1<array.length)&&(array[i+1]=='=')){
                    i++;
                    length++;
                }
                else{
                    length++;
                }
            }
            else if(array[i]=='z'){
                if((i+1<array.length)&&(array[i+1]=='=')){
                    i++;
                    length++;
                }
                else{
                    length++;
                }
            }
            else {
                length++;
            }
        }
        System.out.print(length);
    }
}