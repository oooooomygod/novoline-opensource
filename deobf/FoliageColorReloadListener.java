/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import java.io.IOException;
import net.IResourceManagerReloadListener;
import net.ResourceLocation;
import net.aI_;
import net.aiv_2;
import net.aqo_1;
import net.zm_1;

public class FoliageColorReloadListener
implements IResourceManagerReloadListener {
    private static ResourceLocation a = new ResourceLocation(aqo_1.a);

    @Override
    public void b(aI_ aI_2) {
        try {
            zm_1.a(aiv_2.a(aI_2, a));
        }
        catch (IOException iOException) {}
    }
}

