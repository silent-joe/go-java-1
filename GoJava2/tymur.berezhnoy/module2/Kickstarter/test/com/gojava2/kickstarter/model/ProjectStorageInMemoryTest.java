package com.gojava2.kickstarter.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ProjectStorageInMemoryTest {

	private ProjectStorageInMemory storage;
	
	@Before
	public void setUp() {
		storage = new ProjectStorageInMemory();
	}

	@Test
	public void shouldCollectionSizeZero_whenNoProjects() {
		// given
		
		// when
		int expectedSize = 0;
		int actualSize = storage.getSize();
		
		// then
		assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void shouldNoProjects_whenNoProjectsWithSameCategory() {
		// given
		Category category1 = new Category("Art");
		
		Project project1 = new Project("p1", "d1", 1, 1, 1, 1, "s1", "l1");
		project1.setCategory(category1);
		
		Project project2 = new Project("p2", "d2", 1, 1, 1, 1, "s2", "l2");
		project2.setCategory(category1);
		
		storage.addProject(project1);
		storage.addProject(project2);
				
		// when
		List<Project> result = storage.getProjects(new Category("Dance"));
		int expectedSize = 0;
		
		// then
		assertEquals(expectedSize, result.size());
	}
	
	@Test
	public void shouldProjects_whenProjectsWithSameCategory() {
		// given
		Category category1 = new Category("Art");
		Category category2 = new Category("Dance");
		
		Project project1 = new Project("p1", "d1", 1, 1, 1, 1, "s1", "l1");
		project1.setCategory(category1);
		
		Project project2 = new Project("p2", "d2", 1, 1, 1, 1, "s2", "l2");
		project2.setCategory(category2);
		
		Project project3 = new Project("p3", "d3", 1, 1, 1, 1, "s3", "l3");
		project3.setCategory(category2);
		
		storage.addProject(project1);
		storage.addProject(project2);
		storage.addProject(project3);
		
		// when
		List<Project> result = storage.getProjects(category2);
		int expectedSize = 2;
		
		// then
		assertEquals(expectedSize, result.size());
		assertSame(project2, result.get(0));
		assertSame(project3, result.get(1));
	}
	
	@Test
	public void shouldCurrentProjectByIndexPlus1_whenExistsCategory() {
		// given
		Category category = new Category("Art");
		
		Project project = new Project("p", "d", 1, 1, 1, 1, "s", "l");
		
		project.setCategory(category);
		storage.addProject(project);
		
		// when
		List<Project> list = storage.getProjects(category);
		Project result = storage.getProject(category, 1);
		
		// then
		assertSame(project, result);
	}
}