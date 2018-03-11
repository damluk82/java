package de.softex.ish.dbmigrate.util.kovi;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathException;
import org.xml.sax.InputSource;


public class ChangeLocale {

private final String fromLocale;
private final String toLocale;
private final String fromDomain;
private final String toDomain;
private byte[] outputArray;

ChangeLocale(String fromLocale,
			 String toLocale,
			 String fromDomain,
			 String toDomain
			){
	this.fromLocale = fromLocale;
	this.toLocale   = toLocale;
	this.fromDomain = fromDomain;
	this.toDomain	= toDomain;
}

//public static void main(String[] args) {
//	
//	ChangeLocale testing = new ChangeLocale(
//			"de-DE",
//			"fr-FR",
//			"Fabfab-DE-b2c-responsive-shop",
//			"Fabfab-FR-b2c-responsive-shop");
//	
//	File file = new File("D:/Tempz/test.xml");
//	
//	try {
//		InputStream targetStream = new FileInputStream(file);
//		
//		testing.convert(targetStream);
//		
//		} catch (FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception ex){
//			System.out.println(ex.getMessage());
//		}
//	}

public byte[] convert(InputStream targetStream) {

		try {
			Document doc = DocumentBuilderFactory.newInstance()
						  .newDocumentBuilder()
						  .parse(new InputSource(targetStream));		 
			doc.getDocumentElement().normalize();
			XPath xpath = XPathFactory.newInstance().newXPath();
			NodeList nodes = (NodeList) xpath.evaluate(
					   ( "//*[@lang='" + fromLocale + "'"
					   + "and not (./following-sibling::*[@lang='fr-FR'])"
					   + "and not (./preceding-sibling::*[@lang='fr-FR'])]|" 
					   + "//*[@domain='" + fromDomain + "']|"
					   + "//*[@pagelet-domain='" + fromDomain +"']|" 
					   + "//*[contains(text(),'Fabfab-DE-b2c-responsive-shop')]"
					   ),
						doc,
						XPathConstants.NODESET
						);

			for (int i = 0; i < nodes.getLength(); i++) {
				Node n = nodes.item(i);
				Element e = (Element)n;
				System.out.println(e.getNodeName()
								 + " "
								 + e.getNodeValue()
								 + " "
								 + "textcontent: " + e.getTextContent()
								 + " "
								 + "\n attr lang: " 
								 + e.getAttribute("xml:lang") 
								 + "\n attr domain: " 
								 + e.getAttribute("domain")
								 + "\n attr pdomain " 
								 + e.getAttribute("pagelet-domain"));
				
				if (e.getAttribute("xml:lang").equals(fromLocale)) {
						System.out.println(fromLocale 
											+ " -> " 
											+ toLocale);
						e.setAttribute("xml:lang", toLocale);
						if (e.getTextContent()
								.contains("Fabfab-DE-b2c-responsive-shop")){
								checkText(e);
								System.out.println("New 'lang' attr: " 
													+ toLocale 
													+ " and the new text: "
													+ toDomain
													);
						} else {
								System.out.println("New 'lang' attr:" 
													+ toDomain );
						}
				} 		
				else if 
						(e.getAttribute("domain").equals(fromDomain)) {
						System.out.println("domain: " 
											+ fromDomain 
											+ " -> " 
											+ toDomain);
						e.setAttribute("domain", toDomain);
						if (e.getTextContent()
								.contains("Fabfab-DE-b2c-responsive-shop")){
								checkText(e);
								System.out.println("New 'domain' attr: " 
													+ toDomain 
													+ " and the new text: "
													+ toDomain
													);
						} else {
								System.out.println("New 'domain' attr: " 
													+ toDomain );
						}
				}
				else if 
						(e.getAttribute("pagelet-domain").equals(fromDomain)) {
						System.out.println("pagelet-domain: " 
											+ fromDomain 
											+ " -> " 
											+ toDomain);
						e.setAttribute("pagelet-domain", toDomain);
						if (e.getTextContent()
								.contains("Fabfab-DE-b2c-responsive-shop")){
								checkText(e);
								System.out.println("New 'pagelet-domain' attr: " 
													+ toDomain 
													+ " and the new text: "
													+ toDomain
													);
						} else {
								System.out.println("New 'pagelet-domain' attr: " 
													+ toDomain );
						}
				}
				else if 
						(e.getTextContent().contains(fromDomain)) {
						checkText(e);
				}
				Transformer xformer = TransformerFactory
									.newInstance()
									.newTransformer();
				ByteArrayOutputStream outputStream 
									= new ByteArrayOutputStream();
				StreamResult outputTarget = new StreamResult(outputStream);
				DOMSource source = new DOMSource(doc);
				xformer.transform(source, outputTarget);
				outputArray = outputStream.toByteArray();
			}
		} catch (XPathException x) {
			System.out.println(x.toString());
		} catch (NullPointerException n) {
			System.out.println(n.getMessage() + "NullPointerException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return outputArray;
}

public void checkText(Element element){
	
		String[] domainString = new String[2];
		String fullString = element.getTextContent();
		
		try {
			domainString = element.getTextContent().split(":");
		} catch (IndexOutOfBoundsException iob) {
			System.out.println(iob.getMessage());
		}
		for (String domainElementen: domainString){
			System.out.println("Domainpart: " + domainElementen);
		}
		fullString = fullString.replace(fromDomain, toDomain);
		element.setTextContent(fullString);
		System.out.println("The new full domain is: "
							+ element.getTextContent());

}
}

