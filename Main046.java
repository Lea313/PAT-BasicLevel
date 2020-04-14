/*
划拳是古老中国酒文化的一个有趣的组成部分。酒桌上两人划拳的方法为：每人口中喊出一个数字，同时用手比划出一个数字。如果谁比划出的数字正好等于两人喊出的数字之和，谁就赢了，输家罚一杯酒。两人同赢或两人同输则继续下一轮，直到唯一的赢家出现。
下面给出甲、乙两人的划拳记录，请你统计他们最后分别喝了多少杯酒。
输入描述
输入第一行先给出一个正整数 N（≤100），随后 N 行，每行给出一轮划拳的记录，格式为：
甲喊 甲划 乙喊 乙划
其中喊是喊出的数字，划是划出的数字，均为不超过 100 的正整数（两只手一起划）。
输出描述
在一行中先后输出甲、乙两人喝酒的杯数，其间以一个空格分隔。
输入例子
5
8 10 9 12
5 10 5 10
3 8 5 12
12 18 1 13
4 16 12 15
输出例子
1 2

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main046 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		List<Huaquan> list = new ArrayList<Huaquan>();
		int jiafa = 0, yifa = 0;
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			list.add(new Huaquan(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3])));
			if(list.get(i).jiahua==(list.get(i).jiahan)+list.get(i).yihan&&list.get(i).yihua!=(list.get(i).jiahan)+list.get(i).yihan) {
				yifa++;
			}
			if(list.get(i).yihua==(list.get(i).jiahan)+list.get(i).yihan&&list.get(i).jiahua!=(list.get(i).jiahan)+list.get(i).yihan) {
				jiafa++;
			}
		}
		
		System.out.println(jiafa+" "+yifa);
	}
	
}

class Huaquan{
	int jiahan;
	int jiahua;
	int yihan;
	int yihua;
	
	public Huaquan(int jiahan, int jiahua, int yihan, int yihua) {
		this.jiahan = jiahan;
		this.jiahua = jiahua;
		this.yihan = yihan;
		this.yihua = yihua;
	}
	
}