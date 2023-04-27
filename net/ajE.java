/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.ViaBackwardsPlatform
 */
package net;

import com.viaversion.viabackwards.api.ViaBackwardsPlatform;
import java.io.File;
import java.util.logging.Logger;
import net.aSO;
import net.fo_0;

public class ajE
implements ViaBackwardsPlatform {
    private File a;

    public ajE(File file) {
        this.a = new File(file, aSO.a);
        this.init(this.a);
    }

    public File getDataFolder() {
        return new File(this.a, aSO.b);
    }

    public void disable() {
    }

    public boolean isOutdated() {
        return false;
    }

    public Logger getLogger() {
        return fo_0.d(fo_0.a());
    }
}

