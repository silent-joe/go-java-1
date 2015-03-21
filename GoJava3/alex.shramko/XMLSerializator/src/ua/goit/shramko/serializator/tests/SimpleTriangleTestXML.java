package ua.goit.shramko.serializator.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.goit.shramko.serializator.basicobjects.Point;
import ua.goit.shramko.serializator.basicobjects.Shape;
import ua.goit.shramko.serializator.main.Factory;
import ua.goit.shramko.serializator.serializers.SerializerFor;

public class SimpleTriangleTestXML {

  @Test
  public void test() {
    Shape triangle1 = Factory.createObject("Triangle", null, 0, new Point(30,
        30), new Point(30, 40), new Point(40, 30));
    String expected = "<Triangle><a><x>30</x><y>30</y></a><b><x>30</x><y>40</y></b><c><x>40</x><y>30</y></c></Triangle>";
    SerializerFor xml = Factory.getSerializerFor("XML");
    String actual = xml.serialize(triangle1);
    assertEquals(expected, actual);
    
  }

}
