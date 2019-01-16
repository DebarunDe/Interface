
public class BaseTwoFormatter implements NumberFormatter{

private int formattedNumber;
	
	public BaseTwoFormatter(int formattedNumber)
	{
		this.formattedNumber = formattedNumber;
		
	}
	
	public String getFormat(int parameter)
	{
		String str = "" + formattedNumber;
		String hold ="";
		boolean add0 = false;
		
	for(int i = 0; i < str.length(); i++) {
		while(Integer.parseInt(Character.toString(str.charAt(i)))%2 != 1 || Integer.parseInt(Character.toString(str.charAt(i)))%2 != 0)
		{
			int saveMe = Integer.parseInt(Character.toString(str.charAt(i)));
		}
		
		if(Integer.parseInt(Character.toString(str.charAt(i)))%2 == 1 && i != str.length() -1)
		 Character.toString(str.charAt(i));
	}
	}
}
