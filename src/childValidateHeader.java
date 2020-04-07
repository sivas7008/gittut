
public class childValidateHeader {

	public static void main(String[] args) {
		
		headerValidations hv = new headerValidations();
		
		hv.validateHeader("Schwab Advisor Center");
		
	System.out.println(hv.validateHeader("Hello"));

	}

}
