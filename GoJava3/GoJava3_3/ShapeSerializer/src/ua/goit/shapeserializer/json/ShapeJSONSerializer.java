/**
 * Created by Aleksey Kurkov on 22.03.15.
 */

package ua.goit.shapeserializer.json;

import ua.goit.shapeserializer.ShapeSerializer;
import ua.goit.shapeserializer.basicobjects.Shape;

public abstract class ShapeJSONSerializer implements ShapeSerializer {
  @Override
  public abstract String serialize(Shape shape);
}