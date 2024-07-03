public class Student {

	//Find Student Name Holding Highest Mark || List with Objects & Streams
	//LIST WITH OBJECTS, GETTERS, STREAMS WITH FILTERS, toString() METHOD, POJO, ENCAPSULATION, CONSTRUCTOR....
	//POJO class
	
	private String name;
	private int rollNum;
	private int marks;
	private int age;

	//constructor to initialize the private variables
	public Student(String name, int rollNum, int marks, int age) {
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
		this.age = age;
	}

	//Creating Getters & Setters and remove Setters
	public String getName() {
		return name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", marks=" + marks + ", age=" + age + "]";
	}

	

}
