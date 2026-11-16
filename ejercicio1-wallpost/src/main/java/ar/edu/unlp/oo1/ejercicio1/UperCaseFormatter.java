package ar.edu.unlp.oo1.ejercicio1;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class UperCaseFormatter extends Formatter {


    @Override
    public String format(LogRecord record) {
        String message = record.getMessage();
        return message.toUpperCase();
    }
}
