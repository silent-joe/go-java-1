package ua.com.goit.gojava2.vova.kickstarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.com.goit.gojava2.vova.kickstarter.dao.ProjectDao;
import ua.com.goit.gojava2.vova.kickstarter.model.Project;

@Service("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDao dao;
	
	@Override
	public List<Project> findAllProjects(Integer idCategory) {
		return dao.findAllProjects(idCategory);
	}

	@Override
	public void saveProject(Project project) {
		dao.saveProject(project);
	}

	@Override
	public void deleteProjectById(Integer idProject) {
		dao.deleteProjectById(idProject);
	}

	@Override
	public Project getProgect(Integer idProject) {
		return dao.getProgect(idProject);
	}

	@Override
	public void addDonate(Integer amount, Integer idProject) {
		dao.addDonate(amount, idProject);		
	}

}
