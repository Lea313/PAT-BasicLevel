/*
1018 锤子剪刀布 (20)（20 分） 
大家应该都会玩“锤子剪刀布”的游戏：两人同时给出手势，胜负规则如图所示：

现给出两人的交锋记录，请统计双方的胜、平、负次数，并且给出双方分别出什么手势的胜算最大。

输入格式：

输入第1行给出正整数N（<=10^5^），即双方交锋的次数。随后N行，每行给出一次交锋的信息，即甲、乙双方同时给出的的手势。C代表“锤子”、J代表“剪刀”、B代表“布”，第1个字母代表甲方，第2个代表乙方，中间有1个空格。

输出格式：

输出第1、2行分别给出甲、乙的胜、平、负次数，数字间以1个空格分隔。第3行给出两个字母，分别代表甲、乙获胜次数最多的手势，中间有1个空格。如果解不唯一，则输出按字母序最小的解。

输入样例：

10 
C J 
J B 
C B 
B B 
B C 
C C 
C B 
J B 
B C 
J J 
输出样例：

5 3 2 
2 3 5 
B B

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main018 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] s = new String[n];
		
		for(int i=0;i<n;i++) {
			s[i] = bf.readLine();
		}
		int[] jia = count(s);
		//输出甲的胜平负
		for(int i=0;i<jia.length-1;i++) {
			System.out.print(jia[i]+" ");
		}
		System.out.println(jia[jia.length-1]);
		//输出乙的胜平负
		for(int i=jia.length-1;i>0;i--) {
			System.out.print(jia[i]+" ");
		}
		System.out.println(jia[0]);
		//赢的最多的
		which(s);
	}
	
	//判断 1-胜 0-平 -1-负
	public static int judge(String a, String b) {
		if((a.equals("J")&&b.equals("B"))||(a.equals("C")&&b.equals("J"))||(a.equals("B")&&b.equals("C"))) {
			return 1;
		}
		if((a.equals("J")&&b.equals("J"))||(a.equals("C")&&b.equals("C"))||(a.equals("B")&&b.equals("B"))) {
			return 0;
		}
		return -1;
	}
	
	//统计甲胜平负次数
	public static int[] count(String[] s) {
		int sheng = 0, ping = 0, fu = 0;
		for(int i=0;i<s.length;i++) {
			String[] str = s[i].split(" ");
			if(judge(str[0], str[1])==1) {
				sheng++;
			}
			if(judge(str[0], str[1])==0) {
				ping++;
			}
			if(judge(str[0], str[1])==-1) {
				fu++;
			}			
		}
		return new int[] {sheng,ping,fu};
	}
	
	//找获胜最多的手势
	public static void which(String[] s) {
		//0-剪刀获胜次数，1-锤子获胜次数，2-布获胜次数
		int[] jia = new int[3];
		int[] yi = new int[3];
		List<String> list = new ArrayList<String>();
		list.add("J");
		list.add("C");
		list.add("B");
		
		for(int i=0;i<s.length;i++) {
			String[] str = s[i].split(" ");
			if(judge(str[0], str[1])==1&&str[0].equals(list.get(0))) {
				jia[0]++;
			}
			if(judge(str[0], str[1])==1&&str[0].equals(list.get(1))) {
				jia[1]++;
			}
			if(judge(str[0], str[1])==1&&str[0].equals(list.get(2))) {
				jia[2]++;
			}
			if(judge(str[0], str[1])==-1&&str[1].equals(list.get(0))) {
				yi[0]++;
			}
			if(judge(str[0], str[1])==-1&&str[1].equals(list.get(1))) {
				yi[1]++;
			}
			if(judge(str[0], str[1])==-1&&str[1].equals(list.get(2))) {
				yi[2]++;
			}
		}
		
		int max1 = 0, max2 = 0;
		String maxjia = "", maxyi = "";
		for(int i=0;i<3;i++) {			
			if(jia[i]>=max1) {
				max1 = jia[i];			
				maxjia = list.get(i);						
			}			
			if(yi[i]>=max2) {
				max2 = yi[i];				
				maxyi = list.get(i);			
			}			
		}
		
		System.out.println(maxjia+" "+maxyi);
		
	}
}
