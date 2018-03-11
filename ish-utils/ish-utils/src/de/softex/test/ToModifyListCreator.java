package de.softex.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.stream.IntStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.softex.zip.util.ZipReader;

public class ToModifyListCreator {
	
	static final String language = "de-DE";
	static final String domain = "Fabfab-DE-b2c-responsive-shop";
	
	static final HashSet<String> languageSet = new HashSet<String>();
	static final HashSet<String> domainSet = new HashSet<String>();
	static final HashSet<String> textSet = new HashSet<String>();
	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, XPathExpressionException {
		ZipReader zr = null;
		String fileName = "C:/Softex/tempz/fabfab-stoffe.de-b2c-responsive-shop-content-201610281224.zip";
		
		try {
			zr = new ZipReader(fileName);
			System.out.println("Opening file" + fileName);
			
			zr.open();
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbf.newDocumentBuilder();
			XPath xpath = XPathFactory.newInstance().newXPath();
			InputStream in;
			while ((in = zr.readEntry()) != null) {
				if (zr.getCurrentPath().toLowerCase().endsWith(".xml")) {
					Document doc = docBuilder.parse(in);
					NodeList domainNodes = (NodeList) xpath.evaluate("(//attribute::*[contains(., '" + domain + "')])", doc, XPathConstants.NODESET);
					
					IntStream.range(0, domainNodes.getLength()).mapToObj(domainNodes::item).map(n -> n.toString()).forEach(domainSet::add);
					
					NodeList languageNodes = (NodeList) xpath.evaluate("//attribute::*[contains(., '" + language + "')]", doc, XPathConstants.NODESET);
					
					IntStream.range(0, languageNodes.getLength()).mapToObj(languageNodes::item).map(n -> n.toString()).forEach(languageSet::add);
					
					NodeList textNodes = (NodeList) xpath.evaluate("//text()[contains(., '" + domain + "')] | //text()[contains(., '" + language + "')]", doc, XPathConstants.NODESET);
					
					IntStream.range(0, textNodes.getLength()).mapToObj(textNodes::item).map(n -> n.toString()).forEach(textSet::add);
				}
				in.close();
			}
		} finally {
			try {
				zr.close();
			} catch (IOException ioe) {
				System.out.println(ioe.toString());
			}
			
		}
		System.out.println("=====lang attributes======");
		languageSet.forEach(System.out::println);
		System.out.println("=====domain attributes======");
		domainSet.forEach(System.out::println);
		System.out.println("=====text values======");
		textSet.forEach(System.out::println);
		System.out.println("===========");
	}

}
