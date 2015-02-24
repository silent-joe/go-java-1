package ua.com.goit.gojava2.vova.kickstarter.model;

import java.util.ArrayList;

public class Project{
	private int projectID;
	private String projectName;
	private String shortDescription;
	private String fullDescription;
	private String foto;
	private String link;
	private int howMuchNeeded;
	private int howMuchCollected;
	private int howMuchRemaining;
	private ArrayList<String> faq;
	private int daysLeft;
	
	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}	
	
	public int getHowMuchNeeded() {
		return howMuchNeeded;
	}

	public void setHowMuchNeeded(int howMuchNeeded) {
		this.howMuchNeeded = howMuchNeeded;
	}
	
	public int getHowMuchCollected() {
		return howMuchCollected;
	}

	public void setHowMuchCollected(int howMuchCollected) {
		this.howMuchCollected = howMuchCollected;
	}

	public int getHowMuchRemaining() {
		return howMuchRemaining;
	}

	public void setHowMuchRemaining(int howMuchRemaining) {
		this.howMuchRemaining = howMuchRemaining;
	}

	public ArrayList<String> getFaq() {
		return faq;
	}
	
	public void setFaq(ArrayList<String> question) {
		this.faq = question;
	}

	public void addFaq(String question) {
		this.faq.add(question);
	}

	public int getDaysLeft() {
		return daysLeft;
	}

	public void setDaysLeft(int daysLeft) {
		this.daysLeft = daysLeft;
	}
}
