/*
����һ��Ӣ�Ҫ�����д���򣬽��������е��ʵ�˳��ߵ������
�����ʽ��
�����������һ��������������һ���ڸ����ܳ��Ȳ����� 80 ���ַ������ַ��������ɵ��ʺ����ɿո���ɣ����е�������Ӣ����ĸ����Сд�����֣���ɵ��ַ���������֮���� 1 ���ո�ֿ������뱣֤����ĩβû�ж���Ŀո�
�����ʽ��
ÿ���������������ռһ�У���������ľ��ӡ�
����������
Hello World Here I Come   
���������
Come I Here World Hello
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main009 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		for (int i = str.length - 1; i > 0; i--) {
			System.out.print(str[i] + " ");
		}
		System.out.println(str[0]);
	}
}
