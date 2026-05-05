class Student
{
	int rno;
	String sname;
	public Student() {
		System.out.println("Default Constructor");
	}
	public Student(int rno, String sname) {
		this();
		System.out.println("Parameterized Constructor");
		this.rno = rno;
		this.sname = sname;
	}
	
}
public class Thiskeyword {
	public static void main(String[] args) {
		Student s1=new Student(1,"Jigar");
	}
}
