package devices;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice (String serialNumber ) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo Printer: "+ doc);
		
	}

	@Override
	public String scan() {
		return "Combo Scan Result" ;
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo Processing :" + doc);
		
	}
	

}
