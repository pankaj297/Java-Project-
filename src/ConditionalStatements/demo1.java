package ConditionalStatements;

public class demo1 {

  public static void main(String[] args) {
	  //Q: Write a code to check if a number is positive, negative, or zero.
	 
	  int num = -12;
	  
	  if(num > 0) {
		  System.out.println("This is Positive Number. . .!");
	  }else if(num == 0){
		  System.out.println("This is Zero. . .!");
	  }else {
		  System.out.println("This is Negative Number . . .!");
	  }
  }
}
