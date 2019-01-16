
public class DecimalFormatter implements NumberFormatter{

private int formattedNumber;
	
	public DecimalFormatter(int formattedNumber)
	{
		this.formattedNumber = formattedNumber;
		
	}
	
	public String getFormat(int parameter)
	{
			String str = "" + formattedNumber;
			String hold ="";
			int dec;
			boolean addDec = false;
			
			if(str.length()%3 == 1)
				dec = 0;
			else if(str.length()%3 == 0)
				dec = 2;
			else
				dec = 1;
			
			for(int i = 0; i < str.length(); i++)
			{
				if(i == dec)
					addDec = true;
				
				hold += str.charAt(i);
				
				if(i != str.length()-1 && addDec && i%3 == dec)
					hold += ".";
			}
			
			
			return hold;
	}
}
