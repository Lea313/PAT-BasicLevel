//���һ���㳬ʱ������
/*
�ɼ����ϻ��˼���������������һ�����ֵ�ʱ�򣬶�Ӧ���ַ��Ͳ�����֡����ڸ���Ӧ�������һ�����֡��Լ���������Щ��������Ľ�����ֻ���������
�����ʽ��
������ 2 ���зֱ������������Щ�����Լ�Ӧ����������֡����ж�ӦӢ����ĸ�Ļ����Դ�д������ÿ�������ǲ����� 10?5?? ���ַ��Ĵ������õ��ַ�������ĸ [a-z, A-Z]������ 0-9���Լ��»��� _������ո񣩡�,��.��-��+�������ϵ���������Ŀ��֤�� 2 ����������ִ��ǿա�
ע�⣺����ϵ��������ˣ���ô��д��Ӣ����ĸ�޷��������
�����ʽ��
��һ��������ܹ�������Ľ�����֡����û��һ���ַ��ܱ��������������С�
����������
7+IE.
7_This_is_a_test.
���������
_hs_s_a_tst

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main033t {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		printRes(s1,s2);
	}
	
	public static void printRes(String s1, String s2) {
		String[] str1 = s1.split("");
		String[] str2 = s2.split("");		
		int flag = 0 ;
		
		for(int i=0;i<str2.length;i++) {
			flag = 0;
			
			for(int j=0;j<str1.length;j++) {
				if(str2[i].equals(str1[j])||str2[i].equals(str1[j].toLowerCase())) {
					flag = 1;
				}
								
				if(str1[j].equals("+")&&str2[i].charAt(0)>='A'&&str2[i].charAt(0)<='Z') {
					flag = 1;
				}
			}
						
			if(flag==0) {
				System.out.print(str2[i]);
			}
		}		
	}
}
