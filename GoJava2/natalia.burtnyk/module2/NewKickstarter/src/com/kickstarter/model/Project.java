package com.kickstarter.model;
public class Project {
	
	private String name;
	private String history;
	private String url;
	private String description;
	private int requiredAmount;
	private int total;
	private int days;

	public Project(String name, String description,String history,String url, int requiredAmount,
			int total, int days) {
		this.name = name;
		this.description = description;
		this.requiredAmount = requiredAmount;
		this.history = history;
		this.url = url;
		this.total = total;
		this.days = days;
		
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRequiredAmount() {
		return requiredAmount;
	}

	public void setRequiredAmount(int requiredAmount) {
		this.requiredAmount = requiredAmount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
}