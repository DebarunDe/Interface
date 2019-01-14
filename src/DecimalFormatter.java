
public class DecimalFormatter {

private int formattedNumber;
	
	public DecimalFormatter(int formattedNumber)
	{
		this.formattedNumber = formattedNumber;
		
	}
	
	public String getFormat(int parameter)
	{
		String hold = " " + formattedNumber;
		String numFinal = "";
		
		
		String num = Integer.toString(formattedNumber);
		return num;
	}
}
