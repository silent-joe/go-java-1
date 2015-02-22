package ua.com.goit.gojava.andriidnikitin.service.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import ua.com.goit.gojava.andriidnikitin.model.GoodType;
import ua.com.goit.gojava.andriidnikitin.service.GoodCatalogImpl;


public class ListPrinterTest {
	
	
	@Test
	public void getGoodTypesFromRootTest() {
		Object o = GoodCatalogImpl.getInstance().getGoodTypesFromRoot();
		@SuppressWarnings("unchecked")
		List<GoodType> list = (List<GoodType>) o;
		try{
			for (GoodType type: list) {
				System.out.print(type.getName());
			}
		} catch (Exception e) {
			fail();
		}
		
	}

}