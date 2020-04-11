/*
һ���Ϸ������֤������17λ���������ڱ�ź�˳���ż�1λУ������ɡ�У����ļ���������£�
���ȶ�ǰ17λ���ּ�Ȩ��ͣ�Ȩ�ط���Ϊ��{7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2}��Ȼ�󽫼���ĺͶ�11ȡģ�õ�ֵZ����������¹�ϵ��ӦZֵ��У����M��ֵ��
Z��0 1 2 3 4 5 6 7 8 9 10
M��1 0 X 9 8 7 6 5 4 3 2
���ڸ���һЩ���֤���룬������֤У�������Ч�ԣ������������ĺ��롣
�����ʽ��
�����һ�и���������N��<= 100������������֤����ĸ��������N�У�ÿ�и���1��18λ���֤���롣
�����ʽ��
���������˳��ÿ�����1������������֤���롣���ﲢ������ǰ17λ�Ƿ����ֻ���ǰ17λ�Ƿ�ȫΪ���������1λУ�������׼ȷ��������к��붼�������������All passed����
��������1�� 
4
320124198808240056
12010X198901011234
110108196711301866
37070419881216001X
�������1�� 
12010X198901011234
110108196711301866
37070419881216001X
��������2�� 
2
320124198808240056
110108196711301862
�������2�� 
All passed
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main031 {
	
	static int[] weight = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
	static String[] m = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
	static int count = 0;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++) {
			judge(bf.readLine());
		}
		if(count==n) {
			System.out.println("All passed");
		}
	}
	
	public static void judge(String s) {
		String[] str = s.split("");
		int[] nums = new int[17];
		int sum = 0;
		int flag = 0;
		
		for(int i=0;i<17;i++) {
			if(str[i].charAt(0)>='0'&&str[i].charAt(0)<='9') {
				nums[i] = Integer.parseInt(str[i]);
				sum += nums[i]*weight[i];
			}else {
				flag = 1;
			}		
		}
		
		if(!str[17].equals(m[sum%11])||flag==1) {
			System.out.println(s);
		}else {
			count++;
		}
	}
}
