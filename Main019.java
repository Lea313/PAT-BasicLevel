/*
������һ����λ���ֲ���ȫ��ͬ��4λ����������������Ȱ�4�����ְ��ǵ��������ٰ��ǵݼ�����Ȼ���õ�1�����ּ���2�����֣����õ�һ���µ����֡�һֱ�ظ������������Ǻܿ��ͣ���С����ֺڶ���֮�Ƶ�6174��������������Ҳ��Kaprekar������

���磬���Ǵ�6767��ʼ�����õ�

7766 - 6677 = 1089\ 9810 - 0189 = 9621\ 9621 - 1269 = 8352\ 8532 - 2358 = 6174\ 7641 - 1467 = 6174\ �� ��

�ָ�������4λ�����������д������ʾ����ڶ��Ĺ��̡�

�����ʽ��

�������һ��(0, 10000)�����ڵ�������N��

�����ʽ��

���N��4λ����ȫ��ȣ�����һ���������N - N = 0000�������򽫼����ÿһ����һ���������ֱ��6174��Ϊ����֣������ʽ��������ע��ÿ�����ְ�4λ����ʽ�����

��������1��

6767 
�������1��

7766 - 6677 = 1089 
9810 - 0189 = 9621 
9621 - 1269 = 8352 
8532 - 2358 = 6174 
��������2��

2222 
�������2��

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
