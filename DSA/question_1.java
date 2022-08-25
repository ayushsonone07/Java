import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
		    if(arr[i] < minimum){
		        minimum = arr[i];
		    }
		    else if(arr[i] > maximum){
		        maximum = arr[i];
		    }
		}	
		System.out.println("maximum : " + maximum);
		System.out.println("minimum : " + minimum);
	}
}