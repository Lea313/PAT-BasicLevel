/*
让我们定义dn为：dn=p(n+1)?pn，其中pi是第i个素数。显然有d1=1，且对于n>1有dn是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”.现给定任意正整数N(<105)，请计算不超过N的满足猜想的素数对的个数。
输入格式:
输入在一行给出正整数N。
输出格式:
在一行中输出不超过N的满足猜想的素数对的个数。
输入样例:
20   
输出样例:
4
 */

import java.util.Scanner;

public class Main007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sushudui(n);
	}

	public static int sushudui(int n) {
		int i = 0, j = 0;
		int count = 0, pre = 2;
		
		for (i = 3; i <= n; i++) {
			for (j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (j > Math.sqrt(i)) {
				if (i - pre == 2) {
					count++;
				}
				pre = i;
			}
		}

		System.out.println(count);
		return count;
	}
}
