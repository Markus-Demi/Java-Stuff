package by.itacademy.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class XmlCreator {
    public void create(Map<String, ArrayList<String>> catalog) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

            Element file = document.createElement("files");
            document.appendChild(file);

            int count = 0;

            for (String extName : catalog.keySet()) {
                Element ext = document.createElement("ext_" + count);
                ext.setAttribute("ext", extName);

                StringBuilder stringBuilder = new StringBuilder();

                for (String fileName : catalog.get(extName)) {
                    stringBuilder.append(fileName + ",\n\t\t");
                }

                ext.setTextContent(stringBuilder.toString());
                file.appendChild(ext);
                count++;
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(System.getProperty("user.dir")
                    + File.separator + "result.xml"));
            transformer.transform(source, result);

            System.out.println("Saved");
        } catch (ParserConfigurationException | TransformerConfigurationException ex) {
            ex.toString();
        } catch (TransformerException ex) {
            ex.toString();
        }
    }
}
