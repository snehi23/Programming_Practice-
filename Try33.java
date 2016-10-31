import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int roll;
	String name;
	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public  String toString() {
		return roll+ ' '+name;
	}
	
	public int compareTo(Student s1) {
		
		if(this.roll == s1.roll) return 0;
		
		return this.roll > s1.roll ? 1:-1;
	}
	
}

class MyComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		
		if(s1.roll == s2.roll) return 0;
		else if(s1.roll > s2.roll) return 1;
		else return -1;
	}

}

public class Try33 {

	public static void main(String []argh) {	
		
		TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
		
		ts.add(new Student(50, "snehal"));
		ts.add(new Student(67, "kedar"));
		ts.add(new Student(34, "meenal"));
		
		System.out.println(ts);

	}
	
	

}


