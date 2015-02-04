 package gojava;

import static org.junit.Assert.*;

import org.junit.*;

import gojava.*;

public class UnitTestKickstarter {
	ConsoleIO io = new ConsoleIO();
	Categories categories = new Categories();
	
	@Test
	public void shouldShowCategories_whenFilled(){
		categories.fillCategories();		
		assertEquals("1 - Sports\n2 - Music\n3 - Games\n0 - Go back\n", 
				categories.showCategories());
	}
	
	@Test
	public void shouldShowProjects_whenCategoryIsChosen() {
		categories.fillCategories();		
		assertEquals("You have chosen Category Sports\n"+
					"Choose a project:\n"+
						"1 - Football\n"+
						"this is a short description\n"+
						"Money needed: 10000; Money collected: 0\n"+
						"Days left: 7\n"+
						"--------------------------\n"+
						"2 - Basketball\n"+
						"this is a short description\n"+
						"Money needed: 10000; Money collected: 0\n"+
						"Days left: 7\n"+
						"--------------------------\n"+
						"0 - Go back\n", 
						categories.getCategory(0).showProjects());
	}
	
	@Test
	public void shouldShowProject_whenProjectIsChosen(){
		categories.fillCategories();		
		assertEquals("Football\n"+
				"this is a short description\n"+
				"Money needed: 10000; Money collected: 0\n"+
				"Days left: 7\n"+
				"this is a very interesting project story\n"+
				"www.link.com\n"+
				"--------------------------\n"+
				"Q: this is a question\n"+
				"A: this is an answer\n"+
				"Q: this is a question\n"+
				"A: this is an answer\n"+
				"Q: this is a question\n"+
				"A: this is an answer\n"+
				"1 - Ask question\n2 - Invest\n0 - Go back\n", 
				categories.getCategory(0).getProject(0).showProject());
	}	
}
