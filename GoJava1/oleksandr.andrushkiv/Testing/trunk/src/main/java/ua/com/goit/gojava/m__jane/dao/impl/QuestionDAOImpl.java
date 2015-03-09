package ua.com.goit.gojava.m__jane.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ua.com.goit.gojava.m__jane.dao.QuestionDAO;
import ua.com.goit.gojava.m__jane.model.question.Question;
import ua.com.goit.gojava.m__jane.model.question.SimpleQuestion;
import ua.com.goit.gojava.m__jane.utils.DBConnectionSystem;

public class QuestionDAOImpl implements QuestionDAO {

	private DBConnectionSystem dbConnectionSystem;
	
	public QuestionDAOImpl() {
		dbConnectionSystem = DBConnectionSystem.getInstance(); 
	}
	
	
	@Override
	public void saveSimpleQuestion(SimpleQuestion question) {
				
		try(Connection connection = dbConnectionSystem.getConnection();){
						
			String sql = "Insert Into simple_question(content,standart_answer) "
	    			+ "Values(?,?)";
			PreparedStatement st = connection.prepareStatement(sql);	    	  		   		
	    	st.setString(1, question.getContent());
	    	st.setString(2, question.getStandartAnswer());
	    	st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new TestingRuntimeException("Can't save question to DB!");
			//TODO write to log
		}
		
	}


	@Override
	public List<Question> getQuestionList() {
		List<Question> list = new ArrayList<>();
		try(Connection connection = dbConnectionSystem.getConnection();){
			
			String sql = "Select id,content,standart_answer from simple_question";
			
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
	    	while (rs.next()) {
	    		SimpleQuestion simpleQuestion = new SimpleQuestion();
	    		simpleQuestion.setId(rs.getInt("id"));
	    		simpleQuestion.setContent(rs.getString("content") );
	    		simpleQuestion.setStandartAnswer(rs.getString("standart_answer") );
	    		list.add(simpleQuestion);
			}
	    	
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new TestingRuntimeException("Can't read question from DB!");
			//TODO write to log
		}
		
		return list;
	}


	@Override
	public void deleteQuestion(Integer id) {
		
		try(Connection connection = dbConnectionSystem.getConnection();){

			String sql = "Delete from simple_question where id=?";
	    			
			PreparedStatement st = connection.prepareStatement(sql);	    	  		   		
	    	st.setInt(1, id);
	    	st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new TestingRuntimeException("Can't delete question from DB!");
			//TODO write to log
		}
	}


	@Override
	public SimpleQuestion getSimpleQuestion(Integer id) {
		
		try(Connection connection = dbConnectionSystem.getConnection();){

			String sql = "Select id,content,standart_answer from simple_question where id=?";
	    			
			PreparedStatement st = connection.prepareStatement(sql);	    	  		   		
	    	st.setInt(1, id);
	    	ResultSet rs = st.executeQuery();
	    	
	    	while (rs.next()) {
	    		SimpleQuestion simpleQuestion = new SimpleQuestion();
	    		simpleQuestion.setId(rs.getInt("id"));
	    		simpleQuestion.setContent(rs.getString("content") );
	    		simpleQuestion.setStandartAnswer(rs.getString("standart_answer"));
	    		return simpleQuestion;
			}
	    	
	    	
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new TestingRuntimeException("Can't get question from DB!");
			//TODO write to log
		}
		return null;
	}


	@Override
	public void updateSimpleQuestion(SimpleQuestion question) {
		
		try(Connection connection = dbConnectionSystem.getConnection();){
			
			String sql = "Update simple_question Set content=?,standart_answer=? where id=?";
			PreparedStatement st = connection.prepareStatement(sql);	    	  		   		
	    	st.setString(1, question.getContent());
	    	st.setString(2, question.getStandartAnswer());
	    	st.setInt(3, question.getId());
	    	st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new TestingRuntimeException("Can't update question to DB!");
			//TODO write to log
		}
		
		
	}

}