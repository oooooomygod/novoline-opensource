/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.DataInput;

public class atG {
    public static double a(DataInput dataInput) {
        return dataInput.readDouble();
    }

    public static byte g(DataInput dataInput) {
        return dataInput.readByte();
    }

    public static String b(DataInput dataInput) {
        return dataInput.readUTF();
    }

    public static int e(DataInput dataInput) {
        return dataInput.readInt();
    }

    public static float d(DataInput dataInput) {
        return dataInput.readFloat();
    }

    public static long c(DataInput dataInput) {
        return dataInput.readLong();
    }

    public static short f(DataInput dataInput) {
        return dataInput.readShort();
    }

    public static void a(DataInput dataInput, byte[] byArray) {
        dataInput.readFully(byArray);
    }
}

