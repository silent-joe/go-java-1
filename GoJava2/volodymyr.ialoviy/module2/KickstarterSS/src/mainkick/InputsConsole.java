package mainkick;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputsConsole implements Inputs{
	public String enter() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
}
