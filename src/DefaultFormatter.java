import java.util.*;
public class DefaultFormatter {

	private int formattedNumber;
	
	public DefaultFormatter(int formattedNumber)
	{
		this.formattedNumber = formattedNumber;
		
	}
	
	public String getFormat(int parameter)
	{
		String num = Integer.toString(formattedNumber);
		return num;
	}
}
