package goit.iavorskyi;

import static org.junit.Assert.*;
import goit.iavorskyi.learningUnit.Comment;
import goit.iavorskyi.learningUnit.LearningUnit;
import goit.iavorskyi.learningUnit.Rating;

import org.junit.Before;
import org.junit.Test;

public class LearningUnitTest {

	private LearningUnit lu = new LearningUnit();
	private Comment comment1 = new Comment();
	private Rating rating1 = new Rating();
	private Comment comment2 = new Comment();
	private Rating rating2 = new Rating();
	
	@Before
	public void init() {
		comment1.setAuthor("Vova");
		comment1.setComment("first comment");
		comment1.setId(1);
		lu.getComments().add(comment1);
		comment2.setAuthor("Vanya");
		comment2.setComment("second comment");
		comment2.setId(2);
		lu.getComments().add(comment2);
		rating1.setAuthor("Vova");
		rating1.setRating(10);
		lu.getRating().add(rating1);
		rating2.setAuthor("Vanya");
		rating2.setRating(15);
		lu.getRating().add(rating2);
	}
	
	@Test
	public void testCalculatePopularity() {
		assertEquals(4, lu.calculatePopularity());
	}

	@Test
	public void testDeleteComment() {
		assertTrue(lu.deleteComment(2));
	}

	@Test
	public void testDeleteRate() {
		assertTrue(lu.deleteRate("Vanya"));
	}

	@Test
	public void testDeleteAllRates() {
		lu.deleteAllComments();
		assertEquals(0, lu.getComments().size());
	}

	@Test
	public void testDeleteAllComments() {
		lu.deleteAllRates();
		assertEquals(0, lu.getRating().size());
	}

}