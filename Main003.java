/*
������ȷ�����Զ�����ϵͳ�����������˻�ϲ�Ļظ����������� PAT �ġ�����ȷ�������� ���� ֻҪ������ַ�����������������ϵͳ�����������ȷ��������������𰸴��󡱡�
�õ�������ȷ���������ǣ�
�ַ����б������ P�� A�� T�������ַ��������԰��������ַ���
�������� xPATx ���ַ��������Ի�á�����ȷ�������� x �����ǿ��ַ����������ǽ�����ĸ A ��ɵ��ַ�����
��� aPbTc ����ȷ�ģ���ô aPbATca Ҳ����ȷ�ģ����� a�� b�� c �������ǿ��ַ����������ǽ�����ĸ A ��ɵ��ַ�����
���ھ�����Ϊ PAT дһ���Զ����г����ж���Щ�ַ����ǿ��Ի�á�����ȷ���ġ�
�����ʽ��
ÿ������������� 1 �������������� 1 �и���һ�������� n (<10)������Ҫ�����ַ���������������ÿ���ַ���ռһ�У��ַ������Ȳ����� 100���Ҳ������ո�
�����ʽ��
ÿ���ַ����ļ����ռһ�У�������ַ������Ի�á�����ȷ��������� YES��������� NO��
����������
8
PAT
PAAT
AAPATAA
AAPAATAAAA
xPATx
PT
Whatever
APAAATAA
  
���������
YES
YES
YES
YES
NO
NO
NO
NO
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main003 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			if (judge(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean judge(String str) {
		
		String[] s = str.split("");
		int p = 0, a = 0, t = 0;
		int q = 0, z = 0, h = 0;//ǰ�к�
		int flag = 1;
		boolean bool = false;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("P")) {
				flag = 2;
				p++;
			} else if (s[i].equals("A")) {
				a++;
			} else if (s[i].equals("T")) {
				flag = 3;
				t++;
			} else {
				bool = true;
			}
			switch (flag) {
			case 1:
				q++;
				break;
			case 2:
				if (!s[i].equals("P")) {
					z++;
				}
				break;
			case 3:
				if (!s[i].equals("T")) {
					h++;
				}
				break;
			}
		}
		
		if (q * z == h && p == 1 && a != 0 && t == 1 && !bool) {
			return true;
		}
		return false;
	}

}
