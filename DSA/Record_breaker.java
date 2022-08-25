import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		arr[n] = -1;
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		if(n == 1){
		    System.out.println("1");
		}
		
		int ans = 0;
		int mx = -1;
		
		for(int i=0; i<arr.length; i++){
		    if(arr[i]> mx &&  arr[i]>arr[i+1]){
		        ans++;
		    }
		    mx = Math.max(mx, arr[i]);
		}
		
		System.out.println(ans);
	}
}