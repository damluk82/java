package de.softex.main;

import java.io.File;
import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

import de.softex.ish.dbmigrate.util.IshAppContentConverter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		final String FILE_NAME = args[0];
		final String NEW_FILE_NAME = args[1];
		final String OLD_LANGUAGE = args[2];
		final String NEW_LANGUAGE = args[3];
		final String OLD_DOMAIN = args[4];
		final String NEW_DOMAIN = args[5];
		final String LEVEL = args.length > 6 ? args[6] : "INFO";
		
		Handler ch = new StreamHandler(System.out, new Formatter() {
			
			@Override
			public String format(LogRecord record) {
				return record.getMessage() + System.lineSeparator();
			}
		});
		
		Logger log = Logger.getLogger("ish-utils");
		log.setUseParentHandlers(false);
		log.addHandler(ch);
		log.setLevel(Level.INFO);
		
		if (args.length < 5) {
			log.info("arguments: filename, new filename, old language, new language, "
					+ "old domain, new domain, optional log level");
			System.exit(0);
		}
		
		try {
			log.setLevel(Level.parse(LEVEL));
		} catch (Exception e) {
			log.warning("could not parse log level, using INFO");
		}
		
		log.info("Starting main");
		File f = new File(FILE_NAME);
		if (!f.exists()) {
			log.warning("file " + FILE_NAME + " does not exist");
			System.exit(0);
		}
		
		IshAppContentConverter converter = new IshAppContentConverter(
				FILE_NAME, 
				NEW_FILE_NAME, 
				OLD_LANGUAGE, 
				NEW_LANGUAGE, 
				OLD_DOMAIN, 
				NEW_DOMAIN
		);
		converter.convert();
	}

}
