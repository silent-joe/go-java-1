package ua.goit.adapter;

import ua.goit.model.Circle;

public class CircleAdapterXML {
    private Circle circle;

    CircleAdapterXML(Circle circle) {
        this.circle = circle;
    }

    public String serialize() {
        StringBuilder xml = new StringBuilder();

        return xml.toString();
    }

}