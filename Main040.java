/*
�ַ���APPAPT�а������������ʡ�PAT�������е�һ��PAT�ǵ�2λ(P),��4λ(A),��6λ(T)�� 
�ڶ���PAT�ǵ�3λ(P),��4λ(A),��6λ(T)�� 
�ָ����ַ�������һ�������γɶ��ٸ�PAT�� 
�����ʽ�� 
����ֻ��һ�У�����һ���ַ��������Ȳ�����105��ֻ����P��A��T������ĸ�� 
�����ʽ�� 
��һ������������ַ����а������ٸ�PAT�����ڽ�����ܱȽϴ�ֻ����� 
1000000007ȡ�����Ľ���� 
���������� 
APPAPT 
��������� 
2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main040 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] str = bf.readLine().toCharArray();
		int countp = 0,countt = 0, res = 0;
		for(int i=0;i<str.length;i++) {
			if(str[i]=='T') {
				countt++;
			}
		}
		for(int i=0;i<str.length;i++) {
			if(str[i]=='P') {
				countp++;
			}
			if(str[i]=='T') {
				countt--;
			}
			if(str[i]=='A') {
				res = (res + (countp*countt)%1000000007)%1000000007;
			}
		}
		System.out.println(res);
	}
}
