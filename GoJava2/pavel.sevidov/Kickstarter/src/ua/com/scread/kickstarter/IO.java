package ua.com.scread.kickstarter;

public interface IO {

	public abstract int read();
	
	public abstract String readString();

	public abstract void print(String message);

}