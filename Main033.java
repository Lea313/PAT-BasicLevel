//最后一个点超时。。。
/*
旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及坏掉的那些键，打出的结果文字会是怎样？
输入格式：
输入在 2 行中分别给出坏掉的那些键、以及应该输入的文字。其中对应英文字母的坏键以大写给出；每段文字是不超过 10?5?? 个字符的串。可用的字符包括字母 [a-z, A-Z]、数字 0-9、以及下划线 _（代表空格）、,、.、-、+（代表上档键）。题目保证第 2 行输入的文字串非空。
注意：如果上档键坏掉了，那么大写的英文字母无法被打出。
输出格式：
在一行中输出能够被打出的结果文字。如果没有一个字符能被打出，则输出空行。
输入样例：
7+IE.
7_This_is_a_test.
输出样例：
_hs_s_a_tst

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main033t {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		printRes(s1,s2);
	}
	
	public static void printRes(String s1, String s2) {
		String[] str1 = s1.split("");
		String[] str2 = s2.split("");		
		int flag = 0 ;
		
		for(int i=0;i<str2.length;i++) {
			flag = 0;
			
			for(int j=0;j<str1.length;j++) {
				if(str2[i].equals(str1[j])||str2[i].equals(str1[j].toLowerCase())) {
					flag = 1;
				}
								
				if(str1[j].equals("+")&&str2[i].charAt(0)>='A'&&str2[i].charAt(0)<='Z') {
					flag = 1;
				}
			}
						
			if(flag==0) {
				System.out.print(str2[i]);
			}
		}		
	}
}
