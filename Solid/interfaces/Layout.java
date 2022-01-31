package Solid.interfaces;

import Solid.enums.ReportLevel;

public interface Layout {
    String format(String date, ReportLevel reportLevel, String message);
}
