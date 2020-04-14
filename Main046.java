/*
��ȭ�ǹ����й����Ļ���һ����Ȥ����ɲ��֡����������˻�ȭ�ķ���Ϊ��ÿ�˿��к���һ�����֣�ͬʱ���ֱȻ���һ�����֡����˭�Ȼ������������õ������˺���������֮�ͣ�˭��Ӯ�ˣ���ҷ�һ���ơ�����ͬӮ������ͬ���������һ�֣�ֱ��Ψһ��Ӯ�ҳ��֡�
��������ס������˵Ļ�ȭ��¼������ͳ���������ֱ���˶��ٱ��ơ�
��������
�����һ���ȸ���һ�������� N����100������� N �У�ÿ�и���һ�ֻ�ȭ�ļ�¼����ʽΪ��
�׺� �׻� �Һ� �һ�
���к��Ǻ��������֣����ǻ��������֣���Ϊ������ 100 ������������ֻ��һ�𻮣���
�������
��һ�����Ⱥ�����ס������˺ȾƵı����������һ���ո�ָ���
��������
5
8 10 9 12
5 10 5 10
3 8 5 12
12 18 1 13
4 16 12 15
�������
1 2

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main046 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		List<Huaquan> list = new ArrayList<Huaquan>();
		int jiafa = 0, yifa = 0;
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			list.add(new Huaquan(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3])));
			if(list.get(i).jiahua==(list.get(i).jiahan)+list.get(i).yihan&&list.get(i).yihua!=(list.get(i).jiahan)+list.get(i).yihan) {
				yifa++;
			}
			if(list.get(i).yihua==(list.get(i).jiahan)+list.get(i).yihan&&list.get(i).jiahua!=(list.get(i).jiahan)+list.get(i).yihan) {
				jiafa++;
			}
		}
		
		System.out.println(jiafa+" "+yifa);
	}
	
}

class Huaquan{
	int jiahan;
	int jiahua;
	int yihan;
	int yihua;
	
	public Huaquan(int jiahan, int jiahua, int yihan, int yihua) {
		this.jiahan = jiahan;
		this.jiahua = jiahua;
		this.yihan = yihan;
		this.yihua = yihua;
	}
	
}