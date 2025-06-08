package OOPs.Inheritance.Hybrid;

interface A {
    void showA();
}

class B {
    void showB() {
        System.out.println("Inside class B");
    }
}

class C extends B {
    void showC() {
        System.out.println("Inside class C");
    }
}

interface D {
    void showD();
}

class E extends C implements A, D {
    public void showA() {
        System.out.println("Inside interface A");
    }

    public void showD() {
        System.out.println("Inside interface D");
    }

    void showE() {
        System.out.println("Inside class E");
    }
}


public class demo1 {

	public static void main(String[] args) {
		// Hybrid inheritance : Hybrid inheritance is a combination of
		//simple, multiple inheritance and hierarchical inheritance.

		E obj = new E();
        obj.showA();  // from Interface A
        obj.showB();  // from class B
        obj.showC();  // from class C
        obj.showD();  // from Interface D
        obj.showE();  // from class E
	}

}
