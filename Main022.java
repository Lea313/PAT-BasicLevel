/*
���������Ǹ�10��������A��B(<=2^30^-1)�����A+B��D (1 < D <= 10)��������
�����ʽ��
������һ�������θ���3������A��B��D��
�����ʽ��
���A+B��D��������
����������
123 456 8
���������
1103
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main022 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int d = Integer.parseInt(str[2]);
		int sum = a + b;
		toNjinzhi(sum, d);
	}

	public static void toNjinzhi(int a, int n) {
		int i = 0;
		int[] s = new int[100];
		if (a == 0) {
			System.out.print("0");
			return;
		}

		while (a != 0) {
			s[i++] = a % n;
			;
			a = a / n;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(s[j]);
		}
	}
}
