package ua.goit.goitjava.kikcstarter;

public class Project {
	private String name;
	private String description;
	private int needMoney;
	private int haveMoney;
	private int daysBeforeEnd;
	private String projectHistory;
	private String linkToDemoVideo;
	private String quastionAnswer;
	private Category category;

	public Project(String name, String description, Category category, int needMoney,
			int haveMoney, int daysBeforeEnd, String projectHistory, String linkToDemoVideo, String quastionAnswer) {
	
		this.name = name;
		this.description = description;
		this.category = category;
		this.needMoney = needMoney;
		this.haveMoney = haveMoney;
		this.daysBeforeEnd = daysBeforeEnd;
		this.projectHistory = projectHistory;
		this.linkToDemoVideo = linkToDemoVideo;
		this.quastionAnswer = quastionAnswer;
	}
	
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getNeedMoney() {
		return needMoney;
	}
	public int getHaveMoney() {
		return haveMoney;
	}
	public int getDaysBeforeEnd() {
		return daysBeforeEnd;
	}


	public Category getCategory() {
		return category;
	}

	public String getProjectHistory() {
		return projectHistory;
	}


	public String getLinkToDemoVideo() {
		return linkToDemoVideo;
	}


	public String getQuastionAnswer() {
		return quastionAnswer;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String toString(){
		return name;
	}
	
	
	
	
}