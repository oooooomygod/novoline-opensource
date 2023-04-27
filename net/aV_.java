/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.zip.Inflater;

public class aV_ {
    public static void a(Inflater inflater, byte[] byArray) {
        inflater.setInput(byArray);
    }

    public static int b(Inflater inflater, byte[] byArray) {
        return inflater.inflate(byArray);
    }

    public static void a(Inflater inflater) {
        inflater.reset();
    }
}

