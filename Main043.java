/*
给定一个长度不超过 10^4的、仅由英文字母构成的字符串。请将字符重新调整顺序，按 PATestPATest.... 这样的顺序输出，并忽略其它字符。当然，六种字符的个数不一定是一样多的，若某种字符已经输出完，则余下的字符仍按 PATest 的顺序打印，直到所有字符都被输出。
输入格式：
输入在一行中给出一个长度不超过 10
?4
??的、仅由英文字母构成的非空字符串。
输出格式：
在一行中按题目要求输出排序后的字符串。题目保证输出非空。
输入样例：
redlesPayBestPATTopTeePHPereatitAPPT   
输出样例：
PATestPATestPTetPTePePee
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main043 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split("");
		int countP = 0, countA = 0, countT = 0,counte = 0, counts = 0,countt = 0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("P")) {
				countP++;
			}
			if(str[i].equals("A")) {
				countA++;
			}
			if(str[i].equals("T")) {
				countT++;
			}
			if(str[i].equals("e")) {
				counte++;
			}
			if(str[i].equals("s")) {
				counts++;
			}
			if(str[i].equals("t")) {
				countt++;
			}
		}
		while(countP>0||countA>0||countT>0||counte>0||counts>0||countt>0) {
			if(countP>0) {
				System.out.print("P");
				countP--;
			}
			if(countA>0) {
				System.out.print("A");
				countA--;
			}
			if(countT>0) {
				System.out.print("T");
				countT--;
			}
			if(counte>0) {
				System.out.print("e");
				counte--;
			}
			if(counts>0) {
				System.out.print("s");
				counts--;
			}
			if(countt>0) {
				System.out.print("t");
				countt--;
			}
		}
	}
}
