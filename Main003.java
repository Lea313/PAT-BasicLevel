/*
“答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于 PAT 的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。
得到“答案正确”的条件是：
字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；
任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a、 b、 c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
现在就请你为 PAT 写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
输入格式：
每个测试输入包含 1 个测试用例。第 1 行给出一个正整数 n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过 100，且不包含空格。
输出格式：
每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出 YES，否则输出 NO。
输入样例：
8
PAT
PAAT
AAPATAA
AAPAATAAAA
xPATx
PT
Whatever
APAAATAA
  
输出样例：
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
		int q = 0, z = 0, h = 0;//前中后
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
