/*
�������� 0-9 �����ɸ��������������˳��������Щ���֣�������ȫ��ʹ�á�Ŀ����ʹ�����õ�����������С��ע�� 0 ��������λ�������磺�������� 0������ 1������ 5��һ�� 8�����ǵõ�����С�������� 10015558��
�ָ������֣����д��������ܹ���ɵ���С������
�����ʽ��
������һ���и��� 10 ���Ǹ�������˳���ʾ����ӵ������ 0������ 1���������� 9 �ĸ�������������һ���ո�ָ���10 �����ֵ��ܸ��������� 50��������ӵ�� 1 ���� 0 �����֡�
�����ʽ��
��һ��������ܹ���ɵ���С������
����������
2 2 0 0 0 3 0 0 1 0   
���������
10015558
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main023 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int[] nums = new int[str.length];
		
		for(int i=0;i<str.length;i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		for(int i=0;i<str.length;i++) {
			if(i!=0&&nums[i]!=0) {
				System.out.print(i);
				nums[i]--;
				break;
			}
		}
		for(int i=0;i<str.length;i++) {
			if(nums[i]!=0) {
				for(int j=0;j<nums[i];j++) {
					System.out.print(i);
				}
				nums[i]--;
			}
		}
	}
}
