package ConditionalStatements;

public class demo6 {
  public static void main(String[]args) {
	  //Greatest of Three Numbers
	  
	  int a = 20;
	  int b = 15;
	  int c = 17;
	  
	  if(a >= b && a >= c) {
		  System.out.println("Greatest A : "+ a);
	  }else if(b >= a && b >= c) {
		  System.out.println("Greatest B : "+ b);
	  }else {
		  System.out.println("Greatest C : "+ c);
	  }
  }
}
