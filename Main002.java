
/*
读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
输入格式：
每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10^100。
??。
输出格式：
在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。

输入样例：
1234567890987654321123456789
 
输出样例：
yi san wu

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main002 {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] str = s.split("");
		int[] num = new int[str.length];
		int sum = 0;
		
		for(int i=0;i<str.length;i++) {
			num[i] = Integer.parseInt(str[i]);
			sum += num[i];
		}
		
		String[] str2 = String.valueOf(sum).split("");//sum值
		int[] num2 = new int[str2.length];//保存sum值的各位数
		
		for(int i=0;i<str2.length;i++) {
			num2[i] = Integer.parseInt(str2[i]);
			toPinyin(num2[i]);
		}
		
		System.out.println(sb.toString().trim());
		
	}
	public static void toPinyin(int n) {		
		switch (n) {
		case 1:
			sb.append("yi").append(" ");			
			break;
		case 2:
			sb.append("er").append(" ");			
			break;
		case 3:
			sb.append("san").append(" ");			
			break;		
		case 4:
			sb.append("si").append(" ");			
			break;
		case 5:
			sb.append("wu").append(" ");			
			break;
		case 6:
			sb.append("liu").append(" ");			
			break;
		case 7:
			sb.append("qi").append(" ");			
			break;
		case 8:
			sb.append("ba").append(" ");			
			break;
		case 9:
			sb.append("jiu").append(" ");			
			break;
		case 0:
			sb.append("ling").append(" ");			
			break;
		default:
			break;
		}
	}
	
}
