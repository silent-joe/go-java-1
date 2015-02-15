package myRealization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InFileCategories implements Categories {
	
	private File file;
	private int firstTime = 0;

	public InFileCategories(String fileName){
		file = createFileIfNeeded(fileName);
	}
	
	@Override
	public void addCategory(Category category) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(file, firstTime < 1 ? false : true));
			out.write(category.getName() + "\n");
			firstTime++;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Can't write file", e);
		} catch (IOException e) {
			throw new RuntimeException("Something wrong with file writing");
		}
		finally {
			if (out != null){
				try {
					out.close();
				} catch (IOException e) {
					throw new RuntimeException("Can't close file", e);
				}
			}
		}
	}

	@Override
	public String getCategories() {
		BufferedReader in = null;
		try {
			String result = "";
			in = new BufferedReader(new FileReader(file));
			int index = 1;
			String line = in.readLine();
			while (line != null){
				result += index + " - " + line;
				line = in.readLine();
				if (line != null){
					result += ", ";
				}
				index++;
			}
			return result;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Can't read file", e);
		} catch (IOException e) {
			throw new RuntimeException("Something wrong with file reading");
		}
		finally {
			if (in != null){
				try {
					in.close();
				} catch (IOException e) {
					throw new RuntimeException("Can't close file", e);
				}
			}
		}
	}

	@Override
	public Category readCategory(int index) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			int current = 0;
			String line = in.readLine();
			while (line != null){
				if (current == index) break;
				line = in.readLine();
				current++;
			}
			return new Category(line);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Can't read file", e);
		} catch (IOException e) {
			throw new RuntimeException("Something wrong with file reading");
		}
		finally {
			if (in != null){
				try {
					in.close();
				} catch (IOException e) {
					throw new RuntimeException("Can't close file", e);
				}
			}
		}
	}

	@Override
	public int getLenth() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			int count = 0;
			String line = in.readLine();
			while (line != null){
				line = in.readLine();
				count++;
			}
			return count;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Can't read file", e);
		} catch (IOException e) {
			throw new RuntimeException("Something wrong with file reading");
		}
		finally {
			if (in != null){
				try {
					in.close();
				} catch (IOException e) {
					throw new RuntimeException("Can't close file", e);
				}
			}
		}
	}

	public File createFileIfNeeded(String fileName) {
		File file = new File(fileName);
		if (!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException("Can't create new file", e);
			}
		}
		return file;
	}
	
}