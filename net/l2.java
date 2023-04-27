/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.FileWriter;
import java.io.Writer;

public class l2 {
    public static void a(FileWriter fileWriter) {
        fileWriter.close();
    }

    public static void a(FileWriter fileWriter, String string) {
        fileWriter.write(string);
    }

    public static Writer a(FileWriter fileWriter, CharSequence charSequence) {
        return fileWriter.append(charSequence);
    }
}

