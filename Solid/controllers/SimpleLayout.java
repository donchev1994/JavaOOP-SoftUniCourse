package Solid.controllers;

import Solid.enums.ReportLevel;
import Solid.interfaces.Layout;

public class SimpleLayout implements Layout {


    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s",
                date, reportLevel, message);
    }
}
