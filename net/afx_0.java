/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.TimerUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.aL0;
import net.auq_0;
import net.ch_2;

/*
 * Renamed from net.aFx
 */
public class afx_0 {
    public static String a(File file) {
        TimerUtil.e();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String string = auq_0.c(bufferedReader);
            if (string != null) {
                aL0.a(aL0.a(stringBuilder, string), '\n');
            }
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
        return stringBuilder.toString();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static String a(InputStream inputStream) {
        TimerUtil.e();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String string = auq_0.c(bufferedReader);
            if (string != null) {
                aL0.a(aL0.a(stringBuilder, string), '\n');
            }
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
        return stringBuilder.toString();
    }
}

