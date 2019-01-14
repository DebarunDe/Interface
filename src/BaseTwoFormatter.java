
public class BaseTwoFormatter {

private int formattedNumber;
	
	public BaseTwoFormatter(int formattedNumber)
	{
		this.formattedNumber = formattedNumber;
		
	}
	
	public String getFormat(int parameter)
	{
		String num = Integer.toString(formattedNumber);
		return num;
	}
}
