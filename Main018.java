/*
1018 ���Ӽ����� (20)��20 �֣� 
���Ӧ�ö����桰���Ӽ�����������Ϸ������ͬʱ�������ƣ�ʤ��������ͼ��ʾ��

�ָ������˵Ľ����¼����ͳ��˫����ʤ��ƽ�������������Ҹ���˫���ֱ��ʲô���Ƶ�ʤ�����

�����ʽ��

�����1�и���������N��<=10^5^������˫������Ĵ��������N�У�ÿ�и���һ�ν������Ϣ�����ס���˫��ͬʱ�����ĵ����ơ�C�������ӡ���J������������B������������1����ĸ����׷�����2�������ҷ����м���1���ո�

�����ʽ��

�����1��2�зֱ�����ס��ҵ�ʤ��ƽ�������������ּ���1���ո�ָ�����3�и���������ĸ���ֱ����ס��һ�ʤ�����������ƣ��м���1���ո�����ⲻΨһ�����������ĸ����С�Ľ⡣

����������

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
���������

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
		//����׵�ʤƽ��
		for(int i=0;i<jia.length-1;i++) {
			System.out.print(jia[i]+" ");
		}
		System.out.println(jia[jia.length-1]);
		//����ҵ�ʤƽ��
		for(int i=jia.length-1;i>0;i--) {
			System.out.print(jia[i]+" ");
		}
		System.out.println(jia[0]);
		//Ӯ������
		which(s);
	}
	
	//�ж� 1-ʤ 0-ƽ -1-��
	public static int judge(String a, String b) {
		if((a.equals("J")&&b.equals("B"))||(a.equals("C")&&b.equals("J"))||(a.equals("B")&&b.equals("C"))) {
			return 1;
		}
		if((a.equals("J")&&b.equals("J"))||(a.equals("C")&&b.equals("C"))||(a.equals("B")&&b.equals("B"))) {
			return 0;
		}
		return -1;
	}
	
	//ͳ�Ƽ�ʤƽ������
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
	
	//�һ�ʤ��������
	public static void which(String[] s) {
		//0-������ʤ������1-���ӻ�ʤ������2-����ʤ����
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
