/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.BufferedWriter;

/*
 * Renamed from net.abf
 */
public class abf_2 {
    public static void b(BufferedWriter bufferedWriter) {
        bufferedWriter.newLine();
    }

    public static void a(BufferedWriter bufferedWriter, String string) {
        bufferedWriter.write(string);
    }

    public static void c(BufferedWriter bufferedWriter) {
        bufferedWriter.flush();
    }

    public static void a(BufferedWriter bufferedWriter) {
        bufferedWriter.close();
    }
}

