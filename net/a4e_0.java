/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.Writer;

/*
 * Renamed from net.a4e
 */
public class a4e_0 {
    public static void a(Writer writer) {
        writer.close();
    }

    public static void a(Writer writer, String string) {
        writer.write(string);
    }

    public static Writer a(Writer writer, CharSequence charSequence) {
        return writer.append(charSequence);
    }
}

