/*
���������� 13 ���Ƽ����ģ�
�����˵� 0 �������˳�Ϊ tret��
���������� 1 �� 12 �Ļ����ķֱ�Ϊ��jan, feb, mar, apr, may, jun, jly, aug, sep, oct, nov, dec��
�����˽���λ�Ժ�� 12 ����λ���ֱַ��Ϊ��tam, hel, maa, huh, tou, kes, hei, elo, syy, lok, mer, jou��
��������˵����� 29 ����ɻ����ľ��� hel mar���������� elo nov ��Ӧ�������� 115��Ϊ�˷��㽻���������д����ʵ�ֵ���ͻ�������֮��Ļ��롣
�����ʽ��
�����һ�и���һ�������� N��<100������� N �У�ÿ�и���һ�� [0, 169) �����ڵ����� ���� �����ǵ����ģ������ǻ����ġ�
�����ʽ��
��Ӧ�����ÿһ�У���һ���������������һ�����Ե����֡�
����������
4
29
5
elo nov
tam
���������
hel mar
may
115
13
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main044 {
	
	static String[] low = {"tret","jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
	static String[] high = {"tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++) {
			String re = bf.readLine();
			if(re.charAt(0)>='0'&&re.charAt(0)<='9') {
				EtoM(Integer.parseInt(re));
			}else {
				MtoE(re);
			}
		}
	}
	
	public static void EtoM(int n) {
		if(n/13!=0) {
			int h = n/13;
			int l = n%13;
			if(l==0) {
				System.out.println(high[h-1]);
			}else {
				System.out.println(high[h-1]+" "+low[l]);
			}
			
		}else {
			int l = n%13;
			System.out.println(low[l]);
		}
	}
	
	public static void MtoE(String s) {
		String[] str = s.split(" ");
		int res = 0;
		if(str.length>1) {
			for(int i=0;i<high.length;i++) {
				if(str[0].equals(high[i])) {
					res = 13*(i+1);
				}
			}
			for(int i=0;i<low.length;i++) {
				if(str[1].equals(low[i])) {
					res += i;
				}
			}
			
		}else {
			for(int i=0;i<low.length;i++) {
				if(str[0].equals(low[i])) {
					res = i;
				}
			}
			for(int i=0;i<high.length;i++) {
				if(str[0].equals(high[i])) {
					res = 13*(i+1);
				}
			}
		}
		
		System.out.println(res);
	}
}
