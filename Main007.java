/*
�����Ƕ���dnΪ��dn=p(n+1)?pn������pi�ǵ�i����������Ȼ��d1=1���Ҷ���n>1��dn��ż�����������Բ��롱��Ϊ�����������������Ҳ�Ϊ2��������.�ָ�������������N(<105)������㲻����N���������������Եĸ�����
�����ʽ:
������һ�и���������N��
�����ʽ:
��һ�������������N���������������Եĸ�����
��������:
20   
�������:
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
