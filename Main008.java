/*
һ������A�д���N��>0�����������ڲ�����ʹ�����������ǰ���£���ÿ������ѭ��������M����0����λ�ã�����A�е������ɣ�A0A1?AN?1���任Ϊ��AN?M?AN?1A0A1?AN?M?1�������M����ѭ��������ǰ���M��λ�ã��������Ҫ���ǳ����ƶ����ݵĴ��������٣�Ҫ�������ƶ��ķ�����
�����ʽ:
ÿ���������һ��������������1������N��1��N��100����M����0������2������N��������֮���ÿո�ָ���
�����ʽ:
��һ�������ѭ������Mλ�Ժ���������У�֮���ÿո�ָ������н�β�����ж���ո�
��������:
6 2
1 2 3 4 5 6   
�������:
5 6 1 2 3 4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main008 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] fir = bf.readLine().split(" ");
		int n = Integer.parseInt(fir[0]);
		int m = Integer.parseInt(fir[1]);
		int[] arr = new int[n];
		String[] str = bf.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		m = m % n;
		
		for (int i = n - m; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < n - m - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print(arr[n - m - 1]);
	}
}
