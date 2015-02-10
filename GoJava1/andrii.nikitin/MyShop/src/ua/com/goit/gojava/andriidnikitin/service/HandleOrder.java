package ua.com.goit.gojava.andriidnikitin.service;

import java.util.Date;
import java.util.List;

import ua.com.goit.gojava.andriidnikitin.model.Client;
import ua.com.goit.gojava.andriidnikitin.model.OrderStatus;

public interface HandleOrder {
	
	//public void addOrder(Basket basket, Client client, Order order);
	public void sortOrders(OrderStatus status);//returns Iterator?
	public void sortOrders(Date date);
	public void sortOrdersByPriority();
	//public List<Order> getOrders(OrderStatus status);
	//public List<Order> getOrders(Date date);
	//public List<Order> getActiveOrders();
	//public void setStatus(Order order);
	public void disactivateOrder();
	//public String getInfo(Order order);
	//public Order nextOrder();
	
}