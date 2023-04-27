/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.DataOutputStream;

public class HC {
    public static void a(DataOutputStream dataOutputStream) {
        dataOutputStream.close();
    }

    public static void b(DataOutputStream dataOutputStream) {
        dataOutputStream.flush();
    }

    public static void a(DataOutputStream dataOutputStream, long l4) {
        dataOutputStream.writeLong(l4);
    }

    public static void a(DataOutputStream dataOutputStream, String string) {
        dataOutputStream.writeBytes(string);
    }
}

