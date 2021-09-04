package progmsstrings;

public class Program1 {
	public static void main(String args[])

	{
		String string="Hello World";
		String revString="";
		for(int i=string.length()-1;i>=0;i--)
		{
		revString=revString+string.charAt(i);	
		}
		System.out.println("original string:"+string);
		System.out.println("reversed  string:"+revString);
		
		
	}
}
