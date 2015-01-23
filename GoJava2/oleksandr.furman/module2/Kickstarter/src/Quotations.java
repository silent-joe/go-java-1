import java.util.ArrayList;
import java.util.Random;


public class Quotations {
	public String quotations() {
		ArrayList<String> quotations = new ArrayList<String>();
		quotations
				.add("Нельзя же сказать человеку: «Ты можешь творить. Так давай, твори». \nГораздо вернее подождать, пока он сам не скажет: "
						+ "\n«Я могу творить, и я буду творить, хотите вы этого или нет». (c) Айзек Азимов");
		quotations
				.add("Я не хочу создавать что-то для того, чтобы мне платили. \nЯ хочу, чтобы мне платили за то, что я что-то создаю. (c) Леонард Коэн");
		quotations.add("Ключ к открытию вашей мечты – это, в первую очередь, творчество. (c) Зак Эфрон");
		Random ran = new Random();
		String quote = quotations.get(ran.nextInt(quotations.size()));
		return quote;
	}
}
