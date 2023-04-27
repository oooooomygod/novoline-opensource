/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.FileNotFoundException;

public class Uu {
    public static String a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException.getMessage();
    }

    public static void b(FileNotFoundException fileNotFoundException) {
        fileNotFoundException.printStackTrace();
    }
}

