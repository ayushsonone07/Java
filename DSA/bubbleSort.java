import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		//BubbleSort
		int count = 1;
		while(count < n){
		    for(int i=0; i<n-count; i++){
		        if(arr[i] > arr[i+1]){
		            int temp = arr[i];
		            arr[i] = arr[i+1];
		            arr[i+1] = temp;
		        }
		    }
		    count++;
		}
		/////////////////////////)))))//
	
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i] + " ");
		}
	}
}