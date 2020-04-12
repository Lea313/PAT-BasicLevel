/*
字符串APPAPT中包含了两个单词“PAT”，其中第一个PAT是第2位(P),第4位(A),第6位(T)； 
第二个PAT是第3位(P),第4位(A),第6位(T)。 
现给定字符串，问一共可以形成多少个PAT？ 
输入格式： 
输入只有一行，包含一个字符串，长度不超过105，只包含P、A、T三种字母。 
输出格式： 
在一行中输出给定字符串中包含多少个PAT。由于结果可能比较大，只输出对 
1000000007取余数的结果。 
输入样例： 
APPAPT 
输出样例： 
2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main040 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] str = bf.readLine().toCharArray();
		int countp = 0,countt = 0, res = 0;
		for(int i=0;i<str.length;i++) {
			if(str[i]=='T') {
				countt++;
			}
		}
		for(int i=0;i<str.length;i++) {
			if(str[i]=='P') {
				countp++;
			}
			if(str[i]=='T') {
				countt--;
			}
			if(str[i]=='A') {
				res = (res + (countp*countt)%1000000007)%1000000007;
			}
		}
		System.out.println(res);
	}
}
