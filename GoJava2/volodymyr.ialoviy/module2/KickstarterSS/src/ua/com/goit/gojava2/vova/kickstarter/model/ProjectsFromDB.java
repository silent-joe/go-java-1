package ua.com.goit.gojava2.vova.kickstarter.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ua.com.goit.gojava2.vova.kickstarter.util.PeriodBetweenDates;

public class ProjectsFromDB implements Projects{
	
	@Override
	public String showProjectFull(int projectID) {
		StringBuilder s = new StringBuilder();

		ResultSet result;
		try {
			result = ConnectToDB.statement.executeQuery("SELECT * FROM projects WHERE id_project =" + projectID);
			while (result.next()) {
	            s.append("project ID = ").append(result.getString("id_project")).append("\n")
					.append("project name: ").append(result.getString("name_project")).append("\n")
					.append("short description: ").append(result.getString("short_description_project")).append("\n")
					.append("full description: " ).append(result.getString("full_description_project")).append("\n")
					.append("foto: ").append(result.getString("foto_project")).append("\n")
					.append("link: ").append(result.getString("link_project")).append("\n")
					.append("how much needed = ").append(result.getString("how_much_needed_project")).append("\n")
					.append("how much collected = ").append(result.getString("how_much_collected_project")).append("\n")
					.append("how much remaining = ").append(result.getString("how_much_remaining_project")).append("\n")
					.append("days to go = ").append(Integer.toString(PeriodBetweenDates.periodJoda(result.getString("date_close_project")))).append("\n");
			}
			s.append("faq = ").append(arrayListToString(getFaq(projectID))).toString();
		} catch (SQLException e) {
			System.err.println( e.getClass().getName()+": +"+ e.getMessage() );
		}
	
		return s.toString();
	}
	
	@Override
	public String showProjectInShort(int projectID) {
		StringBuilder s = new StringBuilder();

		ResultSet result;
		try {
			result = ConnectToDB.statement.executeQuery("SELECT id_project, name_project, short_description_project, "
	            		+ "how_much_needed_project, how_much_collected_project "
	            		+ "FROM projects WHERE id_project =" + projectID);
	            while (result.next()) {
		            s.append(result.getString("id_project"))
							.append(" ").append(result.getString("name_project"))
							.append(", ").append(result.getString("short_description_project"))
							.append(", ").append(result.getString("how_much_needed_project"))
							.append(", ").append(result.getString("how_much_collected_project")).toString();
	            }
		} catch (SQLException e) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		}
		
		return s.toString();
	}

	@Override
	public void setDonation(int chosenProject, int amount) {
		try {
			ConnectToDB.statement.execute("UPDATE projects SET how_much_collected_project=how_much_collected_project+" + amount
			    	+ ", how_much_remaining_project=how_much_remaining_project-" + amount
			    	+ "WHERE id_project=" + chosenProject + ";");
		} catch (SQLException e) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		}
	}

	@Override
	public void addFAQ(int projectID, String question) {
		try {
			ConnectToDB.statement.execute("INSERT INTO faq(id_project, question)VALUES (" + projectID + ", '" + question + "');");
		} catch (SQLException e) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		}
	}

	@Override
	public ArrayList<String> getFaq(int projectID) {
		ArrayList<String> s = new ArrayList<String>();
		
		ResultSet result;
		try {
			result = ConnectToDB.statement.executeQuery("SELECT * FROM faq WHERE id_project =" + projectID);
	            while (result.next()) {
		            s.add(result.getString("question"));
	            }
		} catch (SQLException e) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		}
		return s;
	}

	private String arrayListToString(ArrayList<String> array) {
		StringBuilder string = new StringBuilder();
		if(!array.isEmpty()){
			for (String s : array){
			    string.append(s).append(";\n").toString();
			}
			return string.substring(0, string.length() - 1);
		}
		return string.toString();
	}
}