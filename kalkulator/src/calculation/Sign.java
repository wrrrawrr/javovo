package calculation;

public class Sign {
	private double dDigit;
	private String strFunction;
	private boolean bDigit;


	public Sign(String strFunction) {
		super();
		this.strFunction = strFunction;
		this.bDigit = false;
	}

	public Sign(double dDigit) {
		super();
		this.dDigit = dDigit;
		this.bDigit = true;
	}

	public double getdDigit() {
		return dDigit;
	}

	public void setdDigit(double dDigit) {
		this.dDigit = dDigit;
	}

	public String getStrFunction() {
		return strFunction;
	}

	public void setStrFunction(String strFunction) {
		this.strFunction = strFunction;
	}






}
