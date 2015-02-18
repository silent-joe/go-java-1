package ua.com.goit.gojava.andriidnikitin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.com.goit.gojava.andriidnikitin.model.Good;
import ua.com.goit.gojava.andriidnikitin.model.GoodType;
import ua.com.goit.gojava.andriidnikitin.service.GoodCatalogImpl;

public class GoodPrinter extends HttpServlet {
	
    private static final long serialVersionUID = 1L;
    public GoodPrinter() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	//PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
    	ServletContext context = request.getServletContext();
    	ArrayList<String> urls = new ArrayList<String>();
    	for (int i=0; i<10; i++) {
    		urls.add(new Integer(i).toString());
    	}
        context.setAttribute("urls", urls);
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        String view = "mainlist";
        request.setAttribute("view", view);
        rd.forward(request, response);
    	/*out.println("<table>");
    	out.println("<ul>");
	   	GoodCatalogImpl catalog = GoodCatalogImpl.getInstance();
	   	List<GoodType> list = catalog.getGoodTypesFromRoot();
	   	String name = response.getContentType();
	   	GoodType category = null;
	   	for (GoodType type:list) {
	   		if (name == type.getName()) {
	   			category = type;
	   			break;
	   		}
	   	}
	   	if (category!=null){
	   		List<Good> goods = catalog.getGoodsInType(category);
	   		for (Good good: goods) { //TODO: redo - returns XML with data; JS builds table  	
		   		out.println("<li>" + good.getName() + "</li>\n");
	   		}
	   	}
	   	out.println("</ul>\n" + "</table>\n"); */	
     }
    
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	/*PrintWriter out = response.getWriter();
    	//Map<String, String[]> map = request.get;
    	//for (Entry<String, String[]> entry: map){
    	//	out.println();
    	//}
    	out.println("here comes the goods list");*/
    }
 }