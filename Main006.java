/*
����������ĸ B ����ʾ���١�����ĸ S ��ʾ��ʮ������ 12...n ����ʾ��Ϊ��ĸ�λ���� n��<10����������ʽ�������һ�������� 3 λ�������������� 234 Ӧ�ñ����Ϊ BBSSS1234����Ϊ���� 2 �����١���3 ����ʮ�����Լ���λ�� 4��
�����ʽ��
ÿ������������� 1 ���������������������� n��<1000����
�����ʽ��
ÿ���������������ռһ�У��ù涨�ĸ�ʽ��� n��

�������� 1��
234  
������� 1��
BBSSS1234
   
�������� 2��
23  
������� 2��
SS123

 */

import java.util.Scanner;

public class Main006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n/100!=0) {
			for(int i=0;i<n/100;i++) {
				System.out.print("B");
			}
			n = n%100;
		}
		if(n/10!=0) {
			for(int i=0;i<n/10;i++) {
				System.out.print("S");
			}
			n = n%10;
		}
		for(int i=1;i<=n;i++) {
			System.out.print(i);
		}
	}
}
