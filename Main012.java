/*
给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：

A1 = 能被5整除的数字中所有偶数的和；

A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4…；

A3 = 被5除后余2的数字的个数；

A4 = 被5除后余3的数字的平均数，精确到小数点后1位；

A5 = 被5除后余4的数字中最大数字。

输入格式：

每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。

输出格式：

对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。

若其中某一类数字不存在，则在相应位置输出“N”。

输入样例1：
13 1 2 3 4 5 6 7 8 9 10 20 16 18 
输出样例1：
30 11 2 9.7 9 
输入样例2：
8 1 2 4 5 6 7 9 16 
输出样例2：
N 11 2 N 9

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main012 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int[] nums = new int[n];
		
		for(int i=0;i<n;i++) {
			nums[i] = Integer.parseInt(str[i+1]);
		}
		
		a1(nums);
		System.out.print(" ");
		a2(nums);
		System.out.print(" ");
		a3(nums);
		System.out.print(" ");
		a4(nums);
		System.out.print(" ");
		a5(nums);
	}
	
	public static void a1(int[] nums) {
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%5==0&&nums[i]%2==0) {
				sum += nums[i];
				count++;
			}
		}
		
		if(count==0) {
			System.out.print("N");
		}else {
			System.out.print(sum);
		}
	}
	
	public static void a2(int[] nums) {
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%5==1) {
				if(count%2==0) {
					sum += nums[i];
					count++;
				}else {
					sum -= nums[i];
					count++;
				}
			}
		}
		
		if(count==0) {
			System.out.print("N");
		}else {
			System.out.print(sum);
		}
	}
	
	public static void a3(int[] nums) {
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%5==2) {
				count++;
			}
		}
		if(count==0) {
			System.out.print("N");
		}else {
			System.out.print(count);
		}
		
	}
	
	public static void a4(int[] nums) {
		int count = 0;
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%5==3) {
				sum += nums[i];
				count++;
			}
		}
		
		double avg = (double)sum/(double)count;
		if(count==0) {
			System.out.print("N");
		}else {
			System.out.printf("%.1f",avg);
		}		
	}
	
	public static void a5(int[] nums) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%5==4) {
				if(nums[i]>max) {
					max = nums[i];
				}
				count++;
			}
		}
		
		if(count==0) {
			System.out.print("N");
		}else {
			System.out.print(max);
		}
		
	}
}
