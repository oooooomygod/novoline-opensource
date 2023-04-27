/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ChatComponentStyle;
import deobf.IChatComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aoU
 */
public class aou_1
extends ChatComponentStyle {
    private static boolean c;

    public static void b(boolean bl) {
        c = bl;
    }

    @Override
    public IChatComponent b() {
        return null;
    }

    public static boolean c() {
        aou_1.b();
        return true;
    }

    static {
        if (!aou_1.b()) {
            aou_1.b(true);
        }
    }

    public static boolean b() {
        return c;
    }

    @Override
    public String c() {
        return null;
    }
}

