import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main020 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s = bf.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int d = Integer.parseInt(s[1]);

		List<Cake> list = new ArrayList<Cake>();
		String[] w = bf.readLine().split(" ");
		String[] pri = bf.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			double am = Double.parseDouble(w[i]);
			double p = Double.parseDouble(pri[i]);
			double v = p / am;
			list.add(new Cake(am, p, v));
		}
		
		Collections.sort(list);
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			if (d - list.get(i).amount >= 0) {
				sum += list.get(i).price;
				d -= list.get(i).amount;
			} else {
				sum += list.get(i).value * d;
				break;
			}
		}
		System.out.println(String.format("%.2f", sum));
	}

	static class Cake implements Comparable<Cake> {
		double amount;
		double price;
		double value;

		public Cake(double amount, double price, double value) {
			this.amount = amount;
			this.price = price;
			this.value = value;
		}

		public int compareTo(Cake c) {
			return value > c.value ? -1 : 1;
		}
	}
}
