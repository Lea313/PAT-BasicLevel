/*
Ҫ���һ��C���Գ��������ʱ�䣬���õķ����ǵ���ͷ�ļ�time.h�������ṩ��clock()���������Բ�׽�ӳ���ʼ���е�clock()������ʱ���ķѵ�ʱ�䡣���ʱ�䵥λ��clock tick������ʱ�Ӵ�㡱��ͬʱ����һ������CLK_TCK�������˻���ʱ��ÿ�����ߵ�ʱ�Ӵ����������Ϊ�˻��һ������f������ʱ�䣬����ֻҪ�ڵ���f֮ǰ�ȵ���clock()�����һ��ʱ�Ӵ����C1����fִ����ɺ��ٵ���clock()�������һ��ʱ�Ӵ����C2�����λ�õ�ʱ�Ӵ����֮��(C2-C1)����f���������ĵ�ʱ�Ӵ�������ٳ��Գ���CLK_TCK���͵õ�������Ϊ��λ������ʱ�䡣

���ﲻ���򵥼��賣��CLK_TCKΪ100���ָ������⺯��ǰ�����λ�õ�ʱ�Ӵ����������������⺯�����е�ʱ�䡣

�����ʽ��

������һ����˳�����2������C1��C1��ע�����λ�õ�ʱ�Ӵ�����϶�����ͬ����C1 < C2������ȡֵ��[0, 107]��

�����ʽ��

��һ����������⺯�����е�ʱ�䡣����ʱ����밴�ա�hh:mm:ss������2λ�ġ�ʱ:��:�롱����ʽ���������1���ʱ���������뵽�롣

����������

123 4577973

���������

12:42:59

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main026 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		double c = (b - a) / 100.0;
		int hh = (int) c / 3600;
		int mm = (int) (c - hh * 3600) / 60;
		int ss = (int) Math.round(c - hh * 3600 - mm * 60);
		System.out.printf("%02d:%02d:%02d", hh, mm, ss);
	}
}
