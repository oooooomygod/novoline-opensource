/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 */
package net;

import com.viaversion.viaversion.api.data.MappingDataLoader;

/*
 * Renamed from net.aqF
 */
public class aqf_1 {
    private static int b;

    public static void b(int n) {
        b = n;
    }

    static {
        if (aqf_1.a() != 0) {
            aqf_1.b(5);
        }
    }

    public static void c() {
        MappingDataLoader.enableMappingsCache();
    }

    public static int b() {
        return b;
    }

    public static int a() {
        aqf_1.b();
        return 43;
    }
}

