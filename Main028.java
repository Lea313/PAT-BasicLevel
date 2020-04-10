/*
ĳ��������˿��ղ飬�õ���ȫ���������ա�������д�������ҳ��������곤����������ˡ�

����ȷ��ÿ����������ڶ��ǺϷ��ģ�����һ���Ǻ���ġ���������֪����û�г��� 200 ������ˣ��������� 2014 �� 9 �� 6 �գ����Գ��� 200 ������պ�δ���������ն��ǲ�����ģ�Ӧ�ñ����˵���

�����ʽ��

�����ڵ�һ�и��������� N��ȡֵ��(0,10?5??]����� N �У�ÿ�и��� 1 ���˵��������ɲ����� 5 ��Ӣ����ĸ��ɵ��ַ��������Լ��� yyyy/mm/dd������ / �� / �գ���ʽ���������ա���Ŀ��֤���곤�����������û�в��С�

�����ʽ��

��һ����˳�������Ч���յĸ��������곤�˺��������˵�����������Կո�ָ���

����������

5
John 2001/05/12
Tom 1814/09/06
Ann 2121/01/30
James 1814/09/05
Steve 1967/11/20

���������

3 Tom John

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main028 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] name = new String[n];
		String[] birthday = new String[n];
		int count = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		String resmax = "", resmin = "";
		int flag;
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			name[i] = str[0];
			birthday[i] = str[1];
			String[] s = birthday[i].split("/");
			int year = Integer.parseInt(s[0]);
			int month = Integer.parseInt(s[1]);
			int day = Integer.parseInt(s[2]);
			flag = 0;
			
			if(year>1814&&year<2014) {
				count++;
				flag = 1;
			}
			
			if(year==1814) {
				if(month>9) {
					count++;
					flag = 1;
				}
				if(month==9) {
					if(day>=6) {
						count++;
						flag = 1;
					}
				}
			}
			
			if(year==2014) {
				if(month<9) {
					count++;
					flag = 1;
				}
				if(month==9) {
					if(day<=6) {
						count++;
						flag = 1;
					}
				}
			}
			
			if(flag==1) {
				if(2014-year>max) {
					max = 2014-year;
					resmax = name[i];
				}
				if(2014-year<min) {
					min = 2014-year;
					resmin = name[i];
				}
			}
		}
		
		if(count>0) {
			System.out.println(count+" "+resmax+" "+resmin);
		}else {
			System.out.println(0);
		}		
	}
}
