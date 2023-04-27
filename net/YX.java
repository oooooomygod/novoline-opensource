/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.IMetadataSerializer;
import deobf.IResourcePack;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.ResourceLocation;
import net.a2r_0;
import net.a8Y;
import net.aI_;
import net.aL0;
import net.abh_2;
import net.avv_0;
import net.axw_1;
import net.dz_0;
import net.my_0;
import net.y1_0;
import org.apache.logging.log4j.Logger;

public class YX
implements aI_ {
    private IMetadataSerializer a;
    protected List<IResourcePack> c = my_0.c();
    private static Logger b = LogManagerInvoker.c();

    protected InputStream a(ResourceLocation resourceLocation, IResourcePack iResourcePack) throws IOException {
        InputStream inputStream = avv_0.a(iResourcePack, resourceLocation);
        return LoggerInvoker.a(b) ? new a8Y(inputStream, resourceLocation, avv_0.b(iResourcePack)) : inputStream;
    }

    @Override
    public List<abh_2> a(ResourceLocation resourceLocation) throws IOException {
        ArrayList arrayList = my_0.c();
        ResourceLocation resourceLocation2 = YX.a(resourceLocation);
        Iterator iterator = ListInvoker.iterator(this.c);
        while (dz_0.c(iterator)) {
            IResourcePack iResourcePack = (IResourcePack)dz_0.b(iterator);
            if (!avv_0.b(iResourcePack, resourceLocation)) continue;
            InputStream inputStream = avv_0.b(iResourcePack, resourceLocation2) ? this.a(resourceLocation2, iResourcePack) : null;
            ListInvoker.add(arrayList, new y1_0(avv_0.b(iResourcePack), resourceLocation, this.a(resourceLocation, iResourcePack), inputStream, this.a));
        }
        if (ListInvoker.isEmpty(arrayList)) {
            throw new FileNotFoundException(resourceLocation.toString());
        }
        return arrayList;
    }

    public void a(IResourcePack iResourcePack) {
        ListInvoker.add(this.c, iResourcePack);
    }

    static ResourceLocation a(ResourceLocation resourceLocation) {
        return new ResourceLocation(axw_1.a(resourceLocation), aL0.a(aL0.a(new StringBuilder(), axw_1.b(resourceLocation)), a2r_0.a).toString());
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    static Logger a() {
        return b;
    }

    @Override
    public abh_2 b(ResourceLocation resourceLocation) throws IOException {
        IResourcePack iResourcePack = null;
        ResourceLocation resourceLocation2 = YX.a(resourceLocation);
        int n = ListInvoker.size(this.c) - 1;
        while (true) {
            IResourcePack iResourcePack2;
            if (avv_0.b(iResourcePack2 = (IResourcePack)ListInvoker.get(this.c, n), resourceLocation2)) {
                iResourcePack = iResourcePack2;
            }
            if (avv_0.b(iResourcePack2, resourceLocation)) {
                InputStream inputStream = null;
                inputStream = this.a(resourceLocation2, iResourcePack);
                return new y1_0(avv_0.b(iResourcePack2), resourceLocation, this.a(resourceLocation, iResourcePack2), inputStream, this.a);
            }
            --n;
        }
    }

    public YX(IMetadataSerializer iMetadataSerializer) {
        this.a = iMetadataSerializer;
    }

    @Override
    public Set<String> a() {
        return null;
    }
}

