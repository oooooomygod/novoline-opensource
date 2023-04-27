/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.DataOutput;

public class K4 {
    public static void a(DataOutput dataOutput, byte[] byArray) {
        dataOutput.write(byArray);
    }

    public static void a(DataOutput dataOutput, int n) {
        dataOutput.writeByte(n);
    }

    public static void a(DataOutput dataOutput, long l4) {
        dataOutput.writeLong(l4);
    }

    public static void a(DataOutput dataOutput, float f) {
        dataOutput.writeFloat(f);
    }

    public static void c(DataOutput dataOutput, int n) {
        dataOutput.writeShort(n);
    }

    public static void a(DataOutput dataOutput, String string) {
        dataOutput.writeUTF(string);
    }

    public static void a(DataOutput dataOutput, double d) {
        dataOutput.writeDouble(d);
    }

    public static void b(DataOutput dataOutput, int n) {
        dataOutput.writeInt(n);
    }
}

