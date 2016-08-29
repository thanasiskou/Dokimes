package subClassSuperClass;

public class Car extends Vehicle{
	protected void print(){
		System.out.println("Car (Subclass)");
	}
	protected void printSuper(){
		super.print();
	}
}
