package ua.com.goit.gojava2.vova.kickstarter.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import ua.com.goit.gojava2.vova.kickstarter.model.CategoriesDAO;
import ua.com.goit.gojava2.vova.kickstarter.model.ProjectsDAO;

@Controller
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private CategoriesDAO categoriesDAO;
	
	@Autowired
	private ProjectsDAO projectsDAO;

	private Map<String, Action> actions = new HashMap<String, Action>();
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
		CategoriesAction categoriesAction = new CategoriesAction(categoriesDAO);
		actions.put("/", categoriesAction);
		actions.put("/categories", new CategoriesAction(categoriesDAO));
		actions.put("/projects", new ProjectsAction(projectsDAO));
		actions.put("/project", new projectAction(projectsDAO));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		Action action = actions.get(getActionString(req));
		if (action == null){
			throw new IllegalStateException("action null");
		}
		String jsp = action.doIt(req, resp);
		req.getRequestDispatcher(jsp).forward(req, resp);
	}

	private String getActionString(HttpServletRequest req) {
		String requestURI = req.getRequestURI();
		return requestURI.substring(req.getContextPath().length(), requestURI.length());
	}
}