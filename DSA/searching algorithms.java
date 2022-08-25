import java.util.*;

public class Main {
	
	//Linear_Search_Algorithm
	public static void linearSearch(int[] arr, int n, int key ){
	    for(int i=0; i<arr.length; i++){
	        if(arr[i] == key){
	            System.out.println("key " + key + " is at index [" + i + "]");
	        }
	    }
	}
	
	//Binary_Search_Algorithm
	public static int binarySearch(int[] arr, int n, int key){   
	    int s = 0; int e = n;

	    while(s<=e){
	        int mid = (s+e)/2;
	        
	        if(arr[mid] == key){
	            return mid;
	        }
	        else if(arr[mid] < key){
	            s = mid +1;
	        }
	        else if(arr[mid] > key){
	            e = mid - 1;
	        }  
	    }
	    
	    return -1;
	}
	
	//Driver_Code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the value to search in array : ");
		int k = sc.nextInt();
		
		
		int b = binarySearch(arr, arr.length, k);
		
		System.out.println("key " + k + " is at index " + b);
		
	}
}