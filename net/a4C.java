/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.LinkedList;
import java.util.Random;
import net.ChunkCoordIntPair;
import net.HF;
import net.NBTTagCompound;
import net.World;
import net.aKU;

public class a4C {
    public static int a(aKU aKU2) {
        return aKU2.c();
    }

    public static void b(aKU aKU2, ChunkCoordIntPair chunkCoordIntPair) {
        aKU2.a(chunkCoordIntPair);
    }

    public static boolean d(aKU aKU2) {
        return aKU2.f();
    }

    public static void a(aKU aKU2, World world, Random random, HF hF) {
        aKU2.a(world, random, hF);
    }

    public static int c(aKU aKU2) {
        return aKU2.d();
    }

    public static LinkedList b(aKU aKU2) {
        return aKU2.e();
    }

    public static NBTTagCompound a(aKU aKU2, int n, int n2) {
        return aKU2.a(n, n2);
    }

    public static boolean a(aKU aKU2, ChunkCoordIntPair chunkCoordIntPair) {
        return aKU2.b(chunkCoordIntPair);
    }

    public static void a(aKU aKU2, World world, NBTTagCompound nBTTagCompound) {
        aKU2.a(world, nBTTagCompound);
    }

    public static HF e(aKU aKU2) {
        return aKU2.a();
    }
}

