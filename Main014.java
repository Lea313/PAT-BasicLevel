/*
����̽����Ħ˹�ӵ�һ����ֵ�������������Լ��ɣ� 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm��������̽�ܿ�������ˣ���������ֵ�����ʵ���Ͼ���Լ���ʱ�䡰������ 14:04������Ϊǰ�����ַ����е�1����ͬ�Ĵ�дӢ����ĸ����Сд�����֣��ǵ�4����ĸ'D'�����������ģ���2����ͬ���ַ���'E'�����ǵ�5��Ӣ����ĸ������һ����ĵ�14����ͷ������һ���0�㵽23��������0��9���Լ���д��ĸA��N��ʾ�����������ַ�����1����ͬ��Ӣ����ĸ's'�����ڵ�4��λ�ã���0��ʼ�������ϣ������4���ӡ��ָ��������ַ��������������Ħ˹����õ�Լ���ʱ�䡣

�����ʽ��

������4���зֱ����4���ǿա��������ո��ҳ��Ȳ�����60���ַ�����

�����ʽ��

��һ�������Լ���ʱ�䣬��ʽΪ��DAY HH:MM�������С�DAY����ĳ���ڵ�3�ַ���д����MON��ʾ����һ��TUE��ʾ���ڶ���WED��ʾ��������THU��ʾ�����ģ�FRI��ʾ�����壬SAT��ʾ��������SUN��ʾ�����ա���Ŀ���뱣֤ÿ�����Դ���Ψһ�⡣

����������

3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm

���������

THU 14:04

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main016 {

	static String[] week = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str1 = bf.readLine().split("");
		String[] str2 = bf.readLine().split("");
		String[] str3 = bf.readLine().split("");
		String[] str4 = bf.readLine().split("");

		int len1 = Math.min(str1.length, str2.length);
		int len2 = Math.min(str3.length, str4.length);
		String day = "";
		int hh = 0, mm = 0;
		int temp = 0;

		for (int i = 0; i < len1; i++) {
			if (str1[i].equals(str2[i]) && str1[i].charAt(0) >= 'A' && str1[i].charAt(0) <= 'G') {
				day = week[str1[i].charAt(0)-65];
				temp = i;
				break;
			}
		}

		for (int i = temp + 1; i < len1; i++) {
			if (str1[i].equals(str2[i])&&((str1[i].charAt(0)>='0'&&str1[i].charAt(0)<='9')||(str1[i].charAt(0)>='A'&&str1[i].charAt(0)<='N'))) {				
				if (str1[i].charAt(0)>='0'&&str1[i].charAt(0)<='9') {
					hh = Integer.parseInt(str1[i]);
				} else if (str1[i].charAt(0)>='A'&&str1[i].charAt(0)<='N') {
					hh = str1[i].charAt(0) - 55;
				}
				break;
			}
		}

		for (int i = 0; i < len2; i++) {
			if (str3[i].equals(str4[i])&&(str3[i].charAt(0)>='A'&&str3[i].charAt(0)<='Z'||str3[i].charAt(0)>='a'&&str3[i].charAt(0)<='z')) {				
				mm = i;								
				break;
			}
		}
		
		System.out.printf("%s %02d:%02d", day, hh, mm);
	}
}
