package Solid.controllers;

import Solid.interfaces.Layout;
import Solid.interfaces.LayoutFactory;

public class LayoutWorkshop implements LayoutFactory {
    @Override
    public Layout produce(String type) {
        return switch (type){
            case "SimpleLayout" -> new SimpleLayout();
            case "XmlLayout" -> new XmlLayout();
            default -> throw new IllegalStateException(
                    "Not valid type of layout for" + type + " param");
        };
    }
}
