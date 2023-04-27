/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.resources;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.base.Joiner;
import deobf.IMetadataSerializer;
import deobf.IReloadableResourceManager;
import deobf.IResourcePack;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.DZ;
import net.IResourceManagerReloadListener;
import net.ResourceLocation;
import net.YX;
import net.a2U;
import net.aI_;
import net.aL0;
import net.aS0;
import net.aSB;
import net.abh_2;
import net.amy_2;
import net.aoz_0;
import net.axe_2;
import net.axw_1;
import net.dz_0;
import net.my_0;
import net.ui_1;
import org.apache.logging.log4j.Logger;

public class SimpleReloadableResourceManager
implements IReloadableResourceManager {
    private Map<String, YX> e = MapsInvoker.a();
    private Set<String> c;
    private List<IResourceManagerReloadListener> d = my_0.c();
    private static Joiner b;
    private static Logger f;
    private IMetadataSerializer a;

    static {
        f = LogManagerInvoker.c();
        b = aSB.a(amy_2.a);
    }

    @Override
    public Set<String> a() {
        return this.c;
    }

    @Override
    public void a(IResourceManagerReloadListener iResourceManagerReloadListener) {
        ListInvoker.add(this.d, iResourceManagerReloadListener);
        aoz_0.a(iResourceManagerReloadListener, this);
    }

    @Override
    public abh_2 b(ResourceLocation resourceLocation) throws IOException {
        aI_ aI_2 = (aI_)MapInvoker.c(this.e, axw_1.a(resourceLocation));
        return aI_2.b(resourceLocation);
    }

    private void b() {
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            IResourceManagerReloadListener iResourceManagerReloadListener = (IResourceManagerReloadListener)dz_0.b(iterator);
            aoz_0.a(iResourceManagerReloadListener, this);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public SimpleReloadableResourceManager(IMetadataSerializer iMetadataSerializer) {
        this.c = axe_2.b();
        this.a = iMetadataSerializer;
    }

    @Override
    public List<abh_2> a(ResourceLocation resourceLocation) throws IOException {
        aI_ aI_2 = (aI_)MapInvoker.c(this.e, axw_1.a(resourceLocation));
        return aI_2.a(resourceLocation);
    }

    public void a(IResourcePack iResourcePack) {
        Iterator iterator = aS0.f(iResourcePack.c());
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            aS0.b(this.c, string);
            YX yX = (YX)MapInvoker.c(this.e, string);
            yX = new YX(this.a);
            MapInvoker.c(this.e, string, yX);
            a2U.a(yX, iResourcePack);
        }
    }

    @Override
    public void a(List<IResourcePack> list) {
        this.a();
        LoggerInvoker.info(f, aL0.a(aL0.a(new StringBuilder(), amy_2.b), aSB.a(b, DZ.a(list, new ui_1(this)))).toString());
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            IResourcePack iResourcePack = (IResourcePack)dz_0.b(iterator);
            this.a(iResourcePack);
        }
        this.b();
    }

    private void a() {
        MapInvoker.d(this.e);
        aS0.e(this.c);
    }
}

