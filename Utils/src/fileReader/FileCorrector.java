package fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileCorrector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fileContent = new ArrayList<String>();
		File inputFile = new File("D:/java/input.txt");
		File outputPath = new File("D:/java/packagea");
				
		System.out.println("Please add Output File: ");
		Scanner scanner = new Scanner(System.in);
		
		String sep = System.getProperty("file.separator");
		String nameOfTheInputFile = scanner.nextLine();
		String anyad = outputPath + sep + nameOfTheInputFile;
		File outputFile = new File(anyad + ".java");
		File outputFileTest = new File(anyad + "TestDrive.java");
		
		scanner.close();
		
		//Create a new file
		
		try {
			if ( outputFile.createNewFile() &&  outputFileTest.createNewFile()) {
			      
			   } else {
				   System.out.println("The file is already exists!");
				   return;
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block–
			e.printStackTrace();
		}
		
		try {
			
			String sCurrentLine;
			BufferedReader in = new BufferedReader(new FileReader(inputFile));
//			int x = 0;
			while ((sCurrentLine = in.readLine()) != null) {
//				System.out.println(sCurrentLine);
//				System.out.println(sCurrentLine.substring(3));
				fileContent.add(sCurrentLine.substring(3));
//				x++;
			}
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			PrintWriter writer = new PrintWriter(outputFile);
	
			for (String lineContent : fileContent){
				writer.println(lineContent);	
			}			
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Create TestDrive:
		
		try {
			
			PrintWriter writeTestDrive = new PrintWriter(outputFileTest);
			
			writeTestDrive.println("public class " +  nameOfTheInputFile +  "TestDrive{");
			writeTestDrive.println("	public static void main(String[] args) {");
			writeTestDrive.println(		nameOfTheInputFile + " ob1 = new " + nameOfTheInputFile+ "();");
//			writeTestDrive.println(		"ob1");
			writeTestDrive.println(		"System.out.println(\"Success!\"); ");
			writeTestDrive.println(		"}");
			writeTestDrive.println(	"}");
			
			
			writeTestDrive.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
