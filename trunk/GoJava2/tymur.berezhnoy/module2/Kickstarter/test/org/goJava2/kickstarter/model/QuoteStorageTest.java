package org.goJava2.kickstarter.model;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.goJava2.kickstarter.content.Quote;
import org.junit.Test;

public class QuoteStorageTest {
	
	private QuoteStorage quoteStorage;
	
	@Test
	public void shouldQuoteNotNull_WhenRandomQuote() {
		quoteStorage = mock(QuoteStorage.class);
		
		Quote quote = quoteStorage.getRandomQuote();
		assertNull("Proof of return! RandomQuote should renurn any quote.", quote);
		
		verify(quoteStorage).getRandomQuote();
	}
	
	@Test
	public void shouldListSizeNot0_whenNewQuoteStorage() {
		quoteStorage = new QuoteStorage();
		assertFalse("Expected that constructor for Hard-coded quotes init at least 1 quote.",
					quoteStorage.getContent().size() == 0);
	}
	
	@Test
	public void shouldListNotBeNull_whenNewQuoteStorage() {
		quoteStorage = new QuoteStorage();
		assertFalse("Expected that list is not null.",
					quoteStorage.getContent() == null);
	}
	
	@Test
	public void shouldListContainsNewQuote_whenAddNewQuote() {
		quoteStorage = new QuoteStorage();
		
		Quote quote = new Quote("New quote", "author");
		quoteStorage.addContent(quote);
		
		assertTrue("Expected that new created quote is at storage.",
					quoteStorage.getContent().contains(quote));
	}
	
	@Test
	public void listShouldNotBeNull_whenNewCustomQuoteStorage() {
		quoteStorage = new QuoteStorage(new ArrayList<Quote>());
		assertFalse("Expected that list is not null.",
					quoteStorage.getContent() == null);
	}
}