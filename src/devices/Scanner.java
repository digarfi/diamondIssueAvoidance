package devices;

public class Scanner extends Device{

	
	public Scanner (String serialNumber) {
		super(serialNumber);
	}
	
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner Processing " + doc);
	}
	
	public String scan() {
		return "Scannerd Content";
	}
	
}