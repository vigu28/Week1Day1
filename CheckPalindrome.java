package Maven;

public class CheckPalindrome {

public static void main(String[] args) {
	
	String Salutation = "MADAM";
	String rev = "";

	int length = Salutation.length();
	
	for (int i=length-1; i>=0;i--) 
	rev = rev + Salutation.charAt(i);
	
	if (Salutation.equals(rev))
		System.out.println(Salutation+ " This string is palindrome" );
	else
		System.out.println(Salutation+ " This string is not palindrome" );	
			
		
}
}
