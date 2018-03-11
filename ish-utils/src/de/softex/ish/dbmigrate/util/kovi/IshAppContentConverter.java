package de.softex.ish.dbmigrate.util.kovi;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class IshAppContentConverter {
	
	private final String fileName;
	private final String newFileName;
	private final String oldLanguage;
	private final String newLanguage;
	private final String oldDomain;
	private final String newDomain;
	
	static final Logger log = Logger.getLogger("ish-utils");
	
	public IshAppContentConverter(String fileName, String newFileName, String oldLanguage, String newLanguage,
			String oldDomain, String newDomain) {
		this.fileName = fileName;
		this.newFileName = newFileName;
		this.oldLanguage = oldLanguage;
		this.newLanguage = newLanguage;
		this.oldDomain = oldDomain;
		this.newDomain = newDomain;
	}
	
	public void convert() throws IOException {
		ZipReader zr = null;
		ZipWriter zw = null;

		try {
			zr = new ZipReader(fileName);
			log.info("Opening file" + fileName);
			
			zr.open();
			
			log.info("Converting " + fileName);
			log.info("Language '" + oldLanguage + "' to '" + newLanguage + "'");
			log.info("Domain '" + oldDomain + "' to '" + newDomain + "'");
			
			//ContentConverter contentConverter = new ContentConverter(oldLanguage, newLanguage, oldDomain, newDomain);
			ChangeLocale cl = new ChangeLocale(oldLanguage, newLanguage, oldDomain, newDomain);
			InputStream in;
			zw = new ZipWriter(newFileName);
			while ((in = zr.readEntry()) != null) {
				byte[] content;
				if (zr.getCurrentPath().toLowerCase().endsWith(".xml")) {
					//TODO Kovi contentConverter
					//content = contentConverter.convert(in);
					content = cl.convert(in);
				} else {
					content = new byte[in.available()];
					in.read(content);
				}
				zw.addEntryToZip(content, zr.getCurrentPath());
				in.close();
			}
		} finally {
			try {
				zr.close();
			} catch (IOException ioe) {
				log.info(ioe.toString());
			}
			try {
				if (zw != null)
					zw.close();
			} catch (IOException ioe) {
				log.info(ioe.toString());
			}
		}
		log.info("Done, new file: " + newFileName);
	}

}
