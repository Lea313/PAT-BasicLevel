//Java���һ���㳬ʱ������
/*
����Ҫ����� N ��ѧ���ĳɼ��������ĳһ����������ѧ�����������

�����ʽ��

�����ڵ� 1 �и��������� 10?5?? �������� N����ѧ�������������һ�и��� N ��ѧ���İٷ��������ɼ����м��Կո�ָ������һ�и���Ҫ��ѯ�ķ������� K�������� N ����������������� K ���������м��Կո�ָ���

�����ʽ��

��һ���а���ѯ˳������÷ֵ���ָ��������ѧ���������м��Կո�ָ�������ĩ�����ж���ո�

����������

1060 75 90 55 75 99 82 90 75 503 75 90 88

���������

3 2 0

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main038 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] str = bf.readLine().split("\\s");
		String[] s = bf.readLine().split("\\s");
		int[] score = new int[105];
		
		for(int i=0;i<n;i++) {
			score[Integer.parseInt(str[i])]++;
		}
		int m = Integer.parseInt(s[0]);
		
		for(int i=0;i<m-1;i++) {
			System.out.print(score[Integer.parseInt(s[i+1])]+" ");
		}
		System.out.print(score[Integer.parseInt(s[m])]);
	}
}
