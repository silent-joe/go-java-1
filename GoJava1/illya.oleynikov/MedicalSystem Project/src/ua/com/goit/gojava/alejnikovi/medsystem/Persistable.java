package ua.com.goit.gojava.alejnikovi.medsystem;

import java.io.Serializable;

interface Persistable extends Serializable {
	
	public String markupForFile();
	public Object createObjFromFile(String string);

}
