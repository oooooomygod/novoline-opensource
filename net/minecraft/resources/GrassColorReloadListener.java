/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.resources;

import java.io.IOException;
import net.IResourceManagerReloadListener;
import net.ResourceLocation;
import net.aI_;
import net.aiv_2;
import net.q8_0;
import net.zl_1;

public class GrassColorReloadListener
implements IResourceManagerReloadListener {
    private static ResourceLocation a = new ResourceLocation(q8_0.a);

    @Override
    public void b(aI_ aI_2) {
        try {
            zl_1.a(aiv_2.a(aI_2, a));
        }
        catch (IOException iOException) {}
    }
}

