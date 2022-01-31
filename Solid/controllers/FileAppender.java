package Solid.controllers;

import Solid.enums.ReportLevel;
import Solid.interfaces.Appender;
import Solid.interfaces.File;
import Solid.interfaces.Layout;

public class FileAppender extends AbstractAppender {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        String formatted = this.getLayout().format(date, reportLevel, message);
        this.file.write(formatted);
    }
}
