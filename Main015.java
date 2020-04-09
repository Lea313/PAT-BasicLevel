/*
�δ�ʷѧ��˾����ڡ�����ͨ��������һ�������ġ��²��ۡ������ǹʲŵ�ȫ��ν֮ʥ�ˣ��ŵ¼���ν֮���ˣ���ʤ��ν֮���ӣ���ʤ��ν֮С�ˡ���ȡ��֮����������ʥ�ˣ����Ӷ���֮�������С�ˣ����������ˡ���
�ָ���һ�������ĵ²ŷ����������˾�������۸���¼ȡ������
�����ʽ��
�����һ�и��� 3 �����������ֱ�Ϊ��N���� 105����������������L����60����Ϊ¼ȡ��ͷ����ߣ����·ֺͲŷ־������� L �Ŀ��������ʸ񱻿���¼ȡ��H��<100����Ϊ����¼ȡ�ߡ����·ֺͲŷ־������ڴ��ߵı�����Ϊ���ŵ�ȫ���������࿼�����²��ִܷӸߵ������򣻲ŷֲ������·ֵ��ߵ�һ�࿼�����ڡ���ʤ�š���Ҳ���ܷ����򣬵����ڵ�һ�࿼��֮�󣻵²ŷ־����� H�����ǵ·ֲ����ڲŷֵĿ������ڡ��ŵ¼����������С���ʤ�š��ߣ����ܷ����򣬵����ڵڶ��࿼��֮�������ﵽ����� L �Ŀ���Ҳ���ܷ����򣬵����ڵ����࿼��֮��
��� N �У�ÿ�и���һλ��������Ϣ��������׼��֤�� �·� �ŷ֣�����׼��֤��Ϊ 8 λ�������²ŷ�Ϊ���� [0, 100] �ڵ����������ּ��Կո�ָ���
�����ʽ��
�����һ�����ȸ����ﵽ��ͷ����ߵĿ������� M����� M �У�ÿ�а��������ʽ���һλ��������Ϣ��������������˵���Ĺ���Ӹߵ������򡣵�ĳ�࿼�����ж����ܷ���ͬʱ������·ֽ������У����·�Ҳ���У���׼��֤�ŵ����������
����������
14 60 80
10000001 64 90
10000002 90 60
10000011 85 80
10000003 85 80
10000004 80 85
10000005 82 77
10000006 83 76
10000007 90 78
10000008 75 79
10000009 59 90
10000010 88 45
10000012 80 100
10000013 90 99
10000014 66 60
���������
12
10000013 90 99
10000012 80 100
10000003 85 80
10000011 85 80
10000004 80 85
10000007 90 78
10000006 83 76
10000005 82 77
10000002 90 60
10000014 66 60
10000008 75 79
10000001 64 90

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main015 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] fir = bf.readLine().split(" ");
		int n = Integer.parseInt(fir[0]);
		int l = Integer.parseInt(fir[1]);
		int h = Integer.parseInt(fir[2]);
		List<Student> list = new ArrayList<Student>();
		int count = 0;
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			int id = Integer.parseInt(str[0]);
			int de = Integer.parseInt(str[1]);
			int cai = Integer.parseInt(str[2]);
			int sum = de+cai;
			Student stu = new Student(id, de, cai,sum);
			if(stu.de>=l&&stu.cai>=l) {
				list.add(stu);
				count++;
			}
			
		}		
		System.out.println(count);
		Collections.sort(list);
		
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i).de>=h&&list.get(i).cai>=h) {
				System.out.println(list.get(i).id+" "+list.get(i).de+" "+list.get(i).cai);
				list.remove(i);
			}
		}
		
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i).de>=h&&list.get(i).cai<h&&list.get(i).cai>=l) {
				System.out.println(list.get(i).id+" "+list.get(i).de+" "+list.get(i).cai);
				list.remove(i);
			}
		}
		
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i).de<h&&list.get(i).de>=l&&list.get(i).cai<h&&list.get(i).cai>=l&&list.get(i).de>list.get(i).cai) {
				System.out.println(list.get(i).id+" "+list.get(i).de+" "+list.get(i).cai);
				list.remove(i);
			}
		}
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i).id+" "+list.get(i).de+" "+list.get(i).cai);
		
		}		
	}
}

class Student implements Comparable<Student>{
	int id;
	int de;
	int cai;
	int sum;
	
	public Student(int id, int de, int cai, int sum) {
		this.id = id;
		this.de = de;
		this.cai = cai;
		this.sum = sum;
	}
	
	public int compareTo(Student o) {
		if(this.sum>o.sum) {
			return 1;
		}
		if(this.sum==o.sum) {
			if(this.de>o.de) {
				return 1;
			}
			if(this.de==o.de) {
				if(this.id<o.id) {
					return 1;
				}else {
					return -1;
				}
			}else {
				return -1;
			}
		}else {
			return -1;
		}
	}
		
}