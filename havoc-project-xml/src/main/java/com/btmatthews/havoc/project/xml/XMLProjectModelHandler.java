package com.btmatthews.havoc.project.xml;

import com.btmatthews.havoc.project.ProjectModelBuilder;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Stack;

/**
 * Created by bmatthews68 on 21/12/2013.
 */
public class XMLProjectModelHandler extends DefaultHandler {

    private final ProjectModelBuilder builder;

    private final Stack<String> elements = new Stack<String>();

    public XMLProjectModelHandler(final ProjectModelBuilder builder) {
        this.builder = builder;
    }

    @Override
    public void startElement(final String uri,
                             final String localName,
                             final String qName,
                             final Attributes attributes)
            throws SAXException {
        elements.push(localName);
    }

    @Override
    public void endElement(final String uri,
                           final String localName,
                           final String qName)
            throws SAXException {
        elements.pop();
    }

    @Override
    public void characters(final char ch[],
                           final int start,
                           final int length)
            throws SAXException {
        if (elements.size() == 2) {
            final String currentElement = elements.peek();
            if ("groupId".equals(currentElement)) {
                builder.setGroupId(new String(ch, start, length));
            } else if ("artifactId".equals(currentElement)) {
                builder.setArtifactId(new String(ch, start, length));
            } else if ("version".equals(currentElement)) {
                builder.setVersion(new String(ch, start, length));
            } else if ("type".equals(currentElement)) {
                builder.setType(new String(ch, start, length));
            }
        }
    }
}