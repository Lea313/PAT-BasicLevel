/*
火星人是以 13 进制计数的：
地球人的 0 被火星人称为 tret。
地球人数字 1 到 12 的火星文分别为：jan, feb, mar, apr, may, jun, jly, aug, sep, oct, nov, dec。
火星人将进位以后的 12 个高位数字分别称为：tam, hel, maa, huh, tou, kes, hei, elo, syy, lok, mer, jou。
例如地球人的数字 29 翻译成火星文就是 hel mar；而火星文 elo nov 对应地球数字 115。为了方便交流，请你编写程序实现地球和火星数字之间的互译。
输入格式：
输入第一行给出一个正整数 N（<100），随后 N 行，每行给出一个 [0, 169) 区间内的数字 —— 或者是地球文，或者是火星文。
输出格式：
对应输入的每一行，在一行中输出翻译后的另一种语言的数字。
输入样例：
4
29
5
elo nov
tam
输出样例：
hel mar
may
115
13
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main044 {
	
	static String[] low = {"tret","jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
	static String[] high = {"tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++) {
			String re = bf.readLine();
			if(re.charAt(0)>='0'&&re.charAt(0)<='9') {
				EtoM(Integer.parseInt(re));
			}else {
				MtoE(re);
			}
		}
	}
	
	public static void EtoM(int n) {
		if(n/13!=0) {
			int h = n/13;
			int l = n%13;
			if(l==0) {
				System.out.println(high[h-1]);
			}else {
				System.out.println(high[h-1]+" "+low[l]);
			}
			
		}else {
			int l = n%13;
			System.out.println(low[l]);
		}
	}
	
	public static void MtoE(String s) {
		String[] str = s.split(" ");
		int res = 0;
		if(str.length>1) {
			for(int i=0;i<high.length;i++) {
				if(str[0].equals(high[i])) {
					res = 13*(i+1);
				}
			}
			for(int i=0;i<low.length;i++) {
				if(str[1].equals(low[i])) {
					res += i;
				}
			}
			
		}else {
			for(int i=0;i<low.length;i++) {
				if(str[0].equals(low[i])) {
					res = i;
				}
			}
			for(int i=0;i<high.length;i++) {
				if(str[0].equals(high[i])) {
					res = 13*(i+1);
				}
			}
		}
		
		System.out.println(res);
	}
}
