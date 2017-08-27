package ans3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		String A = in.next();
		LinkedList<Integer[]> alph = new LinkedList<>();
		HashSet<Integer> set = new HashSet<>();
		
		Integer[] list = new Integer[52]; // 0-25 right, 26-51 left
		
		
		for(int i=A.length();i>0;i--){
			int cr = A.charAt(i-1) - 'a';
			if(set.contains(cr)){
				list[26+cr] = i;
			}else{
				list[cr] = i;
				list[26 + cr] = i;
				set.add(cr);
				if(set.size()==26){
					alph.push(list);
					list = new Integer[52];
					set = new HashSet<Integer>();
				}
			}
		}
		
		StringBuffer buf = new StringBuffer();
		int left = 1;
		for(int i=0;i<26;i++){
			if(list[i]==null || list[i]<left){
				buf.append((char)('a'+i));
				if(alph.isEmpty()){
					System.out.println(buf.toString());
					return;
				}
				list = alph.pop();
				left = list[26+i] + 1;
				i = -1;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
