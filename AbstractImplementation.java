package week3.day2;

public class AbstractImplementation extends LearnAbstract {

	public void abstractMethod() {
		System.out.println("Abstact class form LearnAbstract");
	}

	public int studentName(String s, int b) {
		System.out.println("The student name is :" + s);
		System.out.println("The roll no is: " + b);
		return b;
	}

	public static void main(String[] args) {
		AbstractImplementation obj =new AbstractImplementation();
		obj.collegeDetails("Stanford", 31010);
		obj.abstractMethod();
		obj.studentName("Jennifer", 19970);
		
		

	}
}