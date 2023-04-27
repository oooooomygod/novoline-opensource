/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.stats.Achievement;
import deobf.EntityPlayer;
import deobf.StatBase;

public class aQC {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static int a(StatFileWriter statFileWriter, StatBase statBase) {
        return statFileWriter.a(statBase);
    }

    public static void a(StatFileWriter statFileWriter, EntityPlayer entityPlayer, StatBase statBase, int n) {
        statFileWriter.a(entityPlayer, statBase, n);
    }

    public static boolean a(StatFileWriter statFileWriter, Achievement achievement) {
        return statFileWriter.c(achievement);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static int b(StatFileWriter statFileWriter, Achievement achievement) {
        return statFileWriter.a(achievement);
    }

    static {
        if (aQC.b() != null) {
            aQC.b(new ListInvoker[5]);
        }
    }

    public static boolean c(StatFileWriter statFileWriter, Achievement achievement) {
        return statFileWriter.b(achievement);
    }
}

