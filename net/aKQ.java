/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ThreadLanServerPing;

public class aKQ {
    public static String b(String string) {
        return ThreadLanServerPing.a(string);
    }

    public static void a(ThreadLanServerPing threadLanServerPing) {
        threadLanServerPing.interrupt();
    }

    public static String a(String string) {
        return ThreadLanServerPing.b(string);
    }
}

