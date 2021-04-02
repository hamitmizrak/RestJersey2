package com.hamitmizrak.xmlp;

import java.io.StringWriter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

@Path("/xmlp")
public class XmlP {

	@GET
	@Produces("application/xml; charset=UTF-8")
	@Path("/xmlMethod")
	public String getXmlP() {

		Document document = getDocument();

		Element element0 = document.createElement("student");
		document.appendChild(element0);

		Element element = document.createElement("studentAdi");
		element.setTextContent("Hamit");
		element0.appendChild(element);

		Element element2 = document.createElement("studentSoyadi");
		element2.setTextContent("Mizrak");
		element0.appendChild(element2);

		return getTransformer(document);
	}

	// XML toString
	public String getTransformer(Document document) {

		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			StringWriter stringWriter = new StringWriter();
			transformer.transform(new DOMSource(document), new StreamResult(stringWriter));
			return stringWriter.toString();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return null;
	}

	// XML DOM oluşturma
	public Document getDocument() {
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			return document;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
