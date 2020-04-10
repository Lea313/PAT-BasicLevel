/*
某城镇进行人口普查，得到了全体居民的生日。现请你写个程序，找出镇上最年长和最年轻的人。

这里确保每个输入的日期都是合法的，但不一定是合理的——假设已知镇上没有超过 200 岁的老人，而今天是 2014 年 9 月 6 日，所以超过 200 岁的生日和未出生的生日都是不合理的，应该被过滤掉。

输入格式：

输入在第一行给出正整数 N，取值在(0,10?5??]；随后 N 行，每行给出 1 个人的姓名（由不超过 5 个英文字母组成的字符串）、以及按 yyyy/mm/dd（即年 / 月 / 日）格式给出的生日。题目保证最年长和最年轻的人没有并列。

输出格式：

在一行中顺序输出有效生日的个数、最年长人和最年轻人的姓名，其间以空格分隔。

输入样例：

5
John 2001/05/12
Tom 1814/09/06
Ann 2121/01/30
James 1814/09/05
Steve 1967/11/20

输出样例：

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
