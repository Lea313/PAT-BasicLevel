/*
Ϊ������ʵ˵���ھ�����������ļ�ǿ��PAT��֯��һ���ھ�����ܴ�������������ݱ������ͳ�Ƴ�������ǿ���Ǹ�ѧУ��

�����ʽ��

�����ڵ�1�и���������10^5^��������N�����������������N�У�ÿ�и���һλ�����ߵ���Ϣ�ͳɼ����������������ѧУ�ı�ţ���1��ʼ������ţ�����������ɼ����ٷ��ƣ����м��Կո�ָ���

�����ʽ��

��һ���и����ܵ÷���ߵ�ѧУ�ı�š������ܷ֣��м��Կո�ָ�����Ŀ��֤��Ψһ��û�в��С�

����������

6 
3 65 
2 80 
1 100 
2 70 
3 40 
3 0 
���������

2 150

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class Main032 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			int id = Integer.parseInt(str[0]);
			int score = Integer.parseInt(str[1]);
			sum = score;
			if(map.containsKey(id)) {
				sum += map.get(id);
			}			
			map.put(id, sum);	
		}
		int maxid = 0,maxscore = 0;
		for(int i=0;i<map.size();i++) {
			if(map.get(i+1)>maxscore) {
				maxscore = map.get(i+1);
				maxid = i+1;
			}
		}
		System.out.println(maxid+" "+maxscore);
	}
}
