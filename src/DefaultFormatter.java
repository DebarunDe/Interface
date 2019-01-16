import java.util.*;
public class DefaultFormatter implements NumberFormatter{

	private int formattedNumber;
	
	public DefaultFormatter(int formattedNumber)
	{
		this.formattedNumber = formattedNumber;
		
	}
	
	public String getFormat(int parameter)
	{
		String str = "" + formattedNumber;
		String hold ="";
		int Comma;
		boolean addComma = false;
		
		if(str.length()%3 == 1)
			Comma = 0;
		else if(str.length()%3 == 0)
			Comma = 2;
		else
			Comma = 1;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(i == Comma)
				addComma = true;
			
			hold += str.charAt(i);
			
			if(i != str.length()-1 && addComma && i%3 == Comma)
				hold += ",";
		}
		
		
		return hold;
	}
}
