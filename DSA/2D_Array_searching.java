import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows : ");
		int n = sc.nextInt();
		System.out.print("Enter Coloumns : ");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i=0; i<n; i++){
		    for(int j=0; j<m; j++){
		        arr[i][j] = sc.nextInt();
		    }
		}
		
		System.out.print("enter Key to Search : ");
		
		int k = sc.nextInt();
		
		for(int i=0; i<n; i++){
		    for(int j=0; j<m; j++){
		        if(arr[i][j] == k){
		            System.out.print("["+k+"] is at index ["+i+","+j+"]");
		        }
		    }
		}
	}
}