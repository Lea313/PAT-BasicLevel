/*
小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散了卖。于是小红要你帮忙判断一下，某串珠子里是否包含了全部自己想要的珠子？如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色.
输入格式：
每个输入包含1个测试用例。每个测试用例分别在2行中先后给出摊主的珠串和小红想做的珠串，两串都不超过1000个珠子。
输出格式：
如果可以买，则在一行中输出“Yes”以及有多少多余的珠子；如果不可以买，则在一行中输出“No”以及缺了多少珠子。其间以1个空格分隔。
输入样例1：
ppRYYGrrYBR2258
YrR8RrY
输出样例1：
Yes 8
输入样例2：
ppRYYGrrYB225
YrR8RrY
输出样例2：
No 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main039 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		String[] str1 = s1.split("");
		String[] str2 = s2.split("");
		
		List list = new ArrayList();
		for(int i=0;i<str1.length;i++) {
			list.add(str1[i]);
		}
		int count = 0;
		for(int i=0;i<str2.length;i++) {
			for(int j=0;j<list.size();j++) {
				if(str2[i].equals(list.get(j))) {
					count++;
					list.remove(j);
					break;
				}
			}
		}
		if(count==str2.length) {
			System.out.println("Yes "+(str1.length-str2.length));
		}else {
			System.out.println("No "+(str2.length-count));
		}
	}
}
