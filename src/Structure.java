/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class Structure {

		//Find maximum height structure || List with Objects & Streams
		//LIST WITH OBJECTS, GETTERS, STREAMS WITH FILTERS, toString() METHOD, POJO, ENCAPSULATION, CONSTRUCTOR....
		//POJO class
		
		private String name;
		private String country;
		private String city;
		private int height;
		private int built;
		private int rank;

		//constructor to initialize the private variables
		public Structure(String name, String country, String city, int height, int built, int rank) {
			this.name = name;
			this.country = country;
			this.city = city;
			this.height = height;
			this.built = built;
			this.rank = rank;
		}

		//Creating Getters & Setters and remove Setters

		public String getname() {
			return name;
		}

		public String getCountry() {
			return country;
		}

		public String getCity() {
			return city;
		}

		public int getHeight() {
			return height;
		}

		public int getBuilt() {
			return built;
		}

		public int getRank() {
			return rank;
		}

		@Override
		public String toString() {
			return "Structure [name=" + name + ", country=" + country + ", city=" + city + ", height=" + height
					+ ", built=" + built + ", rank=" + rank + "]";
		}

}
