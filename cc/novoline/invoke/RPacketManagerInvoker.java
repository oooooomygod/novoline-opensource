/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.io.InputStream;
import net.DefaultResourcePack;
import net.ResourceLocation;

public class RPacketManagerInvoker {
    public static String a(DefaultResourcePack defaultResourcePack) {
        return defaultResourcePack.b();
    }

    public static InputStream getInputStream(DefaultResourcePack defaultResourcePack, ResourceLocation resourceLocation) {
        return defaultResourcePack.b(resourceLocation);
    }

    public static InputStream c(DefaultResourcePack defaultResourcePack, ResourceLocation resourceLocation) {
        return defaultResourcePack.c(resourceLocation);
    }

    public static boolean b(DefaultResourcePack defaultResourcePack, ResourceLocation resourceLocation) {
        return defaultResourcePack.a(resourceLocation);
    }
}

