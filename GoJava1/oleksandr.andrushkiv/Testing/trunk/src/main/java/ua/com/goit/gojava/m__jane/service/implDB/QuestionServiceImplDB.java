package ua.com.goit.gojava.m__jane.service.implDB;

import java.util.List;

import ua.com.goit.gojava.m__jane.dao.QuestionDAO;
import ua.com.goit.gojava.m__jane.dao.impl.QuestionDAOImpl;
import ua.com.goit.gojava.m__jane.model.Category;
import ua.com.goit.gojava.m__jane.model.question.Question;
import ua.com.goit.gojava.m__jane.model.question.SimpleQuestion;
import ua.com.goit.gojava.m__jane.service.QuestionService;

public class QuestionServiceImplDB implements QuestionService {

	
	private QuestionDAO questionDAO;
		
	
	public QuestionServiceImplDB() {
		questionDAO = new QuestionDAOImpl();
	}

	@Override
	public List<Question> getQuestionList(List<Category> categoryList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getQuestionList() {
		// TODO Auto-generated method stub
		return questionDAO.getQuestionList();
	}

	@Override
	public void saveQuestion(Question question) {
		
		//TODO divide SimpleQuestion and MultipleQuestion
		
		questionDAO.saveSimpleQuestion((SimpleQuestion) question);
		
	}
	
	@Override
	public void deleteQuestion(Integer id) {
		
		//TODO divide SimpleQuestion and MultipleQuestion		
		questionDAO.deleteQuestion(id);
		
	}

	@Override
	public SimpleQuestion getQuestion(Integer id) {
		//TODO divide SimpleQuestion and MultipleQuestion		
		return questionDAO.getSimpleQuestion(id);
	}

	@Override
	public void updateQuestion(SimpleQuestion question) {
		//TODO divide SimpleQuestion and MultipleQuestion		
		questionDAO.updateSimpleQuestion(question);		
	}
	
	/*getters/setters*/
	
	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}

}
