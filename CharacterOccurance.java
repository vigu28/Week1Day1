package Maven;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		String NewWords = " WELCOME TO CHENNAI";
		
		System.out.println("occurance of the char are ");
		
		int occurance = 0;
		
		for (int i=0;i<NewWords.length();i++) {
		
			
				if (NewWords.charAt(i) == 'E') {
					occurance ++;
				}
			}
			
			{System.out.println(occurance);
			
		}
		
	}
}
