/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net;

import com.google.common.base.Function;
import deobf.IResourcePack;
import deobf.SimpleReloadableResourceManager;
import net.avv_0;

/*
 * Renamed from net.uI
 */
class ui_1
implements Function<IResourcePack, String> {
    SimpleReloadableResourceManager a;

    ui_1(SimpleReloadableResourceManager simpleReloadableResourceManager) {
        this.a = simpleReloadableResourceManager;
    }

    public String a(IResourcePack iResourcePack) {
        return avv_0.b(iResourcePack);
    }
}

