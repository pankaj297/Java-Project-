package ConditionalStatements;

public class demo9 {
  public static void main(String[] args) {
	  //Vowel or Consonant using switch
	  
	  char ch = 'h';
	  Character.toLowerCase(ch);
	  
	  switch(ch) {
	  case 'a': System.out.println("Vowel");break;
	  case 'e': System.out.println("Vowel");break;
	  case 'i': System.out.println("Vowel");break;
	  case 'o': System.out.println("Vowel");break;
	  case 'u': System.out.println("Vowel");break;
	  default: System.out.println("Consonant");
	  }
  }
}
