/*
一个数组A中存有N（>0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（≥0）个位置，即将A中的数据由（A0A1?AN?1）变换为（AN?M?AN?1A0A1?AN?M?1）（最后M个数循环移至最前面的M个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？
输入格式:
每个输入包含一个测试用例，第1行输入N（1≤N≤100）和M（≥0）；第2行输入N个整数，之间用空格分隔。
输出格式:
在一行中输出循环右移M位以后的整数序列，之间用空格分隔，序列结尾不能有多余空格。
输入样例:
6 2
1 2 3 4 5 6   
输出样例:
5 6 1 2 3 4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main008 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] fir = bf.readLine().split(" ");
		int n = Integer.parseInt(fir[0]);
		int m = Integer.parseInt(fir[1]);
		int[] arr = new int[n];
		String[] str = bf.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		m = m % n;
		
		for (int i = n - m; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < n - m - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print(arr[n - m - 1]);
	}
}
