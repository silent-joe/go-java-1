package com.goit.kickstarter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.goit.kickstarter.dao.PaymentDAO;
import com.goit.kickstarter.dao.ProjectDAO;
import com.goit.kickstarter.model.Payment;
import com.goit.kickstarter.model.Project;

public class PaymentAction implements Action {

	private PaymentDAO paymentDao;
	private ProjectDAO projectDao;

	public PaymentAction(PaymentDAO paymentDao, ProjectDAO projectDao) {
		this.paymentDao = paymentDao;
		this.projectDao = projectDao;
	}

	@Override
	public String doGet(HttpServletRequest req, HttpServletResponse resp) {
		int projectId = Integer.valueOf(req.getParameter("projectId"));
		int categoryId = Integer.valueOf(req.getParameter("categoryId"));

		req.setAttribute("projectId", projectId);
		req.setAttribute("categoryId", categoryId);

		return "payment.jsp";
	}

	@Override
	public String doPost(HttpServletRequest req, HttpServletResponse resp) {
		String name = req.getParameter("name");
		String cardNumber = req.getParameter("cardNumber");
		int amount;
		int projectId = Integer.valueOf(req.getParameter("projectId"));
		
		try{
			amount = Integer.parseInt(req.getParameter("amount"));
		}catch(NumberFormatException e){
			amount=0;
		}

		if ("".equals(name)||"".equals(cardNumber)||amount==0) {
			req.setAttribute("message", "Fill all the fields!");
			return doGet(req, resp);
		} else {
			paymentDao.createPayment(new Payment(name, cardNumber, amount, projectId));
			Project p = projectDao.getProject(projectId);
			projectDao.updateProject(new Project(projectId, p.getCollected()+amount));
			req.setAttribute("message", "Thank you!");
			return doGet(req, resp);
		}
	}
}