/*
正整数 A 的“DA（为 1 位整数）部分”定义为由 A 中所有 DA组成的新整数 PA。例如：给定 A=3862767，DA=6，则 A 的“6 部分”PA是 66，因为 A 中有 2 个 6。现给定 A、DA、B、DB，请编写程序计算 PA+PB。
输入格式：
输入在一行中依次给出 A、DA、B、DB，中间以空格分隔，其中 0<A,B<10^10。

输出格式：
在一行中输出 PA+PB的值。
输入样例 1：
3862767 6 13530293 3    
输出样例 1：
399
   
输入样例 2：
3862767 1 13530293 8 
输出样例 2：
0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main016 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		String[] a = str[0].split("");
		int da = Integer.parseInt(str[1]);
		String[] b = str[2].split("");
		int db = Integer.parseInt(str[3]);

		int count1 = 0, count2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(String.valueOf(da))) {
				count1++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i].equals(String.valueOf(db))) {
				count2++;
			}
		}
		
		int num1 = 0, num2 = 0;
		for (int i = 0; i < count1; i++) {
			num1 = num1 * 10 + da;
		}
		for (int i = 0; i < count2; i++) {
			num2 = num2 * 10 + db;
		}
		
		System.out.println(num1 + num2);
	}
}
