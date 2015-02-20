package model;

import java.util.ArrayList;

public class ProjectsFromFile implements Projects {
	private static final String PROJECTS_FILE = "Projects.properties";
	private ArrayList<Project> listProject = new ArrayList<Project>();
	private int counterProject;

	@Override
	public void writeAllProjects(){
		ArrayList<String[]> projectBD = new ArrayList<String[]>();
		ReaderDB reader = new ReaderDB();
		projectBD = reader.read(PROJECTS_FILE);
		int i = 0;
		for (String[] value : projectBD) {
			getListProject().add(new Project());
			updateProject(value, i);
		    i++;
		}
		setCounterProject(getListProject().size());
	}

	@Override
	public void updateProject(String[] value, int i){
		Project project = listProject.get(i);
		project.setProjectID(Integer.valueOf(value[0]));
		project.setProjectName(value[1]);
		project.setShortDescription(value[2]);
		project.setFullDescription(value[3]);
		project.setFoto(value[4]);
		project.setLink(value[5]);
		project.setHowMuchNeeded(Integer.valueOf(value[6]));
		project.setHowMuchCollected(Integer.valueOf(value[7]));
		project.setHowMuchRemaining(Integer.valueOf(value[8]));
		project.setFaq(getProjectFromCategory(value[9]));
	}
	
	@Override
	public String showProjectFull(int numberProject){
		Project project = listProject.get(numberProject);
		return "projectID = " + project.getProjectID() + "\n"
						+ "projectName: " + project.getProjectName() +  "\n"
						+ "shortDescription: " + project.getShortDescription() + "\n"
						+ "fullDescription: " + project.getFullDescription() + "\n"
						+ "foto: " + project.getFoto() + "\n"
						+ "link: " + project.getLink() + "\n"
						+ "howMuchNeeded = " + project.getHowMuchNeeded() + "\n"
						+ "howMuchCollected = " + project.getHowMuchCollected() + "\n"
						+ "howMuchRemaining = " + project.getHowMuchRemaining() + "\n"
						+ "faq = " + project.getFaq();
	}
	
	@Override
	public String showProjectInShort(int projectID){
		Project project = listProject.get(projectID);
		return project.getProjectID()
				+ ", " + project.getProjectName()
				+ ", " + project.getShortDescription()
				+ ", " + project.getHowMuchNeeded()
				+ ", " + project.getHowMuchCollected();
	}

	@Override
	public void setDonation(int chosenProject, int amount){
		Project project = listProject.get(chosenProject);
		project.setHowMuchCollected(project.getHowMuchCollected() + amount);
		project.setHowMuchRemaining(project.getHowMuchRemaining() - amount);
	}
	
	@Override
	public void addFAQ(int projectID, String question){
		Project project = listProject.get(projectID);
		project.addFaq(question);
	}
	
	@Override
	public ArrayList<String> getFaq() {
		Project project = new Project();
		return project.getFaq();
	}
	
	@Override
	public ArrayList<Project> getListProject() {
		return listProject;
	}

	@Override
	public void setListProject(ArrayList<Project> listProject) {
		this.listProject = listProject;
	}

	@Override
	public int getCounterProject() {
		return counterProject;
	}

	@Override
	public void setCounterProject(int counterProject) {
		this.counterProject = counterProject;
	}
	
	private ArrayList<String> getProjectFromCategory(String value) {
		String[] string = value.split(",");
		ArrayList<String> faq = new ArrayList<String>();
		for (int j = 0; j < string.length; j++){
			faq.add(string[j]);
		}
		return faq;
	}
}