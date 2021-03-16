package Avaliacao1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException, XPathExpressionException, ParserConfigurationException, SAXException {
        showOptions();
    }

    private static void showOptions() throws IOException, XPathExpressionException, ParserConfigurationException, SAXException {
        System.out.print("1. Pesquisar por texto\n2. Pesquisar por número e texto\n3. Listar todos os cursos\n4. Sair\n");
        System.out.println("Digite um número:");

        switch (getInput()) {
            case "1":
                searchByText();
                showOptions();
                break;
            case "2":
                searchByTextAndNumber();
                showOptions();
                break;
            case "3":
                listAllData();
                showOptions();
                break;
            case "4":
                System.out.println("Terminando aplicação");
                break;
            default:
                System.out.println("Opção inexistente");
                showOptions();
                break;
        }
    }

    private static String getInput() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = reader.readLine();
        return input;
    }

    private static void searchByText() throws IOException, XPathExpressionException, ParserConfigurationException, SAXException {
        String name = "";
        System.out.println("Digite o nome da faculdade: ");
        name = getInput().toUpperCase(Locale.ROOT);
        Document doc = getFile();

        String filter = "/universidade/curso[contains(nome, '" + name + "')]";

        XPath path = XPathFactory.newInstance().newXPath();
        XPathExpression expression = path.compile(filter);

        NodeList list = (NodeList) expression.evaluate(doc, XPathConstants.NODESET);

        if (list.getLength() > 0) {
            for (int i = 0; i < list.getLength(); i++) {
                Element university = (Element) list.item(i);
                printUniversityData(university);
            }
        } else {
            System.out.println("Resultado não encontrado.");
        }
    }

    private static void searchByTextAndNumber() throws IOException, XPathExpressionException, ParserConfigurationException, SAXException {
        String name;
        System.out.println("Digite o nome da faculdade: ");
        name = getInput().toUpperCase(Locale.ROOT);

        Integer ch;
        System.out.println("Digite carga horária mínima: ");
        ch = Integer.parseInt(getInput().toUpperCase(Locale.ROOT));
        Document doc = getFile();

        String filter = "/universidade/curso[contains(nome, '" + name + "') and ch>='" + ch + "']";

        XPath path = XPathFactory.newInstance().newXPath();
        XPathExpression expression = path.compile(filter);

        NodeList list = (NodeList) expression.evaluate(doc, XPathConstants.NODESET);

        if (list.getLength() > 0) {
            for (int i = 0; i < list.getLength(); i++) {
                Element university = (Element) list.item(i);
                printUniversityData(university);
            }
        } else {
            System.out.println("Resultado não encontrado.");
        }
    }

    private static void listAllData() throws IOException, SAXException, ParserConfigurationException, XPathExpressionException {
        Document doc = getFile();
        String filter = "/universidade/curso";

        XPath path = XPathFactory.newInstance().newXPath();
        XPathExpression expression = path.compile(filter);
        NodeList list = (NodeList) expression.evaluate(doc, XPathConstants.NODESET);
        for (int i = 0; i < list.getLength(); i++) {
            Element university = (Element) list.item(i);
            printUniversityData(university);
        }
    }

    private static Document getFile() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory fabric = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = fabric.newDocumentBuilder();
        Document document = db.parse("src/Avaliacao1/dados.xml");

        return document;
    }

    private static void printUniversityData(Element data) {
        String name = data.getElementsByTagName("nome").item(0).getTextContent();
        String discipline = data.getElementsByTagName("disciplina").item(0).getTextContent();
        int year = Integer.parseInt(data.getElementsByTagName("ano").item(0).getTextContent());
        int ch = Integer.parseInt(data.getElementsByTagName("ch").item(0).getTextContent());

        System.out.println("===============================");
        System.out.println("Faculdade: " + name);
        System.out.println("Disciplina: " + discipline);
        System.out.println("Ano: " + year);
        System.out.println("Carga horária: " + ch);
        System.out.println("===============================");
        System.out.println("");
    }
}
