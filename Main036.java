/*
������ͳ�°��������������˶�ѧϰ��̣��������������д���룬��Ϊ������ʷ����λ��д������������ͳ��2014 ��ף�Ϊ��ף���������ѧ�����ܡ���ʽ�������°����д�˺ܼ򵥵ļ�������룺����Ļ�ϻ�һ�������Ρ�������Ҳ����һ�𻭰ɣ�
�����ʽ��
������һ���и��������α߳� N��3��N��20������������αߵ�ĳ���ַ� C�����һ���ո�
�����ʽ��
����ɸ����ַ� C �����������Ρ�����ע�⵽�м����м�������Ϊ���ý������ȥ���������Σ��������������ʵ������������ 50%����������ȡ������
����������
10 a   
���������
aaaaaaaaaa
a        a
a        a
a        a
aaaaaaaaaa
 */

import java.util.Scanner;

public class Main036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		char c = sc.next().charAt(0);
		int row = (int)Math.round(n/2);
		
		for(int i=0;i<row;i++) {
			if(i==0||i==row-1) {
				for(int j=0;j<n;j++) {
					System.out.print(c);
				}
			}else {
				for(int j=0;j<n;j++) {
					if(j==0||j==n-1) {
						System.out.print(c);
					}else {
						System.out.print(" ");
					}
				}				
			}			
			System.out.println();
		}
	}
}
