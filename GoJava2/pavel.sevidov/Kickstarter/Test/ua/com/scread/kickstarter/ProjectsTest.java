package ua.com.scread.kickstarter;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import ua.com.scread.kickstarter.Category;
import ua.com.scread.kickstarter.Details;
import ua.com.scread.kickstarter.FAQ;
import ua.com.scread.kickstarter.Project;
import ua.com.scread.kickstarter.Projects;


public class ProjectsTest {
	FAQ faq = new FAQ("question", "answer");
	Details details = new Details("History", "video", faq);
	Project project = new Project("Project", "Description", 1, 1, details);
	Projects projects = new Projects();
	
	@Test
	public void shouldAddProject_whenAddedProject() {
		projects.add(project);
		assertEquals(project, projects.getProjects().get(0));
	}
	
	@Test
	public void sholudReturnEmpty_whenEmptyProjects() {
		assertEquals(new ArrayList<Category>(), projects.getProjects());
	}
	
	@Test
	public void shouldBeProject_whenGetProjectByCategory() {
		Category category = new Category("Vasya");
		project.setCategory(category);
		ArrayList<Project> expected = new ArrayList<Project>();
		expected.add(project);
		projects.add(project);
		assertEquals(expected, projects.getProjects(category));
	}

}