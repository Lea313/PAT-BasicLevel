/*
ÿ�� PAT �����ڲμӿ���ʱ���ᱻ����������λ�ţ�һ�����Ի���λ��һ���ǿ�����λ����������£��������볡ʱ�ȵõ��Ի���λ���룬���������Ի�״̬��ϵͳ����ʾ�ÿ����Ŀ�����λ���룬����ʱ������Ҫ����������λ����������Щ�����ٵ��ˣ��Ի��Ѿ�����������ֻ�������쵽���Ի���λ�����������㣬�Ӻ�̨������ǵĿ�����λ���롣
�����ʽ��
�����һ�и���һ�������� N����1000������� N �У�ÿ�и���һ����������Ϣ��׼��֤�� �Ի���λ�� ������λ�š�����׼��֤���� 16 λ������ɣ���λ�� 1 �� N ��š����뱣֤ÿ���˵�׼��֤�Ŷ���ͬ�������κ�ʱ�򶼲���������˷��䵽ͬһ����λ�ϡ�
������Ϣ֮�󣬸���һ�������� M����N�������һ���и��� M ������ѯ���Ի���λ���룬�Կո�ָ���
�����ʽ��
��Ӧÿ����Ҫ��ѯ���Ի���λ���룬��һ���������Ӧ������׼��֤�źͿ�����λ���룬�м��� 1 ���ո�ָ���
����������
4
3310120150912233 2 4
3310120150912119 4 1
3310120150912126 1 3
3310120150912002 3 2
2
3 4
���������
3310120150912002 2
3310120150912119 1

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main041 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		List<Student> list = new ArrayList<Student>();
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			String id = str[0];
			int pre = Integer.parseInt(str[1]);
			int test = Integer.parseInt(str[2]);
			list.add(new Student(id, pre, test));
		}
		
		int m = Integer.parseInt(bf.readLine());
		int[] need = new int[m];
		String[] s = bf.readLine().split(" ");
		
		for(int i=0;i<m;i++) {
			need[i] = Integer.parseInt(s[i]);
			for(int j=0;j<list.size();j++) {
				if(need[i]==list.get(j).pre) {
					System.out.println(list.get(j).id+" "+list.get(j).test);
					break;
				}
			}
		}
	}
}

class Student{
	String id;
	int pre;
	int test;
	
	public Student(String id, int pre, int test) {
		this.id = id;
		this.pre = pre;
		this.test = test;
	}	
}