package ua.goit.alg.tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.goit.alg.FileProcessor;

public class IOTest {
  File file = new File("/1.txt");

  @Before
  public void fileCreating() {
      String content = "5 6 8 11 21 5 4 3 6 6 99 0 98";
      FileProcessor.writeStringToFile(content, file);
  }
  @Test
  public void test() {
    String expected = "5 6 8 11 21 5 4 3 6 6 99 0 98";
    String actual = FileProcessor.readStringFromFile(file);
    assertEquals(expected, actual);
  }
  
  @After
  public void fileDeleting() {
    if (file.exists()) {
      file.delete();
    }
  }

}
