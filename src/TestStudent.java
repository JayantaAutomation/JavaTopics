import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		//Find Student Name Holding Highest Mark || List with Objects & Streams
		//LIST WITH OBJECTS, GETTERS, STREAMS WITH FILTERS, toString() METHOD, POJO, ENCAPSULATION, CONSTRUCTOR....
		
		//Create all students data by creating student object and provide all the details i.e. Name, roll no, mark, age
		
		Student s1 = new Student("Krishna", 1, 100, 21);
		Student s2 = new Student("Radha", 2, 99, 20);
		Student s3 = new Student("Madhav", 3, 98, 19);
		Student s4 = new Student("Damodara", 4, 88, 18);
		Student s5 = new Student("Hrishikesha", 5, 75, 15);

		
		//Store all these student objects by adding all the student objects to the ArrayList:
		//what kind of generics store - Student
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		//Total no. of students
		System.out.println("Total students: " + studentList.size());
		
		System.out.println("**********************************");
		//Print all the students by for each loop
		for(Student s : studentList) {
			System.out.println(s);
		}
		
		System.out.println("**********************************");
		
		studentList.stream().forEach(e -> System.out.println(e));

		System.out.println("**********************************");
		
		//name where marks>90
		studentList.stream().filter(e -> e.getMarks()>90).forEach(e -> System.out.println(e.getName() + " : " + e.getMarks()));
		
		System.out.println("**********************************");
		
		//name who got the highest mark:
		int hm = 
				studentList
				.stream()
					.map(e -> e.getMarks())
						.max(Integer :: compare)
							.get();
		System.out.println("Highest marks: " + hm);
		
		studentList
			.stream()
				.filter(e -> e.getMarks()==hm)
					.forEach(e -> System.out.println(e));
		
	}

}
