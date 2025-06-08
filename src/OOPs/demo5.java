package OOPs;

class Book{
	String title;
	int page;
	
	Book(){
		title = "rich dad poor dad";
		page = 500;
	}
	
	Book(String t, int p){
		title = t;
		page = p;
	}
	
	void show() {
		System.out.println(title + " - "+ page + " Page");
	}
}

public class demo5 {

	public static void main(String[] args) {
		// ✅ 10. Create a class to show constructor overloading.
		
		Book b1 = new Book();
		b1.show();
		Book b2 = new Book("Java", 430);
		b2.show();
		

	}

}
