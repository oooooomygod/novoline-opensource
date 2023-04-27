/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import com.google.gson.JsonObject;
import deobf.IMetadataSerializer;
import net.DF;
import net.IMetadataSection;

public class YM {
    private static boolean b;

    public static boolean c() {
        YM.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (YM.c()) {
            YM.b(true);
        }
    }

    public static boolean b() {
        return b;
    }

    public static void a(IMetadataSerializer iMetadataSerializer, DF dF, Class clazz) {
        iMetadataSerializer.a(dF, clazz);
    }

    public static IMetadataSection a(IMetadataSerializer iMetadataSerializer, String string, JsonObject jsonObject) {
        return iMetadataSerializer.a(string, jsonObject);
    }
}

