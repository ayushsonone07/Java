import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		int curr = 0;
		
		for(int i=0; i<arr.length; i++){
		    for(int j=i; j<arr.length; j++){
		        curr += arr[j];
		        System.out.println(curr);
		    }
		}
	}
}