package ua.com.goit.gojava.POM.presentation;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.com.goit.gojava.POM.dataModel.POMDataModelException;
import ua.com.goit.gojava.POM.dataModel.cash.BankAccount;
import ua.com.goit.gojava.POM.dataModel.cash.CashMovementEntry;
import ua.com.goit.gojava.POM.dataModel.cash.CashMovementStatement;
import ua.com.goit.gojava.POM.dataModel.common.Money;
import ua.com.goit.gojava.POM.persistence.fileDB.DAOFactory;
import ua.com.goit.gojava.POM.persistence.fileDB.DataManager;
import ua.com.goit.gojava.POM.persistence.fileDB.GenericDAO;
import ua.com.goit.gojava.POM.persistence.fileDB.LazyDataManager;

@WebServlet(urlPatterns = {"/CashMovementWebController"})
public class WebControllerCashMovement extends HttpServlet {

	private static final long serialVersionUID = 4965130230495295419L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		CashMovementStatement statement = (CashMovementStatement) req.getSession().getAttribute("CashMovementStatementHolder");
		
		if ((req.getParameter("AddNew") != null)&&(statement != null)) {
			
			String date = req.getParameter("date");
			String sum = req.getParameter("sum");
			String characteristic = req.getParameter("characteristic");
			String description = req.getParameter("description");
			String doc = req.getParameter("doc");
			Currency currency = ((BankAccount) req.getSession().getAttribute("BankAccount")).getCurrency();
			
			CashMovementEntry newEntry = null;//statement.addEntry();
			
			try {
				
				String pattern = (date.length() == 10) ? "yyyy.MM.dd" : "yyyy.MM.dd HH:mm:ss";
				SimpleDateFormat dateFormatter = new SimpleDateFormat(pattern);
				newEntry.setDate(dateFormatter.parse(date));
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
			
			newEntry.setDescription(description);
			//newEntry.setCharacteristic(characteristic);
			//newEntry.setDoc(doc);
			try {
				newEntry.setSum(new Money(Double.parseDouble(sum), currency));
			} catch (NumberFormatException | POMDataModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
				
			LazyDataManager.getInstance().saveData();
			
		} else if (req.getParameter("DellCurrent")!=null) {
		
			long id = Long.parseLong(req.getParameter("DellCurrent"));
			//statement.deleteEntryById(id);
			LazyDataManager.getInstance().saveData();
			
		}
		
		resp.sendRedirect(req.getHeader("referer"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		if ((req.getParameter("act")!=null)&&(req.getParameter("id")!=null)) {
		
			long id = Long.parseLong(req.getParameter("id"));
			
			DAOFactory dataManager = LazyDataManager.getInstance();
			GenericDAO<BankAccount> genericDAO = new GenericDAO<BankAccount>(BankAccount.class, dataManager);
			BankAccount bankAccount = genericDAO.getByID(id);
			req.getSession().setAttribute("BankAccount", bankAccount);
			
			if(req.getParameter("act").equals("p")) { 
			
				/*CashMovementStatement statement = bankAccount.getPlannedTransactions();
				
				req.getSession().setAttribute("CashMovementStatement", statement);
				req.getSession().setAttribute("CashMovementStatementHolder", statement);
				*/
			} else if(req.getParameter("act").equals("f")) { 
			
				/*CashMovementStatement statement = bankAccount.getFactTransactions();
				
				req.getSession().setAttribute("CashMovementStatement", statement);
				req.getSession().setAttribute("CashMovementStatementHolder", statement);
				*/
			}
			
		}
		
		resp.sendRedirect("CashMovement.jsp");
		
	}

	
}
