import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//matrix 1
		System.out.println("Matrix 1 : ");
		System.out.println("Rows matrix 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Coloumns  matrix 1: ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter Matrix Elements : ");
		int[][] arr1 = new int[n1][n2];
		
		for(int i=0; i<n1; i++){
		    for(int j=0; j<n2; j++){
		        arr1[i][j] = sc.nextInt();
		    }
		}
		
		//matrix 2
		System.out.println("Matrix 2 : ");
		System.out.println("Coloumns matrix 2: ");
		int n3 = sc.nextInt();
		
		System.out.println("Enter Matrix Elements : ");
		int[][] arr2 = new int[n2][n3];
		
		for(int i=0; i<n2; i++){
		    for(int j=0; j<n3; j++){
		        arr2[i][j] = sc.nextInt();
		    }
		}
	
		//matrix to store ans
		int[][] ans = new int[n1][n3];
		for(int i=0; i<n1; i++){
		    for(int j=0; j<n3; j++){
		        ans[i][j] = 0;
		    }
		}
		
		//Final Logic
		for(int i=0; i<n1; i++){
		    for(int j=0; j<n3; j++){
		        for(int k=0; k<n2; k++){
		            ans[i][j] += arr1[i][k] * arr2[k][j];
		        }
		    }
		}
		
		System.out.println("Matrix Ans : ");
		for(int i=0; i<n1; i++){
		    for(int j=0; j<n3; j++){
		        System.out.print("["+ans[i][j]+"] ");
		    }
		    System.out.println();
		}
		
	}
}