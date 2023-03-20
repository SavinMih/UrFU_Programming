package lr10.Example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppendBook {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название книги:");
            String title = in.nextLine();
            System.out.println("Введите автора книги:");
            String author = in.nextLine();
            System.out.println("Введите год написания кникги");
            String year = in.nextLine();

            File inputFile = new File("src/lr10/Example1/example.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element book1 = document.createElement("book");
            document.getDocumentElement().appendChild(book1);

            Element title1 = document.createElement("title");
            title1.appendChild((document.createTextNode(title)));
            book1.appendChild(title1);

            Element author1 = document.createElement("author");
            author1.appendChild(document.createTextNode(author));
            book1.appendChild(author1);

            Element year1 = document.createElement("year");
            year1.appendChild(document.createTextNode(year));
            book1.appendChild(year1);

            document.setXmlStandalone(true);
            document.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileOutputStream("src/lr10/Example1/example.xml"));
            transformer.transform(source, result);
            System.out.println("Книга добавлена!");
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
