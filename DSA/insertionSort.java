import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		//Insertion sort
		for(int i=1; i<n; i++){
		    int curr = arr[i];
		    int j = i-1;
		    while(arr[j] > curr && j>=0){
		        arr[j+1] = arr[j];
		        j--;
		    }
		    arr[j+1] = curr;
		}
		
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i] + " ");
		}
	}
}