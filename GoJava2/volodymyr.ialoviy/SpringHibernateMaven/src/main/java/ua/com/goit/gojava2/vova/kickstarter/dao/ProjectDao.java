package ua.com.goit.gojava2.vova.kickstarter.dao;

import java.util.List;

import ua.com.goit.gojava2.vova.kickstarter.model.Project;

public interface ProjectDao {

	List<Project> findAllProjects(Integer idCategory);

	void saveProject(Project project);

	void deleteProjectById(Integer idProject);

	Project getProgect(Integer idProject);

	void addDonate(Integer amount, Integer idProject);

}
