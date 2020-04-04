/*
������ A �ġ�DA��Ϊ 1 λ���������֡�����Ϊ�� A ������ DA��ɵ������� PA�����磺���� A=3862767��DA=6���� A �ġ�6 ���֡�PA�� 66����Ϊ A ���� 2 �� 6���ָ��� A��DA��B��DB�����д������� PA+PB��
�����ʽ��
������һ�������θ��� A��DA��B��DB���м��Կո�ָ������� 0<A,B<10^10��

�����ʽ��
��һ������� PA+PB��ֵ��
�������� 1��
3862767 6 13530293 3    
������� 1��
399
   
�������� 2��
3862767 1 13530293 8 
������� 2��
0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main016 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		String[] a = str[0].split("");
		int da = Integer.parseInt(str[1]);
		String[] b = str[2].split("");
		int db = Integer.parseInt(str[3]);

		int count1 = 0, count2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(String.valueOf(da))) {
				count1++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i].equals(String.valueOf(db))) {
				count2++;
			}
		}
		
		int num1 = 0, num2 = 0;
		for (int i = 0; i < count1; i++) {
			num1 = num1 * 10 + da;
		}
		for (int i = 0; i < count2; i++) {
			num2 = num2 * 10 + db;
		}
		
		System.out.println(num1 + num2);
	}
}
