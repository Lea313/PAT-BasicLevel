/*
�ɼ����ϻ��˼���������������һ�����ֵ�ʱ�򣬶�Ӧ���ַ��Ͳ�����֡����ڸ���Ӧ�������һ�����֡��Լ�ʵ�ʱ���������֣������г��϶���������Щ����
�����ʽ��
������ 2 ���зֱ����Ӧ����������֡��Լ�ʵ�ʱ���������֡�ÿ�������ǲ����� 80 ���ַ��Ĵ�������ĸ A-Z��������Сд�������� 0-9���Լ��»��� _������ո���ɡ���Ŀ��֤ 2 ���ַ������ǿա�
�����ʽ��
���շ���˳����һ������������ļ�������Ӣ����ĸֻ�����д��ÿ������ֻ���һ�Ρ���Ŀ��֤������ 1 ��������
����������
7_This_is_a_test
_hs_s_a_es
   
���������
7TI
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main029 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s1 = bf.readLine().toUpperCase().split("");
		String[] s2 = bf.readLine().toUpperCase().split("");
		Set<String> set = new HashSet<String>();
		
		for(int i=0;i<s2.length;i++) {
			set.add(s2[i]);
		}
		int[] flag = new int[200];
		
		for(int i=0;i<s1.length;i++) {
			if(!set.contains(s1[i])&&flag[s1[i].charAt(0)]==0) {
				System.out.print(s1[i]);
				flag[s1[i].charAt(0)] = 1;
			}
		}		
	}
}
