/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 */
package net;

import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;

/*
 * Renamed from net.Xx
 */
public class xx_0 {
    private static String b = "eFSFfb";

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    static {
        if (xx_0.b() == null) {
            xx_0.b("eFSFfb");
        }
    }

    public static void a(ViaProviders viaProviders, Class clazz, Provider provider) {
        viaProviders.use(clazz, provider);
    }
}

