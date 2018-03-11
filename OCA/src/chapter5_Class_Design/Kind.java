package chapter5_Class_Design;

class Vater {
	// private int age;
	// public String name;

	public static void hal() {
		System.out.println("-hal");
	}

	// public Vater(int age, String name) {
	// super();
	// this.age = age;
	// this.name = name;
	// }
	// public int getAge() {
	// return age;
	// }
	// public void setAge(int age) {
	// this.age = age;
	// }
	// public String getName() {
	// return name;
	// }
	// public void setName(String name) {
	// this.name = name;
	// }

}

public class Kind extends Vater {

	// public Kind() {
	//// super(10, "name");
	// // TODO Auto-generated constructor stub
	// }
	public static void hal() {
		System.out.println("gyerek-hal");
	}
	
	public static void main(String[] args) {
		// System.out.println("aa");

		
 		Vater vater = (Vater)new Kind();

		vater.hal();

	}

}
