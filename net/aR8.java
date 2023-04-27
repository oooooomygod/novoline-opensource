/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import net.NBTTagCompound;
import net.N_;
import net.gy_0;

public class aR8 {
    public static void a(NBTTagCompound nBTTagCompound, OutputStream outputStream) {
        N_.a(nBTTagCompound, outputStream);
    }

    public static void a(NBTTagCompound nBTTagCompound, DataOutput dataOutput) {
        N_.a(nBTTagCompound, dataOutput);
    }

    public static NBTTagCompound a(DataInput dataInput, gy_0 gy_02) {
        return N_.a(dataInput, gy_02);
    }

    public static NBTTagCompound a(InputStream inputStream) {
        return N_.a(inputStream);
    }

    public static void a(NBTTagCompound nBTTagCompound, File file) {
        N_.b(nBTTagCompound, file);
    }

    public static NBTTagCompound a(DataInputStream dataInputStream) {
        return N_.a(dataInputStream);
    }

    public static NBTTagCompound a(File file) {
        return N_.a(file);
    }
}

