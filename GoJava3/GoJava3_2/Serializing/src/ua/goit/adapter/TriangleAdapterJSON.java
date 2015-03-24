package ua.goit.adapter;

import ua.goit.model.ContainerShapes;
import ua.goit.model.Triangle;
import ua.goit.serializers.Serializer;

public class TriangleAdapterJSON implements Serializer{


  @Override
  public String serialize(ContainerShapes object) {
    Triangle triangle = (Triangle) object;
    
    StringBuilder json = new StringBuilder();
    json.append("{\"type\":\"TRIANGLE\",");

    json.append("\"point1\":{");
    json.append("\"x\":" + triangle.getPoint1().x);
    json.append(",");
    json.append("\"y\":" + triangle.getPoint1().y);
    json.append("}");
    json.append(",");

    json.append("\"point2\":{");
    json.append("\"x\":" + triangle.getPoint2().x);
    json.append(",");
    json.append("\"y\":" + triangle.getPoint2().y);
    json.append("}");
    json.append(",");

    json.append("\"point3\":{");
    json.append("\"x\":" + triangle.getPoint3().x);
    json.append(",");
    json.append("\"y\":" + triangle.getPoint3().y);
    json.append("}");

    json.append("}");
    return json.toString();
  }



}
