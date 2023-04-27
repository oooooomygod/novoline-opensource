/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aLq
 */
public class alq_0 {
    private static String[] b;

    public static void a(QA qA, String string) {
        qA.b(string);
    }

    static {
        if (alq_0.b() == null) {
            alq_0.b(new String[5]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    public static void a(QA qA, Minecraft minecraft, int n, int n2) {
        qA.a(minecraft, n, n2);
    }
}

