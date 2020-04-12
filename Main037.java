/*
如果你是哈利·波特迷，你会知道魔法世界有它自己的货币系统 —— 就如海格告诉哈利的：“十七个银西可(Sickle)兑一个加隆(Galleon)，二十九个纳特(Knut)兑一个西可，很容易。”现在，给定哈利应付的价钱P和他实付的钱A，你的任务是写一个程序来计算他应该被找的零钱。
输入格式：
输入在1行中分别给出P和A，格式为“Galleon.Sickle.Knut”，其间用1个空格分隔。这里Galleon是[0, 10^7]区间内的整数，Sickle是[0, 17)区间内的整数，Knut是[0, 29)区间内的整数。
输出格式：
在一行中用与输入同样的格式输出哈利应该被找的零钱。如果他没带够钱，那么输出的应该是负数。
输入样例1：
10.16.27 14.1.28
输出样例1：
3.2.1
输入样例2：
14.1.28 10.16.27
输出样例2：
-3.2.1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main037 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bf.readLine().split(" ");
		cal(input[0], input[1]);
	}
	
	public static void cal(String s1, String s2) {
		
		String[] str1 = s1.split("\\.");
		String[] str2 = s2.split("\\.");
		int galleon1 = Integer.parseInt(str1[0]);
		int sickle1 = Integer.parseInt(str1[1]);
		int knut1 = Integer.parseInt(str1[2]);
		int galleon2 = Integer.parseInt(str2[0]);
		int sickle2 = Integer.parseInt(str2[1]);
		int knut2 = Integer.parseInt(str2[2]);
		
		int resg = 0, ress = 0, resk = 0;
		
		if(galleon2>galleon1) {
			if(knut2<knut1) {
				resk = (knut2+29)-knut1;
				sickle2--;
			}else {
				resk = knut2-knut1;
			}
			if(sickle2<sickle1) {
				ress = (sickle2+17)-sickle1;
				galleon2--;
			}else {
				ress = sickle2-sickle1;
			}
			resg = galleon2-galleon1;
			System.out.println(resg+"."+ress+"."+resk);
			
		}else if(galleon2<galleon1){
			if(knut1<knut2) {
				resk = (knut1+29)-knut2;
				sickle1--;
			}else {
				resk = knut1-knut2;
			}
			if(sickle1<sickle2) {
				ress = (sickle1+17)-sickle2;
				galleon1--;
			}else {
				ress = sickle1-sickle2;
			}
			resg = galleon1-galleon2;
			System.out.println("-"+resg+"."+ress+"."+resk);
			
		}else {
			resg = 0;
			if(sickle2>sickle1) {
				if(knut2<knut1) {
					resk = knut2+29-knut1;
					sickle2--;
				}else {
					resk = knut2-knut1;
				}
				ress = sickle2-sickle1;
				System.out.println(resg+"."+ress+"."+resk);
			}else if(sickle2<sickle1) {
				if(knut1<knut2) {
					resk = knut1+29-knut2;
					sickle1--;
				}else {
					resk = knut1-knut2;
				}
				ress = sickle1-sickle2;
				System.out.println("-"+resg+"."+ress+"."+resk);
				
			}else {
				ress = 0;
				if(knut2>knut1) {
					resk = knut2-knut1;
					System.out.println(resg+"."+ress+"."+resk);
				}else if(knut2<knut1) {
					resk = knut1-knut2;
					System.out.println("-"+resg+"."+ress+"."+resk);
				}else {
					System.out.println("0.0.0");
				}
			}
		}
	}
}
