import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathException;
import org.xml.sax.InputSource;

public class ChangeLocale {

private final String fromLocale;
private final String toLocale;
private final String fromDomain;
private final String ToDomain;

ChangeLocale(String fromLocale,
			 String toLocale,
			 String fromDomain,
			 String ToDomain
			){
	this.fromLocale = fromLocale;
	this.toLocale   = toLocale;
	this.fromDomain = fromDomain;
	this.ToDomain	= ToDomain;
}

public static void main(String[] args) {
	
	ChangeLocale testing = new ChangeLocale(
			"de-DE",
			"fr-FR",
			"Fabfab-DE-b2c-responsive-shop",
			"Fabfab-FR-b2c-responsive-shop");
//	Ellenõrzés hogy van e ilyen content a streamben
	
	File file = new File("D:/Tempz/test.xml");
	
	
	try {
		InputStream targetStream = new FileInputStream(file);
		testing.convert(targetStream);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}

public void convert(InputStream targetStream) {

	try {
		Document doc = DocumentBuilderFactory.newInstance()
					  .newDocumentBuilder()
					  .parse(new InputSource(targetStream));		 
		doc.getDocumentElement().normalize();
		XPath xpath = XPathFactory.newInstance().newXPath();
		NodeList nodes = (NodeList) xpath.evaluate
//					("//*[contains(@domain, 'de-DE')]",
				   ( "//*[@lang='" + fromLocale + "'"
				   + "and not (./following-sibling::*[@lang='fr-FR'])"
				   + "and not (./preceding-sibling::*[@lang='fr-FR'])]|" 
				   + "//*[@domain='" + fromDomain + "']|"
				   + "//*[@pagelet-domain='" + fromDomain +"']" ,
//				   pagelet-domain
//							+ fromDomain,
//				   + "|//*[contains(text(),'DE')]",
	//			"//*[@lang='de-DE' "
	//			   + "and not (./following-sibling::*[@lang='fr-FR']) "
	//			   + "and not (./preceding-sibling::*[@lang='fr-FR'])]"
					doc,
					XPathConstants.NODESET
					);
	
		for (int i = 0; i < nodes.getLength(); i++) {
			Node n = nodes.item(i);
//			System.out.println( n.getNodeName() + " " + n.getTextContent());
	//							   + " " + "Value= " + n.getTextContent());
	//				n.setNodeValue("FASZOMAT");
//				n.setTextContent("FASZOMAT");
				System.out.println( n.getNodeName());
//					+ " " 
//					+ n.getTextContent());
	//			switch (n.getNodeValue()) {
	//			case "de-DE":
	//				System.out.println(n.getNextSibling());
	//				System.out.println(n.getPreviousSibling());
	//				if (n.getNextSibling() == null 
	//				& n.getPreviousSibling() == null)
	//					n.setNodeValue("fr-FR");
	//				break;
	//			case "Fabfab-DE-b2c-responsive-shop":
	//				n.setNodeValue("Fabfab-FR-b2c-responsive-shop");
	//				break;
	//			default:
	//				break;
	//			}

		}
	} catch (XPathException x) {
		System.out.println(x.toString());
	} catch (NullPointerException n) {
		System.out.println(n.getMessage() + "NullPointerException");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	}

}
