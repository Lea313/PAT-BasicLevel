/*
输入两个非负10进制整数A和B(<=2^30^-1)，输出A+B的D (1 < D <= 10)进制数。
输入格式：
输入在一行中依次给出3个整数A、B和D。
输出格式：
输出A+B的D进制数。
输入样例：
123 456 8
输出样例：
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
