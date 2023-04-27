/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import net.HC;
import net.K4;
import net.NBTTagCompound;
import net.a5N;
import net.aDE;
import net.aL0;
import net.amf_1;
import net.atG;
import net.ayk_0;
import net.gy_0;
import net.zq_2;

public class N_ {
    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static void a(NBTBase nBTBase, DataOutput dataOutput) throws IOException {
        K4.a(dataOutput, a5N.b(nBTBase));
        if (a5N.b(nBTBase) != 0) {
            K4.a(dataOutput, amf_1.d);
            nBTBase.a(dataOutput);
        }
    }

    public static NBTTagCompound a(DataInput dataInput, gy_0 gy_02) throws IOException {
        NBTBase nBTBase = N_.a(dataInput, 0, gy_02);
        if (nBTBase instanceof NBTTagCompound) {
            return (NBTTagCompound)nBTBase;
        }
        throw new IOException(amf_1.c);
    }

    public static NBTTagCompound a(File file) throws IOException {
        if (!zq_2.m(file)) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            NBTTagCompound nBTTagCompound = N_.a(dataInputStream, gy_0.c);
            return nBTTagCompound;
        }
        finally {
            ayk_0.b(dataInputStream);
        }
    }

    public static NBTTagCompound a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));
        try {
            NBTTagCompound nBTTagCompound = N_.a(dataInputStream, gy_0.c);
            return nBTTagCompound;
        }
        finally {
            ayk_0.b(dataInputStream);
        }
    }

    public static void b(NBTTagCompound nBTTagCompound, File file) throws IOException {
        File file2 = new File(aL0.a(aL0.a(new StringBuilder(), zq_2.j(file)), amf_1.a).toString());
        if (zq_2.m(file2)) {
            zq_2.f(file2);
        }
        N_.a(nBTTagCompound, file2);
        if (zq_2.m(file)) {
            zq_2.f(file);
        }
        if (zq_2.m(file)) {
            throw new IOException(aL0.a(aL0.a(new StringBuilder(), amf_1.e), file).toString());
        }
        zq_2.a(file2, file);
    }

    public static NBTTagCompound a(DataInputStream dataInputStream) throws IOException {
        return N_.a(dataInputStream, gy_0.c);
    }

    private static NBTBase a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        atG.g(dataInput);
        return new aDE();
    }

    public static void a(NBTTagCompound nBTTagCompound, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));
        try {
            N_.a(nBTTagCompound, (DataOutput)dataOutputStream);
            return;
        }
        finally {
            HC.a(dataOutputStream);
        }
    }

    public static void a(NBTTagCompound nBTTagCompound, DataOutput dataOutput) throws IOException {
        N_.a((NBTBase)nBTTagCompound, dataOutput);
    }

    public static void a(NBTTagCompound nBTTagCompound, File file) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            N_.a(nBTTagCompound, (DataOutput)dataOutputStream);
            return;
        }
        finally {
            HC.a(dataOutputStream);
        }
    }
}

