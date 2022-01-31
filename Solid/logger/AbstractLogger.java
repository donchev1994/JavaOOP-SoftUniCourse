package Solid.logger;

import Solid.enums.ReportLevel;
import Solid.interfaces.Appender;
import Solid.interfaces.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractLogger implements Logger {
    private List<Appender> appenders;


    public AbstractLogger(Appender... appenders) {
        this.appenders = new ArrayList<>(Arrays.asList(appenders));
    }

    @Override
    public void logInfo(String date, String message) {
        this.callAllAppender(date, ReportLevel.INFO,message);
    }


    @Override
    public void logWarning(String date, String message) {
        this.callAllAppender(date,ReportLevel.WARNING,message);
    }

    @Override
    public void logError(String date, String message) {
        this.callAllAppender(date,ReportLevel.ERROR,message);
    }

    @Override
    public void logCritical(String date, String message) {
        this.callAllAppender(date,ReportLevel.CRITICAL,message);
    }

    @Override
    public void logFatal(String date, String message) {
        this.callAllAppender(date,ReportLevel.FATAL,message);
    }

    @Override
    public void addAppender(Appender appender) {
        this.appenders.add(appender);
    }

    private void callAllAppender(String date,ReportLevel reportLevel ,String message) {
        for (Appender appender : appenders) {
            appender.append(date, reportLevel, message);
        }
    }
}
