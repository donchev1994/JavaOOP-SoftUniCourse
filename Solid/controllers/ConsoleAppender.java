package Solid.controllers;

import Solid.enums.ReportLevel;
import Solid.interfaces.Appender;
import Solid.interfaces.Layout;


public class ConsoleAppender extends AbstractAppender  {


    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        System.out.println(this.getLayout().format(date,reportLevel,message));
    }
}
