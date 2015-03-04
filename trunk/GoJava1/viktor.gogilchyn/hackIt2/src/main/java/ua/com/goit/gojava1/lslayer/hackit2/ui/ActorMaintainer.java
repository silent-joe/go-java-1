package ua.com.goit.gojava1.lslayer.hackit2.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.com.goit.gojava1.lslayer.hackit2.actor.ActorFactory;
import ua.com.goit.gojava1.lslayer.hackit2.dao.ActorJDBCDAO;
import ua.com.goit.gojava1.lslayer.hackit2.exception.HackitIOException;

/**
 * Servlet implementation class ActorMaintainer
 */
public class ActorMaintainer extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActorMaintainer() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        ActorJDBCDAO dao = new ActorJDBCDAO();
        String idParameter = request.getParameter("view_id");
        if (idParameter != null) {
            try {
                long detailsId = Long.parseLong(idParameter);
                request.setAttribute("details", dao.load(detailsId));
            } catch (NumberFormatException e) {
                request.setAttribute("error", "Id should be number");
            } catch (HackitIOException e) {
                request.setAttribute("error", e.getMessage());
            }
            request.getRequestDispatcher("details.jsp").forward(request, response);
        } else {
            try {
                request.setAttribute("gamers", dao.loadAll());
            } catch (HackitIOException e) {
                request.setAttribute("error", e.getMessage());
            }
            request.getRequestDispatcher("view.jsp").forward(request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String deleteParameter = request.getParameter("delete");
        String createParameter = request.getParameter("create");
        String idParameter = request.getParameter("delete_id");
        long id = -1;
        if (idParameter != null) {
            try {
                id = Long.parseLong(idParameter);
            } catch (NumberFormatException e) {
                request.setAttribute("error", e.getMessage());
            }
        }
        ActorJDBCDAO dao = new ActorJDBCDAO();
        if (deleteParameter != null && deleteParameter.equals("yes") && id > 0)
            try {
                dao.delete(id);
            } catch (HackitIOException e) {
                request.setAttribute("error", e.getMessage());
            }
        if (createParameter != null && createParameter.equals("yes")) {
            String skills[] = null;
            ActorFactory actorFactory = new ActorFactory();
            String name = null;
            name = request.getParameter("name");
            actorFactory.setActorName(name);
            if (request.getParameter("skills") != null) {
                skills = request.getParameter("skills").split(";");
            }
            actorFactory.addSkillsArray(skills);
            try {
                dao.save(actorFactory.createActor());
            } catch (Exception e) {
                request.setAttribute("error", e.getMessage());
            }
        }
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        this.doGet(request, response);
        // request.getRequestDispatcher("actors").forward(request, response);
    }
}
