package de.softex.ish.dbmigrate.util.kovi;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipReader implements Closeable {
	
	private String fileName;
	private ZipFile zipFile = null;
	private Enumeration<? extends ZipEntry> entries = null;
	private ZipEntry currentEntry;
	
	public ZipReader(String fileName) {
		this.fileName = fileName;
	}

	public void open() throws IOException {
		zipFile = new ZipFile(fileName);
		entries = zipFile.entries();
	}
	
	public void close() throws IOException {
		if (zipFile != null)
			zipFile.close();
	}
	
	public InputStream readEntry() throws IOException {
		if (zipFile == null) {
			open();
		}
		if (entries != null && entries.hasMoreElements()) {
			currentEntry = entries.nextElement();
			return zipFile.getInputStream(currentEntry);
		}
		return null;
	}
	
	public String getCurrentPath() {
		if (currentEntry != null) {
			return currentEntry.getName();
		}
		return null;
	}
}
