/*
����Ҫ����д������Ѹ����ķ��Ŵ�ӡ��ɳ©����״���������17����*����Ҫ�����и�ʽ��ӡ
*****
 ***
  *
 ***
*****
��ν��ɳ©��״������ָÿ��������������ţ����з������Ķ��룻�������з�������2���������ȴӴ�С˳��ݼ���1���ٴ�С����˳���������β��������ȡ�
��������N�����ţ���һ�����������һ��ɳ©��Ҫ���ӡ����ɳ©���õ������ܶ�ķ��š�
�����ʽ:
������һ�и���1��������N����1000����һ�����ţ��м��Կո�ָ���
�����ʽ:
���ȴ�ӡ���ɸ���������ɵ�����ɳ©��״�������һ�������ʣ��û�õ��ķ�������
��������:
19 *
�������:
*****
 ***
  *
 ***
*****
2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main027 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		char c = str[1].charAt(0);

		int line = (int) Math.sqrt((n + 1) / 2);

		for (int i = line - 1; i > 0; i--) {
			for (int j = 0; j < line - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 2 * i + 1; j > 0; j--) {
				System.out.print(c);
			}
			System.out.println();
		}

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println(n - line * line * 2 + 1);
	}
}
