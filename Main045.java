/*
�����Ŀ��������㷨����һ������Ļ��ֹ��̣�����ͨ������ĳ�ַ���ȡһ��Ԫ����Ϊ��Ԫ��ͨ���������ѱ���ԪС��Ԫ�طŵ�������ߣ�����Ԫ���Ԫ�طŵ������ұߡ� �������ֺ��N��������ͬ�������������У������ж��ٸ�Ԫ�ؿ����ǻ���ǰѡȡ����Ԫ�� 
�������N = 5, ������1��3��2��4��5���� 
1�����û��Ԫ�أ��ұߵ�Ԫ�ض���������������������Ԫ�� 
����3�����Ԫ�ض�����С���������ұߵ�2��С����������������Ԫ�� 
����2���ұ�Ԫ�ض������󣬵�����ߵ�3��������������������Ԫ�� 
����ԭ��4��5����������Ԫ�� 
��ˣ���3��Ԫ�ؿ�������Ԫ�� 
�����ʽ�� 
�����ڵ�1���и���һ��������N��<= 105���� ��2���ǿո�ָ���N����ͬ����������ÿ����������109�� 
�����ʽ�� 
�ڵ�1��������п�������Ԫ��Ԫ�ظ������ڵ�2���а�����˳�������ЩԪ�أ������1���ո�ָ�����ĩ�����ж���ո� 
���������� 
5 
1 3 2 4 5 
��������� 
3 
1 4 5

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main045 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] str = bf.readLine().split(" ");
		int[] nums = new int[n];
		int[] flag = new int[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(nums[j]>nums[i]) {
					flag[i] = 1;
				}
			}
			for(int j=i+1;j<n;j++) {
				if(nums[j]<nums[i]) {
					flag[i] = 1;
				}
			}
			if(flag[i]==0) {
				count++;
			}
		}
		System.out.println(count);
		int[] res = new int[count];
		int index = 0;
		for(int i=0;i<count;i++) {
			for(int j=index;j<n;j++) {
				if(flag[j]==0) {
					res[i] = nums[j];
					index = j+1;
					break;
				}
			}
		}
		for(int i=0;i<count-1;i++) {
			System.out.print(res[i]+" ");
		}
		System.out.print(res[count-1]);
	}
}
