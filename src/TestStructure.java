
import java.util.ArrayList;
import java.util.List;

public class TestStructure {

	public static void main(String[] args) {

	//Find maximum height structure || List with Objects & Streams
	//LIST WITH OBJECTS, GETTERS, STREAMS WITH FILTERS, toString() METHOD, POJO, ENCAPSULATION, CONSTRUCTOR....
		
	//Create all structures data by creating structure object and provide all the details i.e. structureName, country, city, height, built,rank

		Structure s1 = new Structure("Burj Khalifa", "UAE", "Dubai", 829, 2010, 1);
		Structure s2 = new Structure("Clock Tower Hotel", "Saudi Arabia", "Mecca", 601, 2012, 2);
		Structure s3 = new Structure("Taipei 101", "Taiwan", "Taipei", 509, 2004, 3);
		Structure s4 = new Structure("Financial Center", "China", "Shanghai", 492, 2008, 4);
		
		//Store all these structures objects by adding all the structure objects to the ArrayList:
		//what kind of generic store - Student
		List<Structure> structureList = new ArrayList<Structure>();
		
		structureList.add(s1);
		structureList.add(s2);
		structureList.add(s3);
		structureList.add(s4);
		
		//Total no. of structures
		System.out.println("Total structures: " + structureList.size());
		
		System.out.println("**********************************");
		//Print all the structures by for each loop
		for(Structure s : structureList) {
			System.out.println(s);
		}
		
		System.out.println("**********************************");
		
		structureList.stream().forEach(e -> System.out.println(e));
		
		System.out.println("**********************************");
		//name the structure who is the highest height:
		int hh = 
				structureList
				.stream()
					.map(e -> e.getHeight())
						.max(Integer :: compare)
							.get();
		System.out.println("Highest structure height: " + hh);
		
		structureList
			.stream()
				.filter(e -> e.getHeight()==hh)
					.forEach(e -> System.out.println(e));
	}

}

