package ar.edu.unlp.oo1.ejercicio1;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        String message = record.getMessage();
        String level = record.getLevel().getName().toLowerCase();
        return "message: " + message.toLowerCase() + ", " + "Level: " + level;
    }
}
