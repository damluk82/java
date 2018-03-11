package de.softex.test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestDom {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbf.newDocumentBuilder();
			//Document doc = docBuilder.parse("C:\\Softex\\tempz\\ize-e.xml");
			Document doc = docBuilder.parse("C:\\Softex\\tempz\\cmp_20160912_155808.xml");
			
			XPath xpath = XPathFactory.newInstance().newXPath();
			
			NodeList languageNodes = (NodeList) xpath.evaluate("//*[@lang='de-DE' and not(./following-sibling::*[@lang='fr-FR']) and not(./preceding-sibling::*[@lang='fr-FR'])]", doc, XPathConstants.NODESET);
			NodeList domainNodes = (NodeList) xpath.evaluate("//*[@domain='Fabfab-DE-b2c-responsive-shop']", doc, XPathConstants.NODESET);
			NodeList domainText = (NodeList) xpath.evaluate("//*[text()[contains(., 'Fabfab-DE-b2c-responsive-shop')]]", doc, XPathConstants.NODESET);
			NodeList textNodes = (NodeList) xpath.evaluate("//*/text()[contains(., 'Fabfab-DE-b2c-responsive-shop')]", doc, XPathConstants.NODESET);
			
			for (int i = 0; i < languageNodes.getLength(); i++) {
				Node n = languageNodes.item(i);
				if (n instanceof Element) {
					Element el = (Element) n;
					System.out.println(el.getAttribute("xml:lang"));
				}
			}
			
			System.out.println("Lang DE: " + languageNodes.getLength());
			System.out.println("Domain DE: " + domainNodes.getLength());
			System.out.println("DomainText DE: " + domainText.getLength());
			System.out.println("Textnodes: " + textNodes.getLength());
			
//			IntStream.range(0, nodes.getLength())
//				.mapToObj(nodes::item)
//				.map(n -> ((Element)n).getTagName())
//				.forEach(System.out::println);
			
//			
//			
//			System.out.println(nodes.getLength());
//			Node nd = null;
//			for (int i = 0; (nd = nodes.item(i)) != null; i++) {
//				Element el = (Element) nd;
//				System.out.println(el.getTagName());
//			}
	}

}
