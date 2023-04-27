/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.util.UUIDTypeAdapter
 */
package net;

import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class WZ {
    private static String[] b;

    static {
        if (WZ.b() == null) {
            WZ.b(new String[4]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static UUID a(String string) {
        return UUIDTypeAdapter.fromString((String)string);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

