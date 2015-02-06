package ua.com.goit.gojava.andriidnikitin.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Basket {
	
	private HashMap<Good,Integer> order;
	private Integer id;
	private Date date;
	
	public Map<Good, Integer> getOrder() {
		return order;
	}
	
	public void setOrder(HashMap<Good, Integer> order) {
		this.order = order;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

}
