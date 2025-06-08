package OOPs.Encapasulation;


class Account {
	 public String name;
	 protected String email;
	 @SuppressWarnings("unused")
	private String password;
	 
	 public void setPassword(String password) {
	 this.password = password;
	 }
	 
}
	 
	 
public class demo1 {

	public static void main(String[] args) {
//		Encapsulation
//		Encapsulation is the process of combining data and functions into a single unit
//		called class. In Encapsulation, the data is not accessed directly; it is accessed
//		through the functions present inside the class. In simpler words, attributes of the
//		class are kept private and public getter and setter methods are provided to
//		manipulate these attributes. Thus, encapsulation makes the concept of data
//		hiding possible.(Data hiding: a language feature to restrict access to members of
//		an object, reducing the negative effect due to dependencies. e.g. "protected",
//		"private" feature in Java).
		
		
		Account a1 = new Account();
		 a1.name = "Apna College";
		 a1.setPassword("abcd");
		 a1.email = "hello@apnacollege.com";
		
  
      
	}

}

