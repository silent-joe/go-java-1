package ua.com.goit.gojava2.vova.kickstarter.service;

import java.util.List;

import ua.com.goit.gojava2.vova.kickstarter.model.Project;

public interface ProjectService {

	List<Project> findAllProjects(Integer idCategory);
	
	void saveProject(Project Project);
	
	void deleteProjectById(Integer idProject);

	Project getProgect(Integer idProject);

	void addDonate(Integer amount, Integer idProject);

}
