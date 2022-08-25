package application;



import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		 ConcretePrinter p =new ConcretePrinter ("1058");
		 p.processDoc("My Letter");
		 p.print("My Letter");
		 
		 System.out.println();
		 ConcreteScanner s = new ConcreteScanner ("2030" );
		 s.processDoc("email");
		 System.out.println("Scan result: " + s.scan());
		 
		 System.out.println();
		 ComboDevice c = new ComboDevice("2081");
		 c.processDoc("Dissertation");
		 c.print("Dissertation");
		 System.out.println("Scan Result: " + c.scan());
			 
	}
}
