package ans1;

import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int by4 = 0;
		int odd = 0;
		for(int i=0;i<N;i++){
			int a = io.nextInt();
			if(a%2==1){
				odd ++;
			}else if(a%4==0){
				by4 ++;
			}
		}
		System.out.println((odd+by4==N && odd<=by4+1)? "Yes":
							(odd<=by4)?"Yes":"No");
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}