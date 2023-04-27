/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 */
package cc.novoline.invoke;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

public class LoggerInvoker {
    private static String[] b;

    public static void b(Logger logger, Marker marker, String string) {
        logger.warn(marker, string);
    }

    public static void a(Logger logger, Object object) {
        logger.error(object);
    }

    public static void d(Logger logger, String string, Object[] objectArray) {
        logger.trace(string, objectArray);
    }

    public static void c(Logger logger, String string, Object[] objectArray) {
        logger.error(string, objectArray);
    }

    public static void e(Logger logger, String string, Throwable throwable) {
        logger.trace(string, throwable);
    }

    public static void a(Logger logger, Marker marker, String string) {
        logger.info(marker, string);
    }

    public static void b(Logger logger, String string, Object[] objectArray) {
        logger.warn(string, objectArray);
    }

    public static void b(Logger logger, Marker marker, String string, Object[] objectArray) {
        logger.error(marker, string, objectArray);
    }

    public static void d(Logger logger, Marker marker, String string) {
        logger.debug(marker, string);
    }

    public static void a(Logger logger, Marker marker, String string, Object[] objectArray) {
        logger.warn(marker, string, objectArray);
    }

    public static void a(Logger logger, String string, Throwable throwable) {
        logger.error(string, throwable);
    }

    public static void info(Logger logger, String string) {
        logger.info(string);
    }

    public static void f(Logger logger, String string) {
        logger.error(string);
    }

    public static void warn(Logger logger, String string) {
        logger.warn(string);
    }

    public static void f(Logger logger, String string, Throwable throwable) {
        logger.info(string, throwable);
    }

    public static void c(Logger logger, Marker marker, String string) {
        logger.error(marker, string);
    }

    public static void a(Logger logger, String string) {
        logger.trace(string);
    }

    public static void b(Logger logger, String string) {
        logger.debug(string);
    }

    public static void b(Logger logger, Object object) {
        logger.warn(object);
    }

    public static boolean a(Logger logger) {
        return logger.isDebugEnabled();
    }

    public static String[] b() {
        return b;
    }

    public static void c(Logger logger, Object object) {
        logger.fatal(object);
    }

    public static void c(Logger logger, String string) {
        logger.fatal(string);
    }

    public static void c(Logger logger, String string, Throwable throwable) {
        logger.debug(string, throwable);
    }

    public static void e(Logger logger, String string, Object[] objectArray) {
        logger.info(string, objectArray);
    }

    public static void a(Logger logger, Marker marker, String string, Throwable throwable) {
        logger.error(marker, string, throwable);
    }

    public static void b(Logger logger, String string, Throwable throwable) {
        logger.warn(string, throwable);
    }

    public static void d(Logger logger, Marker marker, String string, Object[] objectArray) {
        logger.debug(marker, string, objectArray);
    }

    public static void a(Logger logger, String string, Object[] objectArray) {
        logger.debug(string, objectArray);
    }

    public static void c(Logger logger, Marker marker, String string, Object[] objectArray) {
        logger.info(marker, string, objectArray);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void d(Logger logger, String string, Throwable throwable) {
        logger.fatal(string, throwable);
    }

    static {
        if (LoggerInvoker.b() == null) {
            LoggerInvoker.b(new String[5]);
        }
    }
}

