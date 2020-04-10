/*
给定任一个各位数字不完全相同的4位正整数，如果我们先把4个数字按非递增排序，再按非递减排序，然后用第1个数字减第2个数字，将得到一个新的数字。一直重复这样做，我们很快会停在有“数字黑洞”之称的6174，这个神奇的数字也叫Kaprekar常数。

例如，我们从6767开始，将得到

7766 - 6677 = 1089\ 9810 - 0189 = 9621\ 9621 - 1269 = 8352\ 8532 - 2358 = 6174\ 7641 - 1467 = 6174\ … …

现给定任意4位正整数，请编写程序演示到达黑洞的过程。

输入格式：

输入给出一个(0, 10000)区间内的正整数N。

输出格式：

如果N的4位数字全相等，则在一行内输出“N - N = 0000”；否则将计算的每一步在一行内输出，直到6174作为差出现，输出格式见样例。注意每个数字按4位数格式输出。

输入样例1：

6767 
输出样例1：

7766 - 6677 = 1089 
9810 - 0189 = 9621 
9621 - 1269 = 8352 
8532 - 2358 = 6174 
输入样例2：

2222 
输出样例2：

2222 - 2222 = 0000

 */

import java.util.Arrays;
import java.util.Scanner;

public class Main019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printRes(n);
	}

	public static void printRes(int n) {

		if (n == 1111 || n == 2222 || n == 3333 || n == 4444 || n == 5555 || n == 6666 || n == 7777 || n == 8888
				|| n == 9999) {
			System.out.printf("%04d - %04d = %04d", n, n, n - n);
			return;
		}

		int a = 0, b = 0;

		while (b - a != 6174) {
			String fm = String.format("%04d", n);
			String[] s = fm.split("");
			int[] nums = new int[s.length];

			for (int i = 0; i < s.length; i++) {
				nums[i] = Integer.parseInt(s[i]);
			}

			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			Arrays.sort(nums);

			for (int i = 0; i < nums.length; i++) {
				sb1.append(nums[i]);
			}
			for (int i = nums.length - 1; i >= 0; i--) {
				sb2.append(nums[i]);
			}

			a = Integer.parseInt(sb1.toString());
			b = Integer.parseInt(sb2.toString());

			System.out.printf("%04d - %04d = %04d", b, a, b - a);
			System.out.println();
			n = b - a;

		}
	}
}
