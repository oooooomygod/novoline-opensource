/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import deobf.IResourcePack;
import java.util.List;
import net.IResourceManagerReloadListener;
import net.aI_;

public interface IReloadableResourceManager
extends aI_ {
    public void a(IResourceManagerReloadListener var1);

    public void a(List<IResourcePack> var1);
}

