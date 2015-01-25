package ua.com.goit.gojava.m__jane;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ua.com.goit.gojava.m__jane.model.OpenQuestion;
import ua.com.goit.gojava.m__jane.model.Profile;
import ua.com.goit.gojava.m__jane.model.Question;
import ua.com.goit.gojava.m__jane.model.QuestionCategory;
import ua.com.goit.gojava.m__jane.service.ProfileService;
import ua.com.goit.gojava.m__jane.service.QuestionService;
import ua.com.goit.gojava.m__jane.service.impl.ProfileServiceImpl;
import ua.com.goit.gojava.m__jane.service.impl.QuestionServiceImpl;

public class MainClass {

	
	public static void main(String[] args) throws JAXBException{

		File file = new File("NewFile.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] {Profile.class,ProfileServiceImpl.class, QuestionCategory.class, OpenQuestion.class});
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		ProfileServiceImpl profileService = (ProfileServiceImpl) jaxbUnmarshaller.unmarshal(file);
				
		
		System.out.println(profileService.getProfiles().size());
		
		for (Profile profile : profileService.getProfiles()) {
			
			System.out.println(profile);
			
			for (QuestionCategory questionCategory : profile.getQuestionCategories()) {
				System.out.println("	Category="+ questionCategory);
				
				for (Question question : questionCategory.getQuestions()) {
					System.out.println("		question="+ question);
				}
			}
		}
		

	}
	
	/*private static QuestionService questionService = new QuestionServiceImpl();
	private static ProfileService profileService = new ProfileServiceImpl();
		
	public static void main(String[] args) {

		System.out.println("User story 1 - press 1 | User story 2 - press 2");
		Scanner scanIn = new Scanner(System.in);
		int choice = Integer.parseInt(scanIn.nextLine());

		if (choice == 1) {
			printAllProfiles();
		} else if (choice == 2) {
			askAndPrintQuestionsOfOneProfile(scanIn);
		} else {
			System.out.println("Wrong choice");
		}

	}


	private static void printAllProfiles() {
		for (Profile profile : profileService.getProfileList()) {
			System.out.println(profile);
		}				
	}

	private static void askAndPrintQuestionsOfOneProfile(Scanner scanIn) {
		
														//яке призначення методу getProfileCount() для бізнес логіки?
														//ось я його використовую
		System.out.println("Enter number the question from 1 to " + profileService.getProfileCount());
		Profile profile = profileService.getProfile(Integer.parseInt(scanIn.nextLine().trim()));
		if (profile == null) {
			System.out.println("Not found such profile");
		} else {
			List<Question> list = questionService.getQuestionList(profile);
			for (Question question : list) {
				System.out.println(question);
			}
		}
		
	}*/
}
