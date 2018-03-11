package fileReader.OpenURL.src.OpenURL;

import java.awt.Desktop;
import java.io.File;
import java.net.URI;

public class Main {

	public static void main(String[] args) {
		
		File inputFile = new File("D:/Data/excelFile.xlsx");
		
		TelisTest.openTelis(FileProcess.readInput(inputFile));		
		
	}

}
