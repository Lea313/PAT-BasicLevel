/*
大侦探福尔摩斯接到一张奇怪的字条：“我们约会吧！ 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm”。大侦探很快就明白了，字条上奇怪的乱码实际上就是约会的时间“星期四 14:04”，因为前面两字符串中第1对相同的大写英文字母（大小写有区分）是第4个字母'D'，代表星期四；第2对相同的字符是'E'，那是第5个英文字母，代表一天里的第14个钟头（于是一天的0点到23点由数字0到9、以及大写字母A到N表示）；后面两字符串第1对相同的英文字母's'出现在第4个位置（从0开始计数）上，代表第4分钟。现给定两对字符串，请帮助福尔摩斯解码得到约会的时间。

输入格式：

输入在4行中分别给出4个非空、不包含空格、且长度不超过60的字符串。

输出格式：

在一行中输出约会的时间，格式为“DAY HH:MM”，其中“DAY”是某星期的3字符缩写，即MON表示星期一，TUE表示星期二，WED表示星期三，THU表示星期四，FRI表示星期五，SAT表示星期六，SUN表示星期日。题目输入保证每个测试存在唯一解。

输入样例：

3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm

输出样例：

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
