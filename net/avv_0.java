/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IMetadataSerializer;
import deobf.IResourcePack;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import net.IMetadataSection;
import net.ResourceLocation;

/*
 * Renamed from net.avv
 */
public class avv_0 {
    public static String b(IResourcePack iResourcePack) {
        return iResourcePack.b();
    }

    public static InputStream a(IResourcePack iResourcePack, ResourceLocation resourceLocation) {
        return iResourcePack.b(resourceLocation);
    }

    public static IMetadataSection a(IResourcePack iResourcePack, IMetadataSerializer iMetadataSerializer, String string) {
        return iResourcePack.a(iMetadataSerializer, string);
    }

    public static boolean b(IResourcePack iResourcePack, ResourceLocation resourceLocation) {
        return iResourcePack.a(resourceLocation);
    }

    public static BufferedImage a(IResourcePack iResourcePack) {
        return iResourcePack.a();
    }
}

