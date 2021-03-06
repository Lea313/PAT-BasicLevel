/*
为了用事实说明挖掘机技术到底哪家强，PAT组织了一场挖掘机技能大赛。现请你根据比赛结果统计出技术最强的那个学校。

输入格式：

输入在第1行给出不超过10^5^的正整数N，即参赛人数。随后N行，每行给出一位参赛者的信息和成绩，包括其所代表的学校的编号（从1开始连续编号）、及其比赛成绩（百分制），中间以空格分隔。

输出格式：

在一行中给出总得分最高的学校的编号、及其总分，中间以空格分隔。题目保证答案唯一，没有并列。

输入样例：

6 
3 65 
2 80 
1 100 
2 70 
3 40 
3 0 
输出样例：

2 150

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class Main032 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			int id = Integer.parseInt(str[0]);
			int score = Integer.parseInt(str[1]);
			sum = score;
			if(map.containsKey(id)) {
				sum += map.get(id);
			}			
			map.put(id, sum);	
		}
		int maxid = 0,maxscore = 0;
		for(int i=0;i<map.size();i++) {
			if(map.get(i+1)>maxscore) {
				maxscore = map.get(i+1);
				maxid = i+1;
			}
		}
		System.out.println(maxid+" "+maxscore);
	}
}
