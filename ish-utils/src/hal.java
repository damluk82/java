
import java.io.File;
import java.io.FileInputStream;
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

public class hal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:/Tempz/test.xml");

		try {

			InputStream targetStream = new FileInputStream(file);
			Document doc = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.parse(new InputSource(targetStream));

			doc.getDocumentElement().normalize();

			XPath xpath = XPathFactory.newInstance().newXPath();
			NodeList nodes = (NodeList) xpath.evaluate
//					("//*[contains(@domain,'DE')]",
					 ("//*[contains(text(),'DE')]",
//				"//*[@lang='de-DE' "
//				   + "and not (./following-sibling::*[@lang='fr-FR']) "
//				   + "and not (./preceding-sibling::*[@lang='fr-FR'])]"

					doc,
					XPathConstants.NODESET
					);
			// NodeList nList = doc.getElementsByTagName("*");
			Node n = null;
//			System.out.println(nodes.getLength());
			for (int i = 0; i < nodes.getLength(); i++) {
				// System.out.println("" + nodes.item(i).getTextContent());
				n = nodes.item(i);

				System.out.println( n.getNodeName() + " " + n.getTextContent());
//								   + " " + "Value= " + n.getTextContent());
//					n.setNodeValue("FASZOMAT");
					n.setTextContent("FASZOMAT");
					System.out.println( n.getNodeName() 
					+ " " 
					+ n.getTextContent());
//				switch (n.getNodeValue()) {
//				case "de-DE":
//					System.out.println(n.getNextSibling());
//					System.out.println(n.getPreviousSibling());
//					if (n.getNextSibling() == null 
//					& n.getPreviousSibling() == null)
//						n.setNodeValue("fr-FR");
//					break;
//				case "Fabfab-DE-b2c-responsive-shop":
//					n.setNodeValue("Fabfab-FR-b2c-responsive-shop");
//					break;
//				default:
//					break;
//				}

			}
		} catch (XPathException x) {
			System.out.println(x.toString() + "XPathException");
		} catch (NullPointerException n) {
			System.out.println(n.getMessage() + "NullPointerException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
