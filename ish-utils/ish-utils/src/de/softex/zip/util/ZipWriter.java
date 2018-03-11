package de.softex.zip.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipWriter implements Closeable {

	private String fileName;
	
	FileOutputStream fileOut;
	ZipOutputStream zipOut = null;
	
	public ZipWriter(String newFileName) {
		this.fileName = newFileName;
	}
	
	private void createOutFile() throws FileNotFoundException {
		fileOut = new FileOutputStream(new File(fileName));
		zipOut = new ZipOutputStream(fileOut);
	}
	
	public void addEntryToZip(byte[] content, String path) throws IOException {
		if (zipOut == null) {
			createOutFile();
		}
		ZipEntry entry = new ZipEntry(path);
		zipOut.putNextEntry(entry);
		zipOut.write(content);
		zipOut.closeEntry();
	}
	
	public void close() throws IOException {
		if (zipOut != null)
			zipOut.close();
	}

}
