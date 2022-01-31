package Solid.interfaces;

import Solid.enums.ReportLevel;

public interface Appender {
   void append(String date, ReportLevel reportLevel, String message);
}
