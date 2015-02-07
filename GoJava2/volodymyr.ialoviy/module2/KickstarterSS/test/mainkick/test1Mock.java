package mainkick;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.FileNotFoundException;

import org.junit.Test;

public class test1Mock {
	
	@Test
    public void simpleMocking2() throws FileNotFoundException{
		Category category = mock(Category.class);
		Project project = new Project();
		Projects projects = new Projects();
		Categories categories = new Categories();
		category.showAllProjectInCategory(2, project, projects, categories);
		verify(category).showAllProjectInCategory(2, project, projects, categories);
	}
}
