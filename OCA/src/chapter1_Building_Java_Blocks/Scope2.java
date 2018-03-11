package chapter1_Building_Java_Blocks;

public class Scope2 {

	int width;
	int height = 1;
	int length;
	int volume;

	public static void main(String args[]) {
		Scope2 obj = new Scope2();
		obj.volume();
		System.out.println(obj.volume);
	}

	Scope2() {
		width = 5;
		length = 6;
	}

	
	void volume() {
		int Public = 1;
		int $ = 1;
		int b = 127+1;
		volume = width * height * length + Public + $;
	}

}
