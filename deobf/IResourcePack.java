/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import deobf.IMetadataSerializer;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import net.IMetadataSection;
import net.ResourceLocation;

public interface IResourcePack {
    public boolean a(ResourceLocation var1);

    public InputStream b(ResourceLocation var1) throws IOException;

    public String b();

    public BufferedImage a() throws IOException;

    public <T extends IMetadataSection> T a(IMetadataSerializer var1, String var2) throws IOException;

    public Set<String> c();
}

