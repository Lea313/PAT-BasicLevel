/*
�� P?i?? ��ʾ�� i �����������θ����������� M��N��10?4??������� P?M?? �� P?N?? ������������ 
�����ʽ��

������һ���и��� M �� N������Կո�ָ��� 
�����ʽ��

����� P?M?? �� P?N?? ������������ÿ 10 ������ռ 1 �У�����Կո�ָ�������ĩ�����ж���ո� 
����������

5 27

���������

11 13 17 19 23 29 31 37 41 43 
47 53 59 61 67 71 73 79 83 89 
97 101 103 

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main013 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		printSushu(m, n);
	}

	public static void printSushu(int m, int n) {
		int[] flag = new int[200005];
		for (int i = 2; i < 200005; i++) {
			boolean f = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					f = true;
					break;
				}
			}
			if (f == false) {
				flag[i]++;
			}
		}
		
		int index = 0;
		int change = 0;
		for (int i = 2; i < 200005; i++) {
			if (flag[i] != 0) {
				index++;
				if (index >= m && index < n) {
					if (change < 9) {
						System.out.print(i + " ");
						change++;
					} else {
						System.out.println(i);
						change = 0;
					}
				}
				if (index == n) {
					System.out.print(i);
				}
			}
		}
	}
}
