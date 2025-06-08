package OOPs;

class ClgStudent{
	String name;
    static String school;
    
    public static void chageSchool() {
    	school = "newSchool";
    }
	
}

public class Static {

	public static void main(String[] args) {
		// Sativ keyword example
		ClgStudent.school = "MySchool";
        
		ClgStudent student1 = new ClgStudent();
		student1.name = "pankaj";
		System.out.println(ClgStudent.school);
		
	}

}


