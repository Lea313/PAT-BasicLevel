/*
����һ�� k λ���� N=d?k?1??10?k?1??+?+d?1??10?1??+d?0?? (0��d?i??��9, i=0,?,k?1, d?k?1??>0)�����д����ͳ��ÿ�ֲ�ͬ�ĸ�λ���ֳ��ֵĴ��������磺���� N=100311������ 2 �� 0��3 �� 1���� 1 �� 3��

�����ʽ��

ÿ��������� 1 ��������������һ�������� 1000 λ�������� N��

�����ʽ��

�� N ��ÿһ�ֲ�ͬ�ĸ�λ���֣��� D:M �ĸ�ʽ��һ���������λ���� D ������ N �г��ֵĴ��� M��Ҫ�� D ���������

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main021 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split("");
		int[] nums = new int[str.length];
		int count;
		
		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = 0; j < str.length; j++) {
				nums[j] = Integer.parseInt(str[j]);
				if (nums[j] == i) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(i + ":" + count);
			}
		}
	}
}
