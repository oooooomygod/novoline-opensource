/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.FileOutputStream;

/*
 * Renamed from net.a2u
 */
public class a2u_0 {
    public static void a(FileOutputStream fileOutputStream, byte[] byArray) {
        fileOutputStream.write(byArray);
    }

    public static void b(FileOutputStream fileOutputStream) {
        fileOutputStream.flush();
    }

    public static void a(FileOutputStream fileOutputStream) {
        fileOutputStream.close();
    }
}

