/*
一个合法的身份证号码由17位地区、日期编号和顺序编号加1位校验码组成。校验码的计算规则如下：
首先对前17位数字加权求和，权重分配为：{7，9，10，5，8，4，2，1，6，3，7，9，10，5，8，4，2}；然后将计算的和对11取模得到值Z；最后按照以下关系对应Z值与校验码M的值：
Z：0 1 2 3 4 5 6 7 8 9 10
M：1 0 X 9 8 7 6 5 4 3 2
现在给定一些身份证号码，请你验证校验码的有效性，并输出有问题的号码。
输入格式：
输入第一行给出正整数N（<= 100）是输入的身份证号码的个数。随后N行，每行给出1个18位身份证号码。
输出格式：
按照输入的顺序每行输出1个有问题的身份证号码。这里并不检验前17位是否合理，只检查前17位是否全为数字且最后1位校验码计算准确。如果所有号码都正常，则输出“All passed”。
输入样例1： 
4
320124198808240056
12010X198901011234
110108196711301866
37070419881216001X
输出样例1： 
12010X198901011234
110108196711301866
37070419881216001X
输入样例2： 
2
320124198808240056
110108196711301862
输出样例2： 
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
