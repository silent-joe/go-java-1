package com.gojava2.kickstarter.model;

import java.util.LinkedHashSet;
import java.util.Set;

import com.gojava2.kickstarter.content.Category;

public class CategoryStorage implements Storage<Integer> {

	private Set<Category> categories;
	
	/**
	 * The constructor for Hard-coded categories.
	 */
	public CategoryStorage() {
		categories = new LinkedHashSet<Category>();
		categories.add(new Category("Art"));
		categories.add(new Category("Comics"));
		categories.add(new Category("Dance"));
		categories.add(new Category("Games"));
	}
	
	/**
	 * The constructor for custom categories.
	 * @param categories
	 */
	public CategoryStorage(Set<Category> categories) {
		this.categories = categories;
	}
	
	@Override
	public Set<Category> getContent() {
		return categories;
	}
}