/*
����һϵ�����������밴Ҫ������ֽ��з��࣬���������5�����֣�

A1 = �ܱ�5����������������ż���ĺͣ�

A2 = ����5������1�����ְ�����˳����н�����ͣ�������n1-n2+n3-n4����

A3 = ��5������2�����ֵĸ�����

A4 = ��5������3�����ֵ�ƽ��������ȷ��С�����1λ��

A5 = ��5������4��������������֡�

�����ʽ��

ÿ���������1������������ÿ�����������ȸ���һ��������1000��������N��������N��������1000�Ĵ�����������������ּ��Կո�ָ���

�����ʽ��

�Ը�����N��������������ĿҪ�����A1~A5����һ����˳����������ּ��Կո�ָ�������ĩ�����ж���ո�

������ĳһ�����ֲ����ڣ�������Ӧλ�������N����

��������1��
13 1 2 3 4 5 6 7 8 9 10 20 16 18 
�������1��
30 11 2 9.7 9 
��������2��
8 1 2 4 5 6 7 9 16 
�������2��
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
