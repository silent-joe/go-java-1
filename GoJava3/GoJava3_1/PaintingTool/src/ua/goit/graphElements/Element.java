package ua.goit.graphElements;

import java.util.List;

/**
 * Interface for single element
 * @author Anton Yarosh
 *
 */
public interface Element {

    public void addPoint(Point point);
    public List<Point> getPoints();
    public String getName();
    public String getType();
}
