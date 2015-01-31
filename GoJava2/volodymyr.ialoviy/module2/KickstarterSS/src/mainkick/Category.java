package mainkick;
import java.io.FileNotFoundException;
import java.util.Map;

public class Category{
	private int categoryID;
	private String categoryName;
	private int[] projectsThatContain;
	private int counterCategory;

	public void showAllCatecories() throws FileNotFoundException{
		recordingCategoryFromBD(1);
		for (int i = 1; i <= counterCategory; i++){
			String[] categoryInString = recordingCategoryFromBD(i);
			categoryID = Integer.valueOf(categoryInString[0]);
			setCategoryName(categoryInString[1]);
			System.out.println(categoryID + " " + getCategoryName());
		}
	}
	
	public String[] recordingCategoryFromBD(int projectID) throws FileNotFoundException{
		Map<Integer, String> linesAsArray = BD.categoryBD;
		String[] string = linesAsArray.get(projectID-1).split("\\[\\]");
		counterCategory = linesAsArray.size();
		return string;
	}
	
	public void showCategory(int selectCategoryID) throws FileNotFoundException{
		stringConvertToCategory(selectCategoryID);
		Output out = new OutputConsole();
		out.print("categoryID = " + categoryID);
		out.print("categoryName: " + getCategoryName());
		out.print("projectsThatContain: " + projectsThatContain);
	}
	
	private int[] stringConvertToCategory(int selectProjectID) throws FileNotFoundException{
		String[] projectInString = recordingCategoryFromBD(selectProjectID);
		categoryID = Integer.valueOf(projectInString[0]);
		setCategoryName(projectInString[1]);
		String[] string = projectInString[2].split(",");
		projectsThatContain = new int[string.length];
		for (int i = 0; i < string.length; i++){
			projectsThatContain[i] = Integer.valueOf(string[i]);
		}
		return projectsThatContain;
	}
	
	public void showAllProjectInCategory(int categoryNamber) throws FileNotFoundException{
		projectsThatContain = stringConvertToCategory(categoryNamber);
		Project pr = new Project();
		pr.showAllProjectInCategory(projectsThatContain);
	}
	
	public void addCategory(){
		//TODO
		counterCategory++;
	}
	
	public void deleteCategory(){
		//TODO
		counterCategory--;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String showCategoryName(int selectCategoryID) throws FileNotFoundException{
		stringConvertToCategory(selectCategoryID);
		return getCategoryName();
	}
}
