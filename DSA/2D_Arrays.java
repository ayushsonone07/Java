import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i =0; i<n; i++){
		    for(int j=0; j<m; j++){
		        arr[i][j] = sc.nextInt();
		    }
		}
		
		for(int k=0; k<n; k++){
		    for(int l=0; l<m; l++){
		        System.out.print("[ "+arr[k][l]+" ]");
		    }
		    System.out.println();
		}
	}
}