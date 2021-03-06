package test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLDemo {
	public static void main(String[] args) {

		test();
	}

	public static void test() {
		try {
			DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = domFactory.newDocumentBuilder();
			Document doc = builder.parse("D:\\Niket\\learnings\\Core-Java\\test\\text.xml");
			NodeList nodes = doc.getElementsByTagName("processes");
			Element element = (Element) nodes.item(0);
			NodeList movieList = element.getElementsByTagName("commandParameters");
			for (int i = 0; i < movieList.getLength(); i++) {
				Element movieElement = (Element) movieList.item(i);
				System.out.println("name = " + movieElement.getAttributes().getNamedItem("name").getNodeValue());
				System.out.println(
						"description = " + movieElement.getAttributes().getNamedItem("description").getNodeValue());
				System.out.println("value = " + movieElement.getAttributes().getNamedItem("value").getNodeValue());
				System.out
						.println("required = " + movieElement.getAttributes().getNamedItem("required").getNodeValue());
				System.out.println(
						"defaultValue = " + movieElement.getAttributes().getNamedItem("defaultValue").getNodeValue());
				System.out.println(
						"switchName = " + movieElement.getAttributes().getNamedItem("switchName").getNodeValue());
				System.out
						.println("dataType = " + movieElement.getAttributes().getNamedItem("dataType").getNodeValue());
				System.out.println("regExp = " + movieElement.getAttributes().getNamedItem("regExp").getNodeValue());
			}

		} catch (Exception e) {
			
		}
	}
}
