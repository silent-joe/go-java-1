package com.kickstarter.model;

public class InMemoryProjectsTest extends ProjectsTest {

	@Override
	Projects getProjects() {
		return new InMemoryProjects();
	}

}
