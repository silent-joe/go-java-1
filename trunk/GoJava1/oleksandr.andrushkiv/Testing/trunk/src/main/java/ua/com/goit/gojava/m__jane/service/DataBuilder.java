package ua.com.goit.gojava.m__jane.service;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import ua.com.goit.gojava.m__jane.model.DataLoader;


public class DataBuilder {

	private static DataBuilder instance;
	private static DataLoader dataLoader;
	private static final File FILE = new File("src/main/resources/DataFile2.xml");
	
	private DataBuilder() {
	}

	public static synchronized DataBuilder getInstance() throws JAXBException {
		if (instance == null) {
			instance = new DataBuilder();
			JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] {DataLoader.class});
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			dataLoader = (DataLoader) jaxbUnmarshaller.unmarshal(FILE);			
		}
		return instance;
	}

	public DataLoader getDataLoader() {
		return dataLoader;
	}
		
}
