package ua.com.goit.gojava2.vova.kickstarter;

import static org.junit.Assert.*;

import java.sql.Statement;
import java.util.Arrays;

import org.junit.Test;

import ua.com.goit.gojava2.vova.kickstarter.model.Categories;
import ua.com.goit.gojava2.vova.kickstarter.model.CategoriesFromDB;
import ua.com.goit.gojava2.vova.kickstarter.model.Projects;
import ua.com.goit.gojava2.vova.kickstarter.model.ProjectsFromFile;
import ua.com.goit.gojava2.vova.kickstarter.model.ReaderDB;

public class TestCategoriesClass {
	Statement statement;// TODO
	Categories categories = new CategoriesFromDB(statement);
	{
		categories.writeAllCatecories();
		categories.getKickCategories();
		categories.projectsThatAreContainedInTheCategory(0);
		categories.showCatecoryName(0);
	}
	
	@Test
    public void shouldAllCatecories_whenNotAllCatecories(){
		String s = categories.setCatecories();
		assertTrue(s.equals("1 name1\n2 name2\n3 name3"));
    }
	
	@Test
    public void shouldKickContainCategory_whenNotKickContainCategory(){
		int[] i = categories.getKickCategories();
		int[] j = {1, 2, 3};
		assertTrue(Arrays.equals(i, j));
    }
	
	@Test
    public void shouldProjectsContain_whenProjectsContain(){
		int[] i = categories.projectsThatAreContainedInTheCategory(0);
		int[] j = {1, 3, 4};
		assertEquals(i, j);
    }
	
	@Test
    public void shouldFirstCatecoryName_whenNotFirstCatecoryName(){
		String s = categories.showCatecoryName(1);
		assertTrue(s.equals("name1"));
    }
	
	@Test
    public void shouldAllProjectInCategory_whenNotAllProjectInCategory(){
		Projects projects = new ProjectsFromFile();
		projects.writeAllProjects();
		String s = categories.showAllProjectInCategory(1, projects);
		assertEquals(s, "1, name1, short description1, 1000, 10\n"
				+ "3, name3, short description3, 1000, 10\n"
				+ "4, name4, short description4, 1000, 10");
    }
	
	@Test//(expected = FileNotFoundException.class)
    public void shouldFileNotFoundException_whenNotFileNotFoundException(){
		ReaderDB reader = new ReaderDB();
		reader.read("Categories.properties");
    }
}