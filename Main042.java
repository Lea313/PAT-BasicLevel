/*
���д�����ҳ�һ�θ��������г�����Ƶ�����Ǹ�Ӣ����ĸ��
�����ʽ��
������һ���и���һ�����Ȳ����� 1000 ���ַ������ַ����� ASCII ���������ɼ��ַ����ո���ɣ����ٰ��� 1 ��Ӣ����ĸ���Իس��������س��������ڣ���
�����ʽ��
��һ�����������Ƶ����ߵ��Ǹ�Ӣ����ĸ������ִ���������Կո�ָ�������в��У����������ĸ����С���Ǹ���ĸ��ͳ��ʱ�����ִ�Сд�����Сд��ĸ��
����������
This is a simple TEST.  There ARE numbers and other symbols 1&2&3...........   
���������
e 7
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main042 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] c = bf.readLine().toLowerCase().toCharArray();
		int count = 0, maxcount = 0;
		char resc = 'a';
		
		for(int i=0;i<c.length;i++) {
			count = 0;
			if(c[i]>='a'&&c[i]<='z') {
				for(int j=i;j<c.length;j++) {
					if(c[i]==c[j]) {
						count++;
					}
				}
			}
			
			if(count>maxcount) {
				maxcount = count;
				resc = c[i];
			}
			if(count==maxcount&&c[i]<resc) {
				resc = c[i];
			}
		}
		
		System.out.println(resc+" "+maxcount);
	}
}
