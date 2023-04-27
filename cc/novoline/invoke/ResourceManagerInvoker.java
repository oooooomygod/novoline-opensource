/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.IReloadableResourceManager;
import java.util.List;
import net.IResourceManagerReloadListener;

public class ResourceManagerInvoker {
    public static void a(IReloadableResourceManager iReloadableResourceManager, List list) {
        iReloadableResourceManager.a(list);
    }

    public static void registerReloadListener(IReloadableResourceManager iReloadableResourceManager, IResourceManagerReloadListener iResourceManagerReloadListener) {
        iReloadableResourceManager.a(iResourceManagerReloadListener);
    }
}

