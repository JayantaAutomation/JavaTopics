package javaConcepts;

public class ClassObjects2ndExample {

	public static void main(String[] args) {
		// Create a human object
		
		Computer lenevo = new Computer();
		//Computer hp = new Computer();
		//Computer apple = new Computer();
		
		lenevo.computerModel ="Lenevoi7";
		lenevo.computerOs = "Window11";
		lenevo.computerHarddisk = "SSD500";
		lenevo.computerRam = "16gb";
		
		lenevo.startComputer();
		lenevo.stopComputer();
		lenevo.computerDetails();
	}

}
		class Computer {
			
			String computerModel;
			String computerOs;
			String computerHarddisk;
			String computerRam;
			
			public void startComputer() {
				
				System.out.println(computerModel + " started");
			}
			
			public void stopComputer() {
				
				System.out.println(computerModel + " stopped");
			}
			
			public void computerDetails() {
				System.out.println("The model of the computer is: " + computerModel);
				System.out.println("The os of the computer is: " + computerOs);
				System.out.println("The harddisk of the computer is: " + computerHarddisk);
				System.out.println("The ram of the computer is: " + computerRam);
				System.out.println("******************************************");
			}
			
		}

