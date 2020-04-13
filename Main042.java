/*
请编写程序，找出一段给定文字中出现最频繁的那个英文字母。
输入格式：
输入在一行中给出一个长度不超过 1000 的字符串。字符串由 ASCII 码表中任意可见字符及空格组成，至少包含 1 个英文字母，以回车结束（回车不算在内）。
输出格式：
在一行中输出出现频率最高的那个英文字母及其出现次数，其间以空格分隔。如果有并列，则输出按字母序最小的那个字母。统计时不区分大小写，输出小写字母。
输入样例：
This is a simple TEST.  There ARE numbers and other symbols 1&2&3...........   
输出样例：
e 7
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main042 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] c = bf.readLine().toLowerCase().toCharArray();
		int count = 0, maxcount = 0;
		char resc = 'a';
		
		for(int i=0;i<c.length;i++) {
			count = 0;
			if(c[i]>='a'&&c[i]<='z') {
				for(int j=i;j<c.length;j++) {
					if(c[i]==c[j]) {
						count++;
					}
				}
			}
			
			if(count>maxcount) {
				maxcount = count;
				resc = c[i];
			}
			if(count==maxcount&&c[i]<resc) {
				resc = c[i];
			}
		}
		
		System.out.println(resc+" "+maxcount);
	}
}
