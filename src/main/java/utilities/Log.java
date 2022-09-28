package utilities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Date;

public class Log extends CommonOps{
    public Date date = new Date();

    private static final Logger Log = LogManager.getLogger(Log.class);

    public static void info(String message) {
        Log.info( new Date(new Date().getTime()) +" | "+ message);
    }

    public static void warn(String message) {
        Log.info("WARNING " +  new Date(new Date().getTime()) +" | "+ message);
    }

    public static void error(String message) {
        Log.info("ERROR " + new Date(new Date().getTime()) +" | "+ message);
    }

    public static void fatal(String message) {
        Log.info("FATAL " + new Date(new Date().getTime()) +" | "+ message);
    }

    public static void debug(String message) {
        Log.info("DEBUG " +  new Date(new Date().getTime()) +" | "+ message);
    }

}