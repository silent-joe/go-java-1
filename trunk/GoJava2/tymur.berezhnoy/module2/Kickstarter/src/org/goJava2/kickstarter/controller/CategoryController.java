package org.goJava2.kickstarter.controller;

import java.util.Set;

import org.goJava2.kickstarter.behavior.ControllerBehavior;
import org.goJava2.kickstarter.behavior.StorageBehavior;
import org.goJava2.kickstarter.content.Category;

public class CategoryController implements ControllerBehavior<Integer> {
	
	private StorageBehavior<Integer> categoryStorage;
	
	public CategoryController(StorageBehavior<Integer> storage) {
		categoryStorage = storage;
	}
	
	@Override
	public Set<Category> getContent() {
		return (Set<Category>) categoryStorage.getContent();
	}
	
	@Override
	public Category getSpecificContent(Integer t) {
		return (Category) categoryStorage.getSpecificContent(t);
	}
}