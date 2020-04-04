
/*
����һ�������� n���������λ����֮�ͣ��ú���ƴ��д���͵�ÿһλ���֡�
�����ʽ��
ÿ������������� 1 ��������������������Ȼ�� n ��ֵ�����ﱣ֤ n С�� 10^100��
??��
�����ʽ��
��һ������� n �ĸ�λ����֮�͵�ÿһλ��ƴ�����ּ��� 1 �ո񣬵�һ�������һ��ƴ�����ֺ�û�пո�

����������
1234567890987654321123456789
 
���������
yi san wu

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main002 {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] str = s.split("");
		int[] num = new int[str.length];
		int sum = 0;
		
		for(int i=0;i<str.length;i++) {
			num[i] = Integer.parseInt(str[i]);
			sum += num[i];
		}
		
		String[] str2 = String.valueOf(sum).split("");//sumֵ
		int[] num2 = new int[str2.length];//����sumֵ�ĸ�λ��
		
		for(int i=0;i<str2.length;i++) {
			num2[i] = Integer.parseInt(str2[i]);
			toPinyin(num2[i]);
		}
		
		System.out.println(sb.toString().trim());
		
	}
	public static void toPinyin(int n) {		
		switch (n) {
		case 1:
			sb.append("yi").append(" ");			
			break;
		case 2:
			sb.append("er").append(" ");			
			break;
		case 3:
			sb.append("san").append(" ");			
			break;		
		case 4:
			sb.append("si").append(" ");			
			break;
		case 5:
			sb.append("wu").append(" ");			
			break;
		case 6:
			sb.append("liu").append(" ");			
			break;
		case 7:
			sb.append("qi").append(" ");			
			break;
		case 8:
			sb.append("ba").append(" ");			
			break;
		case 9:
			sb.append("jiu").append(" ");			
			break;
		case 0:
			sb.append("ling").append(" ");			
			break;
		default:
			break;
		}
	}
	
}
