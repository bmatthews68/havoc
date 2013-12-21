package com.btmatthews.havoc.project.xml;

import com.btmatthews.havoc.project.ProjectModel;
import com.btmatthews.havoc.project.ProjectModelBuilder;
import com.btmatthews.havoc.project.ProjectModelBuilderFactory;
import com.btmatthews.havoc.project.ProjectModelCompiler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by bmatthews68 on 21/12/2013.
 */
public class XMLProjectModelCompiler implements ProjectModelCompiler {

    private ProjectModelBuilderFactory projectModelBuilderFactory;

    public void setProjectModelBuilderFactory(final ProjectModelBuilderFactory projectModelBuilderFactory) {
        this.projectModelBuilderFactory = projectModelBuilderFactory;
    }

    @Override
    public ProjectModel compileProjectModel(final InputStream inputStream) {
        try {
            final ProjectModelBuilder projectModelBuilder = projectModelBuilderFactory.createBuilder();
            final DefaultHandler handler = new XMLProjectModelHandler(projectModelBuilder);
            final SAXParserFactory factory = SAXParserFactory.newInstance();
            final SAXParser parser = factory.newSAXParser();
            parser.parse(inputStream, handler);
            return projectModelBuilder.build();
        } catch (final ParserConfigurationException e) {
        } catch (final SAXException e) {
        } catch (final IOException e) {
        }
        return null;
    }
}
