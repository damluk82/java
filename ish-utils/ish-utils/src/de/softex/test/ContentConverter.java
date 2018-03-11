package de.softex.test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ContentConverter {

	
	private final String oldLanguage;
	private final String newLanguage;
	private final String oldDomain;
	private final String newDomain;
	
	public ContentConverter(String oldLanguage, String newLanguage, String oldDomain, String newDomain) {
		this.oldLanguage = oldLanguage;
		this.newLanguage = newLanguage;
		this.oldDomain = oldDomain;
		this.newDomain = newDomain;
	}

	public byte[] convert(final InputStream in) throws IOException {
		// TODO Auto-generated method stub
		return readAndUpdate(in);
	}

	private byte[] readAndUpdate(InputStream in) throws IOException {
		Scanner sc = new Scanner(in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine());
		}
		sc.close();
		return sb.toString().getBytes(Charset.forName("UTF-8"));
	}
}
