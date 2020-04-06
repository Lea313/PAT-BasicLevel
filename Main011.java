 
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main011 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");			
			double a = Double.parseDouble(str[0]);
			double b = Double.parseDouble(str[1]);
			double c = Double.parseDouble(str[2]);			
			System.out.println("Case #"+(i+1)+": "+judge(a,b,c));
		}
	}
	
	public static boolean judge(double a, double b, double c) {
		if((a + b) - c > 0.000000000000001) {
			return true;
		}
		return false;
	}
}
