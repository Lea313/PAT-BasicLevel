/*
������ǹ����������ԣ����֪��ħ�����������Լ��Ļ���ϵͳ ���� ���纣����߹����ģ���ʮ�߸�������(Sickle)��һ����¡(Galleon)����ʮ�Ÿ�����(Knut)��һ�����ɣ������ס������ڣ���������Ӧ���ļ�ǮP����ʵ����ǮA�����������дһ��������������Ӧ�ñ��ҵ���Ǯ��
�����ʽ��
������1���зֱ����P��A����ʽΪ��Galleon.Sickle.Knut���������1���ո�ָ�������Galleon��[0, 10^7]�����ڵ�������Sickle��[0, 17)�����ڵ�������Knut��[0, 29)�����ڵ�������
�����ʽ��
��һ������������ͬ���ĸ�ʽ�������Ӧ�ñ��ҵ���Ǯ�������û����Ǯ����ô�����Ӧ���Ǹ�����
��������1��
10.16.27 14.1.28
�������1��
3.2.1
��������2��
14.1.28 10.16.27
�������2��
-3.2.1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main037 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bf.readLine().split(" ");
		cal(input[0], input[1]);
	}
	
	public static void cal(String s1, String s2) {
		
		String[] str1 = s1.split("\\.");
		String[] str2 = s2.split("\\.");
		int galleon1 = Integer.parseInt(str1[0]);
		int sickle1 = Integer.parseInt(str1[1]);
		int knut1 = Integer.parseInt(str1[2]);
		int galleon2 = Integer.parseInt(str2[0]);
		int sickle2 = Integer.parseInt(str2[1]);
		int knut2 = Integer.parseInt(str2[2]);
		
		int resg = 0, ress = 0, resk = 0;
		
		if(galleon2>galleon1) {
			if(knut2<knut1) {
				resk = (knut2+29)-knut1;
				sickle2--;
			}else {
				resk = knut2-knut1;
			}
			if(sickle2<sickle1) {
				ress = (sickle2+17)-sickle1;
				galleon2--;
			}else {
				ress = sickle2-sickle1;
			}
			resg = galleon2-galleon1;
			System.out.println(resg+"."+ress+"."+resk);
			
		}else if(galleon2<galleon1){
			if(knut1<knut2) {
				resk = (knut1+29)-knut2;
				sickle1--;
			}else {
				resk = knut1-knut2;
			}
			if(sickle1<sickle2) {
				ress = (sickle1+17)-sickle2;
				galleon1--;
			}else {
				ress = sickle1-sickle2;
			}
			resg = galleon1-galleon2;
			System.out.println("-"+resg+"."+ress+"."+resk);
			
		}else {
			resg = 0;
			if(sickle2>sickle1) {
				if(knut2<knut1) {
					resk = knut2+29-knut1;
					sickle2--;
				}else {
					resk = knut2-knut1;
				}
				ress = sickle2-sickle1;
				System.out.println(resg+"."+ress+"."+resk);
			}else if(sickle2<sickle1) {
				if(knut1<knut2) {
					resk = knut1+29-knut2;
					sickle1--;
				}else {
					resk = knut1-knut2;
				}
				ress = sickle1-sickle2;
				System.out.println("-"+resg+"."+ress+"."+resk);
				
			}else {
				ress = 0;
				if(knut2>knut1) {
					resk = knut2-knut1;
					System.out.println(resg+"."+ress+"."+resk);
				}else if(knut2<knut1) {
					resk = knut1-knut2;
					System.out.println("-"+resg+"."+ress+"."+resk);
				}else {
					System.out.println("0.0.0");
				}
			}
		}
	}
}
