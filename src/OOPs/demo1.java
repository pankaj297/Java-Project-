package OOPs;

//class
class Pen{
	String color;
	String type; // Ballpoint, gel
	
	public void write() {
		System.out.println("Writeing Something...!");
	}
	
	public void printColor() {
		//used for call current object
		System.out.println(this.color);
		System.out.println(this.type);
	}
}

public class demo1 {

	public static void main(String[] args) {
		// OOPs Class and Object 
		
		//Object Create
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		
		
		// Call Write() function
//		pen1.write();
		
		//Object Create
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "bollpoint";
		
		//Call printColor function 
		pen1.printColor();
		pen2.printColor();

	}

}
