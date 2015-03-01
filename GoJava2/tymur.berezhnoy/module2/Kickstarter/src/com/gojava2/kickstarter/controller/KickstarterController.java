package com.gojava2.kickstarter.controller;

import com.gojava2.kickstarter.model.Category;
import com.gojava2.kickstarter.model.CategoryStorageInVM;
import com.gojava2.kickstarter.model.ProjectStorageInVM;
import com.gojava2.kickstarter.model.QuoteStorageInVM;
import com.gojava2.kickstarter.view.ConsoleInput;
import com.gojava2.kickstarter.view.ConsoleView;

public class KickstarterController {
	
	private QuoteStorageInVM quoteStorage;
	private CategoryStorageInVM categoryStorage;
	private ProjectStorageInVM projectStorage;
	
	private	ConsoleView view;
	private ConsoleInput consoleInput;
	
	public KickstarterController(QuoteStorageInVM quoteStorage, CategoryStorageInVM categoryStorage,
								ProjectStorageInVM projectStorage, ConsoleView consoleView) {
		this.quoteStorage = quoteStorage;
		this.categoryStorage = categoryStorage;
		this.projectStorage = projectStorage;
		this.view = consoleView;
		consoleInput = new ConsoleInput();
	}
	
	public void selectCategory() {
		view.displaySelectOption(1);
		int input = consoleInput.choice();
		int amountCategory = categoryStorage.getCategories().size();
		if(input > 0 && input <= amountCategory) {
			Category category = categoryStorage.getCategory(input);
			view.display(projectStorage.getSpecificProjects(category));
			selectProject(category);
			selectCategory();
		} else if(input == 0) {
			System.out.print("- App closed");
			return;
		} else {
			selectCategory();
		}
	}
	
	public void selectProject(Category category) {
		view.displaySelectOption(2);
		int input = consoleInput.choice();
		
		if(input > 0) {
			view.display(projectStorage.getSpecificProject(category,input));
			backToProjects(category);
			selectProject(category);
		} else if (input == 0) {
			view.display(categoryStorage.getCategories());
		}
	}
	
	public void backToProjects(Category category) {
		view.displaySelectOption(3); 
		if(consoleInput.choice() == 0) {
			view.display(projectStorage.getSpecificProjects(category));
		} else {
			backToProjects(category);
		}
	}
	
	public void run() {
		view.displayTitle();
		view.display(quoteStorage.getRandomQuote());
		view.display(categoryStorage.getCategories());
		
		selectCategory();
	}
}