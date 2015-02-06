package ua.com.goit.gojava.kickstarter;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CategoriesTest {

	@Test 
	public void shouldCalegoriesList_whenAddCategories() {
		// given
		Categories list = new Categories();
		list.add(new Category("name1"));
		list.add(new Category("name2"));
		
		// when 
		String[] categories = list.getCategories();
		
		// then
		assertEquals("[1 - name1, 2 - name2]", 
				Arrays.toString(categories));
	}
	
	@Test 
	public void shouldCalegoriesList_whenNoCategories() {
		// given
		Categories list = new Categories();
		
		// when 
		String[] categories = list.getCategories();
		
		// then
		assertEquals("[]", 
				Arrays.toString(categories));
	}
	
	@Test 
	public void shouldGetCategoryByIndex() {
		// given
		Categories list = new Categories();
		
		Category category1 = new Category("name1");
		list.add(category1);
		
		Category category2 = new Category("name2");
		list.add(category2);
		
		// when then
		assertSame(category1, list.get(0));
		assertSame(category2, list.get(1));
	}
	
	@Test 
	public void shouldGetCalegoriesListSize_whenAddCategories() {
		// given
		Categories list = new Categories();
		assertEquals(0, list.size());
		
		// when 
		list.add(new Category("name1"));
		list.add(new Category("name2"));
		
		// then
		assertEquals(2, list.size());
	}
}