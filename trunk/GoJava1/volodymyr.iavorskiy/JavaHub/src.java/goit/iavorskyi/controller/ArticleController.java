package goit.iavorskyi.controller;

import goit.iavorskyi.learningUnit.Article;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ArticleController")
public class ArticleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ArticleController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Article article = new Article();
			article.setAuthor(request.getParameter("author"));
			article.setHeader(request.getParameter("header"));
			article.setText(request.getParameter("text"));
			article.save();
			response.setContentType("text/html;charset=UTF-8");
			response.sendRedirect("/JavaHub/articles.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.setContentType("text/html;charset=UTF-8");
			response.sendRedirect("");
		}

	}

}
