import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		int prevDiff = arr[1] - arr[0];
		int curr =2, ans = 2;
		
		for(int i=2; i<n; i++){
		    
		    int currDiff = arr[i] - arr[i-1];
		    
		    if(prevDiff == currDiff){
		        curr++;
		    }
		    
		    else{
		        prevDiff = currDiff;
		        curr = 2;
		    }
		    
		    ans = Math.max(ans,curr);
		}
		
		System.out.println(ans);
	}
}