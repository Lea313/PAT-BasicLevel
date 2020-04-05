/*
���� n��>0����ѧ����������ѧ�š��ɼ����ֱ�����ɼ���ߺͳɼ����ѧ����������ѧ�š�
�����ʽ��
ÿ������������� 1 ��������������ʽΪ
�� 1 �У������� n
�� 2 �У��� 1 ��ѧ�������� ѧ�� �ɼ�
�� 3 �У��� 2 ��ѧ�������� ѧ�� �ɼ�
  ... ... ...
�� n+1 �У��� n ��ѧ�������� ѧ�� �ɼ�   
����������ѧ�ž�Ϊ������ 10 ���ַ����ַ������ɼ�Ϊ 0 �� 100 ֮���һ�����������ﱣ֤��һ�����������û������ѧ���ĳɼ�����ͬ�ġ�
�����ʽ��
��ÿ������������� 2 �У��� 1 ���ǳɼ����ѧ����������ѧ�ţ��� 2 ���ǳɼ����ѧ����������ѧ�ţ��ַ������� 1 �ո�
����������
3
Joe Math990112 89
Mike CS991301 100
Mary EE990830 95
   
���������
Mike CS991301
Joe Math990112
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main004 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		List<Student> list = new ArrayList<Student>();
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			String name = str[0];
			String id = str[1];
			int score = Integer.parseInt(str[2]);
			list.add(new Student(name, id, score));
		}
		
		Collections.sort(list);
		System.out.println(list.get(0).name+" "+list.get(0).id);
		System.out.println(list.get(list.size()-1).name+" "+list.get(list.size()-1).id);
	}
}

class Student implements Comparable<Student>{	
	String name;
	String id;
	int score;
	
	public Student(String name, String id, int score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int compareTo(Student o) {
		return score>o.score?-1:1;
	}
	
}
