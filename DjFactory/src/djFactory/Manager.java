package djFactory;

import java.io.File;

public class Manager {

	static final File inFolder = new File("d:/_Zenék/____Dj_Factory/in/");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Handler handler = new Handler();
		
		File[] contentList = inFolder.listFiles();
		
		for (File f : contentList) {
			handler.test(f);
		}
	}
}
