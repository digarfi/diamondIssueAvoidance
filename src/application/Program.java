package application;



import devices.Printer;
import devices.Scanner;

public class Program {

	public static void main(String[] args) {
		
		 Printer p =new Printer ("10588");
		 p.processDoc("My Letter");
		 p.print("My Letter");
		 
		 System.out.println();
		 Scanner s = new Scanner ("20300" );
		 s.processDoc("email");
		 System.out.println("Scan result: " + s.scan());
	}

}
