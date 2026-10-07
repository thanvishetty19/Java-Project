package Student;

public class ClassStudent {
	String name;
	int age;
	void introduce() {
		System.out.println(" I am " + name + ",age" + age);}
	public static void main(String[]args) {
		
	 ClassStudent s = new ClassStudent(); //create an object
	s.name="Thanvi"; s.age=21;
	s.introduce();
	}
}
