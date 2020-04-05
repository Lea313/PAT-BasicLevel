/*
������(Callatz)�����Ѿ���1001�и������������������Ŀ������΢��Щ���ӡ�
��������֤�����Ȳ����ʱ��Ϊ�˱����ظ����㣬���Լ�¼�µ��ƹ�����������ÿһ����������� n=3 ������֤��ʱ��������Ҫ���� 3��5��8��4��2��1�������Ƕ� n=5��8��4��2 ������֤��ʱ�򣬾Ϳ���ֱ���ж������Ȳ������α��������Ҫ�ظ����㣬��Ϊ�� 4 �����Ѿ�����֤3��ʱ���������ˣ����ǳ� 5��8��4��2 �Ǳ� 3�����ǡ����������ǳ�һ�������е�ĳ���� n Ϊ���ؼ���������� n ���ܱ������е��������������ǡ�
���ڸ���һϵ�д���֤�����֣�����ֻ��Ҫ��֤���еļ����ؼ������Ϳ��Բ������ظ���֤���µ����֡������������ҳ���Щ�ؼ����֣������Ӵ�С��˳��������ǡ�
�����ʽ��
ÿ������������� 1 �������������� 1 �и���һ�������� K (<100)���� 2 �и��� K ��������ͬ�Ĵ���֤�������� n (1<n��100)��ֵ�����ּ��ÿո������
�����ʽ��
ÿ���������������ռһ�У����Ӵ�С��˳������ؼ����֡����ּ��� 1 ���ո��������һ�������һ�����ֺ�û�пո�
����������
6
3 5 6 7 8 11   
���������
7 6
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main005t {
	static int[] flag = new int[105];

	public static void main(String[] args) throws IOException {

		Arrays.fill(flag, -1);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(bf.readLine());
		int[] nums = new int[number];
		String[] str = bf.readLine().split(" ");

		for (int i = 0; i < number; i++) {
			nums[i] = Integer.parseInt(str[i]);
			flag[nums[i]] = 0;
		}
		int n;

		for (int i = 0; i < 105; i++) {
			if (flag[i] != 0) {
				continue;
			}
			n = i;
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
					if (n < 100) {
						flag[n] = 1;
					}
				} else {
					n = (n * 3 + 1) / 2;
					if (n < 100) {
						flag[n] = 1;
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 104; i >= 0; i--) {
			if (flag[i] == 0) {
				sb.append(i).append(" ");
			}
		}

		System.out.println(sb.toString().trim());
	}
}
