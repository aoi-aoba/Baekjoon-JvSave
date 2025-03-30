import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    
	    int n = Integer.parseInt(br.readLine());
	    int [][] arr = new int[n][3];
	    int [] score = new int[n];
	    
	    for(int i=0;i<n;i++){
	        st = new StringTokenizer(br.readLine());
	        
	        arr[i][0] = Integer.parseInt(st.nextToken());
	        arr[i][1] = Integer.parseInt(st.nextToken());
	        arr[i][2] = Integer.parseInt(st.nextToken());
	  
	    }
	    for(int i=0;i<3;i++){
	        for(int j=0;j<n;j++){
	            boolean unique = true;
	            for(int k=0;k<n;k++){
	                if(k!=j && arr[j][i]==arr[k][i]){
	                    unique = false;
	                    break;
	                }
	            }
	            if(unique){
	                score[j]+=arr[j][i];
	            }
	        }
	    }
	    
	    for(int i=0;i<n;i++){
	        System.out.println(score[i]);
	    }	    
	}
}