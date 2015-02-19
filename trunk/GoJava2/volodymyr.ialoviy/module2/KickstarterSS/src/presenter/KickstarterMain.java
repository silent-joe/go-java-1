package presenter;

import model.Categories;
import model.CategoriesFromFile;
import model.Projects;
import view.InputsConsole;
import view.OutputConsole;

public class KickstarterMain {
    public static void main(String[] args){
    	InputsConsole in = new InputsConsole();
    	OutputConsole out = new OutputConsole();
    	Categories categories = new CategoriesFromFile();
    	Projects projects = new Projects();

    	KickstarterS run = new KickstarterS(in, out, categories, projects);
    	run.kickstarter();
    }
}