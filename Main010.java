/*
��ƺ�����һԪ����ʽ�ĵ�������ע��xn��nΪ��������һ�׵���Ϊnxn?1����
�����ʽ:
��ָ���ݽ���ʽ�������ʽ������ϵ����ָ��������ֵ��Ϊ������ 1000 �������������ּ��Կո�ָ���
�����ʽ:
����������ͬ�ĸ�ʽ�����������ʽ�������ϵ����ָ�������ּ��Կո�ָ�������β�����ж���ո�ע�⡰�����ʽ����ָ����ϵ������ 0�����Ǳ�ʾΪ 0 0��
��������:
3 4 -5 2 6 1 -2 0    
�������:
12 3 -10 1 6 0
 */

import java.util.Scanner;

public class Main010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		while (sc.hasNext()) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			if (n != 0) {
				if (flag == 0) {
					System.out.print(x * n);
				} else {
					System.out.print(" " + x * n);
				}
				System.out.print(" " + (n - 1));
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.print("0 0");
		}
	}
}
