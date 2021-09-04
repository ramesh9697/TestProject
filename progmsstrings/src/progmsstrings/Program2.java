package progmsstrings;

public class Program2 {

	public static void main(String[] args) {
		String string="kayak";
		boolean flag=true;
		for(int i=1;i<string.length()/2;i++)
		{
			if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
				flag=false;
				break;
				
			}
		}
		if(flag)
		{
			System.out.println("given string is palindrome");
		}
		else
			System.out.println("given string is not palindrome");

	}

}
