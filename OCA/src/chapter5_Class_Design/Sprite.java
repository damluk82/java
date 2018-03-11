package chapter5_Class_Design;

import java.io.IOException;

public class Sprite extends Water {

	public void fluid() throws IOException{
		
//		System.out.println("Sprite is Fluid");
//		super.fluid();
		System.out.println("But Sprite is more tasty");
		
	}
	
	public static String getName(){
		
		return "Sprite";
		
	}
	
	public static void main(String[] args) {
		
		Sprite sprite = new Sprite();
		Water water = new Water();
		Water w = new Sprite();
			
		try {
			sprite.fluid();
//			water.fluid();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Sprite " + sprite.getName());
		System.out.println("Water " + water.getName());
		System.out.println("Water " + w.getName());
		
		
	}
	
}
