package JavaXML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import javax.xml.xpath.*;

public class XMLTestClass {

	public static void main(String[] args) {
		
		// XML-Datei einfach so auslesen
		try {
			// DocumentBuilderFactory erzeugen
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			// DocumentBuilder erzeugen
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Parsed die XML-Datei und erzeugt ein Document-Objekt
			Document doc = builder.parse("/Users/cervisiomatisch/BA-Leipzig/Datenbanken/JavaXML/buecher.xml");

			// Wurzel des XML-Dokuments erhalten
			Element root = doc.getDocumentElement();

			// iteriere über die Elemente im XML-Dokument
			NodeList nodeList = root.getChildNodes();
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				// Test, ob es sich wirklich um ein Element handelt
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					// Daten im Element lesen
					String tagName = element.getTagName();
					String textContent = element.getTextContent();

					// Daten verarbeiten
					System.out.println("Tag: " + tagName + ", Inhalt: " + textContent);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// als Objekt auslesen

		try {
			// XML-Datei einlesen
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("/Users/cervisiomatisch/BA-Leipzig/Datenbanken/JavaXML/buecher.xml");

			// Wurzelelement der XML-Datei abrufen
			Element root = document.getDocumentElement();

			// NodeList mit den book-Elementen erstellen
			NodeList bookNodes = root.getElementsByTagName("book");

			// durch die book-Elemente iterieren und jedes in ein Book-Objekt umwandeln
			for (int i = 0; i < bookNodes.getLength(); i++) {
				Element bookElement = (Element) bookNodes.item(i);
				String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
				String author = bookElement.getElementsByTagName("author").item(0).getTextContent();
				int year = Integer.parseInt(bookElement.getElementsByTagName("year").item(0).getTextContent());
				double price = Double.parseDouble(bookElement.getElementsByTagName("price").item(0).getTextContent());

				// Book-Objekt erstellen
				Book book = new Book(title, author, year, price);

				// Book-Objekt verwenden
				System.out.println("Title: " + book.getTitle());
				System.out.println("Author: " + book.getAuthor());
				System.out.println("Year: " + book.getYear());
				System.out.println("Price: " + book.getPrice());
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// mit XPath nur einen Teil auslesen
		try {
			// XML-Datei einlesen
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("/Users/cervisiomatisch/BA-Leipzig/Datenbanken/JavaXML/buecher.xml");

			// XPath-Objekt erstellen
			XPathFactory xPathFactory = XPathFactory.newInstance();
			XPath xPath = xPathFactory.newXPath();

			// XPath-Ausdruck definieren
			String expression = "//book[year > 2000]/title";

			// XPath-Ausdruck auswerten
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);

			// durch die ausgewählten Elemente iterieren und den Textinhalt ausgeben
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// XML-Datei schreiben (mit JAXB-Implementierung)
		try {
			// Liste von Book-Objekten erstellen
			List<Book> books = new ArrayList<>();
			books.add(new Book("Wie eine verrückte Ameise die Welt verändern kann", "Arjan Postma", 2022, 22.00));
			books.add(new Book("Lustige Geschichten", "Wladimir Sutejew", 2006, 12.90));

			// JAXB-Kontext erstellen
			JAXBContext jaxbContext = JAXBContext.newInstance(BookList.class);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// BookList-Objekt mit der Liste von Büchern erstellen
			BookList aBookList = new BookList();
			
			aBookList.setBooks(books);
			// XML-Datei schreiben
			marshaller.marshal(aBookList, new File("/Users/cervisiomatisch/BA-Leipzig/Datenbanken/JavaXML/buecherliste.xml"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
