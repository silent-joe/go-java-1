package model;
import java.util.ArrayList;
import java.util.Arrays;


public class QuotesFromFile implements Quotes {
	private String[] quote;
	public static ArrayList<String[]> quoteBD;
	{
	    ReaderDB reader = new ReaderDB();
		quoteBD = reader.read("Quotes.properties");
	}
	
	@Override
	public String getQuote(){
		ArrayList<String[]> linesAsArray = quoteBD;
		quote = linesAsArray.get((int) (Math.random() * (linesAsArray.size() - 1) + 0.5));
		return Arrays.toString(quote);
	}
}