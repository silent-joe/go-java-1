package ua.com.goit.gojava.andriidnikitin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.com.goit.gojava.andriidnikitin.model.Good;
import ua.com.goit.gojava.andriidnikitin.model.GoodType;
import ua.com.goit.gojava.andriidnikitin.service.GoodCatalog;
import ua.com.goit.gojava.andriidnikitin.service.GoodCatalogImpl;

public class CategoryPrinter extends HttpServlet {
	
    private static final long serialVersionUID = 1L;
    public CategoryPrinter() {
    	
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out = response.getWriter();   
    	ServletUtil.printCatalog(null, out, GoodCatalogImpl.getInstance(), request.getContextPath());
     }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	PrintWriter out = response.getWriter();   
    	Enumeration<String> paramNames = request.getParameterNames(); 
    	if (paramNames.hasMoreElements()){    		
    		Integer id = Integer.parseInt(paramNames.nextElement());
    		GoodCatalog catalog = GoodCatalogImpl.getInstance();
    	   	List<GoodType> list = catalog.getGoodTypesFromRoot();
    	   	GoodType calledType = null;
    	   	for (GoodType type: list) {
    	   		if (id.equals(type.getId())) {
    	   			calledType = type;
    	   		}
    	   	}
    	   	ServletUtil.printCatalog(calledType, out, catalog,request.getContextPath());	
    	}
    	   	
    } 
}