package ua.com.goit.gojava.solo307.interview.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ua.com.goit.gojava.solo307.interview.domain.Answer;
import ua.com.goit.gojava.solo307.interview.domain.Mark;
import ua.com.goit.gojava.solo307.interview.domain.Question;

public class StatisticsDTO {

	Set<Question> questions = new HashSet<Question>();
	private String date;
	private String duration;
	private final String CORRECT = "Правильно отвечено = ";
	private final String HALF_CORRECT = "Частично правильно отвечено = ";
	private final String INCORRECT = "Неправильно отвечено = ";
	private final String DATE = "Дата собеседования: ";
	private final String DURATION = "Длительность собеседования: ";
	private final String ANSWERED_INCORRECT = "Неправильно отвечено на: ";
	private int correct;
	private int halfCorrect;
	private int incorrect;

	public StatisticsDTO(Set<Question> reconstructed) {
		this.questions = reconstructed;
		this.date = "";
		this.duration = "";
		this.correct = 0;
		this.halfCorrect = 0;
		this.incorrect = 0;
	}

	@Override
	public String toString() {
		return "StatisticsDTO [questions=" + questions + ", date=" + date + ", duration=" + duration + ", correct="
				+ correct + ", halfCorrect=" + halfCorrect + ", incorrect=" + incorrect + "]";
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getCorrect() {
		return correct;
	}

	public void setCorrect(int correct) {
		this.correct = correct;
	}

	public int getHalfCorrect() {
		return halfCorrect;
	}

	public void setHalfCorrect(int halfCorrect) {
		this.halfCorrect = halfCorrect;
	}

	public int getIncorrect() {
		return incorrect;
	}

	public void setIncorrect(int incorrect) {
		this.incorrect = incorrect;
	}

	public StatisticsDTO evaluateAnswers(StatisticsDTO dto, Set<Question> reconstructed) {
		for (Question question : reconstructed) {
			try {
				incrementValue(question.getMark());
			} catch (InterviewSimulatorException e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		return dto;
	}

	private boolean incrementValue(Mark mark) throws InterviewSimulatorException {
		if (mark.isCorrect()) {
			correct++;
			return true;
		} else if (mark.isHalfcorrect()) {
			halfCorrect++;
			return true;
		} else if (mark.isIncorrect()) {
			incorrect++;
			return true;
		} else
			throw new InterviewSimulatorException("Something wrong with mark Object");
	}

	public List<String> getPrintVersion() {
		List<String> dto = new ArrayList<String>();
		dto.add(DATE + date);
		dto.add(DURATION + duration);
		dto.add(new String(CORRECT + correct));
		dto.add(new String(HALF_CORRECT + halfCorrect));
		dto.add(new String(INCORRECT + incorrect));
		dto.add(new String(ANSWERED_INCORRECT));
		for (Question question : questions) {
			if (question.hasIncorrectAnswer())
				dto.add(question.getText());
			for (Answer answer : question.getMarkedAnswers()) {
				if (!answer.isAnswerCorrect())
					dto.add(answer.getText());
			}
		}
		return dto;
	}
}
