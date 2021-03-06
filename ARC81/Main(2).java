package ans2;

import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S1 = in.next();
		String S2 = in.next();
		
		int MAX = 1000000007;
		long ans = 1;
		
		int i=0;
		boolean vartical;
		if(S1.charAt(0)==S2.charAt(0)){
			ans *= 3;
			vartical = true;
			i++;
		}else{
			ans *= 6;
			vartical = false;
			i += 2;
		}
		
		while(i<N){
			if(S1.charAt(i)==S2.charAt(i)){
				ans *= (vartical)? 2: 1;
				ans %= MAX;
				vartical = true;
				i++;
			}else{
				ans *= (vartical)? 2: 3;
				ans %= MAX;
				vartical = false;
				i += 2;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}