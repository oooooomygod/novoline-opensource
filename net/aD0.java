/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.logging.Level;
import java.util.logging.LogRecord;

public class aD0 {
    public static Level b(LogRecord logRecord) {
        return logRecord.getLevel();
    }

    public static String a(LogRecord logRecord) {
        return logRecord.getMessage();
    }
}

