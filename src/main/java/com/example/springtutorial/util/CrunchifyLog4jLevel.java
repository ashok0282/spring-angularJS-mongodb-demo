package com.example.springtutorial.util;

import org.apache.log4j.Level;

@SuppressWarnings("serial")
public class CrunchifyLog4jLevel extends Level {

    /**
     * Value of CrunchifyLog4jLevel level. This value is lesser than DEBUG_INT and higher
     * than TRACE_INT}
     */
    public static final int CRUNCHIFY_INT = DEBUG_INT - 10;

    /**
     * Level representing my log level
     */
    public static final Level CRUNCHIFY = new CrunchifyLog4jLevel(CRUNCHIFY_INT, "CRUNCHIFY", 10);

    /**
     * Constructor
     */
    protected CrunchifyLog4jLevel(int arg0, String arg1, int arg2) {
        super(arg0, arg1, arg2);

    }

    /**
     * Checks whether logArgument is "CRUNCHIFY" level. If yes then returns
     * CRUNCHIFY}, else calls CrunchifyLog4jLevel#toLevel(String, Level) passing
     * it Level#DEBUG as the defaultLevel.
     */
    public static Level toLevel(String logArgument) {
        if (logArgument != null && logArgument.toUpperCase().equals("CRUNCHIFY")) {
            return CRUNCHIFY;
        }
        return (Level) toLevel(logArgument);
    }

    /**
     * Checks whether val is CrunchifyLog4jLevel#CRUNCHIFY_INT. If yes then
     * returns CrunchifyLog4jLevel#CRUNCHIFY, else calls
     * CrunchifyLog4jLevel#toLevel(int, Level) passing it Level#DEBUG as the
     * defaultLevel
     */
    public static Level toLevel(int val) {
        if (val == CRUNCHIFY_INT) {
            return CRUNCHIFY;
        }
        return (Level) toLevel(val, Level.DEBUG);
    }

    /**
     * Checks whether val is CrunchifyLog4jLevel#CRUNCHIFY_INT. If yes
     * then returns CrunchifyLog4jLevel#CRUNCHIFY, else calls Level#toLevel(int, org.apache.log4j.Level)
     */
    public static Level toLevel(int val, Level defaultLevel) {
        if (val == CRUNCHIFY_INT) {
            return CRUNCHIFY;
        }
        return Level.toLevel(val, defaultLevel);
    }

    /**
     * Checks whether logArgument is "CRUNCHIFY" level. If yes then returns
     * CrunchifyLog4jLevel#CRUNCHIFY, else calls
     * Level#toLevel(java.lang.String, org.apache.log4j.Level)
     */
    public static Level toLevel(String logArgument, Level defaultLevel) {
        if (logArgument != null && logArgument.toUpperCase().equals("CRUNCHIFY")) {
            return CRUNCHIFY;
        }
        return Level.toLevel(logArgument, defaultLevel);
    }

}