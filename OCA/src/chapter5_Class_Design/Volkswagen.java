package chapter5_Class_Design;

public class Volkswagen extends Auto {

	
	public static boolean canElectic(){
		return true;
	}
	@Override
	public void testIfCanElectric(){
		System.out.println(super.canElectic());
		System.out.println(canElectic());
	}
	
	public static void show(){
		System.out.println("new");
	}
	
	public String getName(){
		return "VW" + super.getName();
	}
	
	public static void main(String[] args) {
		
		Auto a = new Auto();
		Volkswagen f = new Volkswagen();
		
		
		Auto a2 = new Volkswagen();
		
//		System.out.println(f.canElectic());
//		System.out.println(f.canElectic());
		f.testIfCanElectric();
		
		
//		System.out.println(a.canElectic());
//		System.out.println(f.canElectic());
//		System.out.println(a2.canElectic());
//		a.testIfCanElectric();
//		f.testIfCanElectric();
	
//		System.out.println(f.getName());
		
		
//		System.out.println(a.canElectic());
//		System.out.println(f.canElectic());
//		a2.testIfCanElectric();
		
//		a.testIfCanElectric();
//		f.testIfCanElectric();
//		
//		a = (Auto)f;
//		a.testIfCanElectric();
//		
		
		
		
		
	}
	
	
}
