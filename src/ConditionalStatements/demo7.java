package ConditionalStatements;

public class demo7 {
   public static void main(String[] args) {
	   //Alphabet, Digit, or Special Character
	   
	   char ch = 'D';
	   
	   if(Character.isLetter(ch)) {
		   System.out.println("This is Letter...!");
	   }else if(Character.isDigit(ch)) {
		   System.out.println("This is digit...!");
	   }else {
		   System.out.println("This is special Character...!");
	   }
   }
}
