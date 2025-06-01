package ConditionalStatements;

public class demo5 {

	public static void main(String[] args) {
		// Vowel or Consonant
		
		char ch = 'O';
		//Character class convert ch into LowerCase
		ch = Character.toLowerCase(ch);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " This is Character is Vowel...!");
		}else {
			System.out.println(ch + " This is Character is Consonant...!");
		}

	}

}
