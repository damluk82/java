package djFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handler {

	public boolean isDir(File subject) {
		return subject.isDirectory();
	}

	public void test(File subject){
		
		if (subject.isFile()){
			processFile(subject);
		} else {
			File[] newList = subject.listFiles();
			for (File file : newList){
				if (file.isFile()){
					processFile(file);
				}
			}
			subject.delete();
		}
	}
	
	public void processFile(File file){
		String[] fileNameParams = createFileNameParams(file.getName());
		renameFile(file, fileNameParams);
	}
	
	public String[] createFileNameParams(String subject) {
		
		String[] params = new String[2];
		Pattern datePattern = Pattern.compile(".*(\\d{8}).*");
		Pattern[] authors = {Pattern.compile(".*(Andro).*"),
							Pattern.compile(".*(Droplex).*"),
							Pattern.compile(".*(Purebeat).*")};
		
		for(int i=0; i<authors.length; i++) {
			Matcher authorMatcher = authors[i].matcher(subject);
			if (authorMatcher.matches()){
				params[1] = authorMatcher.group(1);
				break;
			}
		}
		
		Matcher dateMatcher = datePattern.matcher(subject);
		
		if (dateMatcher.matches()) {   
			params[0] = dateMatcher.group(1);
		} else {
			System.out.println("Date didn't match!");
		}
		return params;
	}
	
	public void renameFile(File file, String[] params){
		
		Path sourcePath = file.toPath();
		Path destPath = Paths.get("d:/_Zenék/____Dj_Factory/_ready/" + params[1]);
		
		if (!Files.exists(destPath)){
		try {
			Files.createDirectory(destPath);
		} catch (Exception e) {
			e.printStackTrace();
		}}
	
		try {
			Files.move(sourcePath, destPath.resolve(
					   params[0] 
					   + "_" 
					   + params[1] 
					   + ".mp3"), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
