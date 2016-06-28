package com.example.springtutorial.util;

import org.apache.log4j.Logger;

/**
 * @author Crunchify.com
 */

public class CustomLog4JLogger {

    private static Logger logger = null;

    public static Logger getLogger(Class name) {
        logger = Logger.getLogger(name);
        return logger;
    }

}
