package ans1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		
		Arrays.sort(A);
		
		long ans = 1;
		int count = 0;
		int prev = A[N-1];
		for(int i=N-2;i>=0;i--){
			if(A[i]==prev){
				ans *= prev;
				count ++;
				prev = 0;
			}else{
				prev = A[i];
			}
			if(count==2){
				System.out.println(ans);
				return;
			}
		}
		
		System.out.println(0);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}