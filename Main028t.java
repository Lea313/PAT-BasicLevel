//更好的写法，但依然ac不了，一个点超时

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main028t {
	
	static DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	
	public static void main(String[] args) throws IOException, ParseException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Date now = df.parse("2014/09/06");
		Date from = df.parse("1814/09/06");
		List<Person> list = new ArrayList<Person>();
		for(int i=0;i<n;i++) {
			String[] str = bf.readLine().split(" ");
			String name = str[0];
			Date date = df.parse(str[1]);
			if(date.compareTo(now)<=0&&date.compareTo(from)>=0) {
				list.add(new Person(name, date));
			}
		}
		if(list.size()>0) {
			Collections.sort(list);
			System.out.println(list.size()+" "+list.get(0).name+" "+list.get(list.size()-1).name);
		}else {
			System.out.println(0);
		}
	}
}

class Person implements Comparable<Person>{
	String name;
	Date birth;
	public Person(String name, Date birth) {
		super();
		this.name = name;
		this.birth = birth;
	}
	@Override
	public int compareTo(Person o) {
		return this.birth.compareTo(o.birth);
	}	
}
