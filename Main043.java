/*
����һ�����Ȳ����� 10^4�ġ�����Ӣ����ĸ���ɵ��ַ������뽫�ַ����µ���˳�򣬰� PATestPATest.... ������˳������������������ַ�����Ȼ�������ַ��ĸ�����һ����һ����ģ���ĳ���ַ��Ѿ�����꣬�����µ��ַ��԰� PATest ��˳���ӡ��ֱ�������ַ����������
�����ʽ��
������һ���и���һ�����Ȳ����� 10
?4
??�ġ�����Ӣ����ĸ���ɵķǿ��ַ�����
�����ʽ��
��һ���а���ĿҪ������������ַ�������Ŀ��֤����ǿա�
����������
redlesPayBestPATTopTeePHPereatitAPPT   
���������
PATestPATestPTetPTePePee
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main043 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split("");
		int countP = 0, countA = 0, countT = 0,counte = 0, counts = 0,countt = 0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("P")) {
				countP++;
			}
			if(str[i].equals("A")) {
				countA++;
			}
			if(str[i].equals("T")) {
				countT++;
			}
			if(str[i].equals("e")) {
				counte++;
			}
			if(str[i].equals("s")) {
				counts++;
			}
			if(str[i].equals("t")) {
				countt++;
			}
		}
		while(countP>0||countA>0||countT>0||counte>0||counts>0||countt>0) {
			if(countP>0) {
				System.out.print("P");
				countP--;
			}
			if(countA>0) {
				System.out.print("A");
				countA--;
			}
			if(countT>0) {
				System.out.print("T");
				countT--;
			}
			if(counte>0) {
				System.out.print("e");
				counte--;
			}
			if(counts>0) {
				System.out.print("s");
				counts--;
			}
			if(countt>0) {
				System.out.print("t");
				countt--;
			}
		}
	}
}
