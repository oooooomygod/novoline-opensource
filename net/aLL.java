/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.CharArrayWriter;

public class aLL {
    public static int b(CharArrayWriter charArrayWriter) {
        return charArrayWriter.size();
    }

    public static char[] a(CharArrayWriter charArrayWriter) {
        return charArrayWriter.toCharArray();
    }

    public static void a(CharArrayWriter charArrayWriter, String string) {
        charArrayWriter.write(string);
    }
}

