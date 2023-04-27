/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.BufferedReader;
import java.util.stream.Stream;

/*
 * Renamed from net.auq
 */
public class auq_0 {
    public static void a(BufferedReader bufferedReader, int n) {
        bufferedReader.mark(n);
    }

    public static String c(BufferedReader bufferedReader) {
        return bufferedReader.readLine();
    }

    public static void a(BufferedReader bufferedReader) {
        bufferedReader.close();
    }

    public static void d(BufferedReader bufferedReader) {
        bufferedReader.reset();
    }

    public static Stream b(BufferedReader bufferedReader) {
        return bufferedReader.lines();
    }
}

