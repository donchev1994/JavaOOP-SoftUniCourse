package Solid.controllers;

import Solid.interfaces.Appender;
import Solid.interfaces.Layout;

public abstract class AbstractAppender implements Appender {
    private Layout layout;

    public AbstractAppender(Layout layout) {
        this.layout = layout;
    }

    protected Layout getLayout() {
        return layout;
    }
}
