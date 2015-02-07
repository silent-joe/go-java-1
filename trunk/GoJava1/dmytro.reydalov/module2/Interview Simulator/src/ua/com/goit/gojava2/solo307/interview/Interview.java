package ua.com.goit.gojava2.solo307.interview;

import java.util.Collections;

import java.util.List;

public class Interview {
	
	private int correctAnswers;
	private int partiallyCorrectAnswers;
	private int incorrectAnswers;
	private List <Question> questions;
	
	public Interview(){
		correctAnswers = 0;
		partiallyCorrectAnswers = 0;
		incorrectAnswers = 0;
		questions = readFromXml();
	}
	
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public int getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(int correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public int getPartiallyCorrectAnswers() {
		return partiallyCorrectAnswers;
	}

	public void setPartialylCorrectAnswers(int partialCorrectAnswers) {
		this.partiallyCorrectAnswers = partialCorrectAnswers;
	}
	
	public int getIncorrectAnswers() {
		return incorrectAnswers;
	}

	public void setIncorrectAnswers(int wrongAnswers) {
		this.incorrectAnswers = wrongAnswers;
	}
	
	public void addCorrectAnswers(){
		correctAnswers++;
	}
	
	public void addPartiallyCorrectAnswers(){
		partiallyCorrectAnswers++;
	}
	
	public void addIncorrectAnswers(){
		incorrectAnswers++;
	}
	
	public List<Question> readFromXml(){
		XMLParser parser = null;
		try{
			 parser = new XMLParser("MeratechTest.xml");
		}catch(InterviewSimulatorNotNumberException e){
			System.out.println(e.getText());
		}
		return parser.questions;
	}
	
	public List<Question> shuffle(List <Question> questions){
		Collections.shuffle(questions);
		return questions;
	}
	
	public void printQuestionsAndCorrectAnswers(){
		for(Question question: questions){
			System.out.println("\n" + question.getId() +". " + question.getText());
			question.printCorrectAnswers();
		}
	}
	
	public void printQuestionAndAllAnswers(){
		for(Question question: questions){
			System.out.println(question.getId() +". " + question.getText() + "\n");
			question.printAswers();
		}
	}	
	
	public void printQuestionAndAllAnswers(Question question){
			System.out.println(question.getId() +". " + question.getText() + "\n");
			question.printAswers();
	}
	
	public void printIncorrectAnswers(){
		System.out.println("\nНеправильные ответы: ");
		for(Question question: questions){
			question.printWrongAnswers(question);
		}
	}
	
	public void printResults(){
		System.out.println("correct answers " + correctAnswers);
		System.out.println("partial correct answers " + partiallyCorrectAnswers);
		System.out.println("incorrect answers " + incorrectAnswers);
	}
}