/*
С������Щ������һ���Լ�ϲ�����鴮�������ӵ�̯���кܶമ������ɫ���鴮�����ǲ��ϰ��κ�һ����ɢ����������С��Ҫ���æ�ж�һ�£�ĳ���������Ƿ������ȫ���Լ���Ҫ�����ӣ�����ǣ���ô�������ж��ٶ�������ӣ�������ǣ���ô������ȱ�˶������ӡ�Ϊ���������������[0-9]��[a-z]��[A-Z]��Χ�ڵ��ַ�����ʾ��ɫ.
�����ʽ��
ÿ���������1������������ÿ�����������ֱ���2�����Ⱥ����̯�����鴮��С���������鴮��������������1000�����ӡ�
�����ʽ��
�������������һ���������Yes���Լ��ж��ٶ�������ӣ����������������һ���������No���Լ�ȱ�˶������ӡ������1���ո�ָ���
��������1��
ppRYYGrrYBR2258
YrR8RrY
�������1��
Yes 8
��������2��
ppRYYGrrYB225
YrR8RrY
�������2��
No 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main039 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		String[] str1 = s1.split("");
		String[] str2 = s2.split("");
		
		List list = new ArrayList();
		for(int i=0;i<str1.length;i++) {
			list.add(str1[i]);
		}
		int count = 0;
		for(int i=0;i<str2.length;i++) {
			for(int j=0;j<list.size();j++) {
				if(str2[i].equals(list.get(j))) {
					count++;
					list.remove(j);
					break;
				}
			}
		}
		if(count==str2.length) {
			System.out.println("Yes "+(str1.length-str2.length));
		}else {
			System.out.println("No "+(str2.length-count));
		}
	}
}
