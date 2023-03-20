package lr10.Example1;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchBook {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr10/Example1/example.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);
            document.getDocumentElement().normalize();

            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            List<String> search = getYear(document, xpath);
            System.out.println(search);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> getYear(Document doc, XPath xpath)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год написания книги:");
        String year = in.nextLine();
        List<String> list = new ArrayList<>();
        try {
            XPathExpression xPathExpression = xpath.compile("/library/book[year='"+year+"']/title/text()");
            NodeList nodes = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
