/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.SettableFuture
 *  org.apache.commons.io.comparator.LastModifiedFileComparator
 *  org.apache.commons.io.filefilter.TrueFileFilter
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.resources;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

import deobf.IMetadataSerializer;
import deobf.IResourcePack;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;
import net.IProgressUpdate;
import net.RZ;
import net.a7c_0;
import net.a7r_0;
import net.aL0;
import net.aL6;
import net.aR_;
import net.aWM;
import net.aaw_1;
import net.ad6_0;
import net.ResourcePackRepositoryEntry;
import net.akg_2;
import net.alj_0;
import net.aqo_2;
import net.asg_0;
import net.au2_0;
import net.aui_0;
import net.dn_0;
import net.dz_0;
import net.iw_2;
import net.my_0;
import net.p1_0;
import net.zq_2;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.Logger;

public class ResourcePackRepository {
    private static FileFilter k;
    private ReentrantLock j = new ReentrantLock();
    private static Logger i;
    private File g;
    private IResourcePack a;
    private File h;
    public IResourcePack b;
    public IMetadataSerializer c;
    private List<ResourcePackRepositoryEntry> d = my_0.c();
    private ListenableFuture<Object> e;
    private List<ResourcePackRepositoryEntry> f = my_0.c();

    public ListenableFuture<Object> a(String string, String string2) {
        String string3 = StringInvoker.k(string2, au2_0.m) ? string2 : au2_0.i;
        File file = new File(this.h, string3);
        akg_2.a(this.j);
        try {
            Object object;
            this.d();
            if (zq_2.m(file) && StringInvoker.c(string2) == 40) {
                block8: {
                    object = aR_.a(aL6.c(), aWM.a(file)).toString();
                    if (!((String)object).equals(string2)) break block8;
                    ListenableFuture<Object> listenableFuture = this.a(file);
                    return listenableFuture;
                }
                try {
                    LoggerInvoker.warn(i, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), au2_0.b), file), au2_0.h), string2), au2_0.j), (String)object), au2_0.f).toString());
                    iw_2.a(file);
                }
                catch (IOException iOException) {
                    LoggerInvoker.b(i, aL0.a(aL0.a(aL0.a(new StringBuilder(), au2_0.a), file), au2_0.k).toString(), iOException);
                    iw_2.a(file);
                }
            }
            this.b();
            object = new RZ();
            Map map = MCInvoker.d();
            Minecraft minecraft = MCInvoker.f();
            aqo_2.a((Future)MCInvoker.a(minecraft, () -> ResourcePackRepository.lambda$downloadResourcePack$1(minecraft, (RZ)object)));
            SettableFuture settableFuture = aaw_1.a();
            this.e = p1_0.a(file, string, map, 0x3200000, (IProgressUpdate)object, MCInvoker.R(minecraft));
            aqo_2.a(this.e, new alj_0(this, file, settableFuture));
            ListenableFuture<Object> listenableFuture = this.e;
            return listenableFuture;
        }
        finally {
            akg_2.b(this.j);
        }
    }

    public ListenableFuture<Object> a(File file) {
        this.a = new aui_0(file);
        return MCInvoker.o(MCInvoker.f());
    }

    private List<File> e() {
        return zq_2.r(this.g) ? a7r_0.a(zq_2.a(this.g, k)) : asg_0.e();
    }

    private void h() {
        if (zq_2.m(this.g)) {
            if (!(zq_2.r(this.g) || zq_2.f(this.g) && zq_2.a(this.g))) {
                LoggerInvoker.warn(i, aL0.a(aL0.a(new StringBuilder(), au2_0.g), this.g).toString());
            }
        } else if (!zq_2.a(this.g)) {
            LoggerInvoker.warn(i, aL0.a(aL0.a(new StringBuilder(), au2_0.d), this.g).toString());
        }
    }

    public IResourcePack f() {
        return this.a;
    }

    private void b() {
        ArrayList arrayList = my_0.a(iw_2.a(this.h, TrueFileFilter.TRUE, null));
        ListInvoker.sort(arrayList, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        int n = 0;
        Iterator iterator = ListInvoker.iterator(arrayList);
        while (dz_0.c(iterator)) {
            File cfr_ignored_0 = (File)dz_0.b(iterator);
            ++n;
        }
    }

    public ResourcePackRepository(File file, File file2, IResourcePack iResourcePack, IMetadataSerializer iMetadataSerializer, GameSettings gameSettings) {
        this.g = file;
        this.h = file2;
        this.b = iResourcePack;
        this.c = iMetadataSerializer;
        this.h();
        this.c();
        Iterator iterator = ListInvoker.iterator(gameSettings.bg);
        block0: while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            Iterator iterator2 = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator2)) {
                ResourcePackRepositoryEntry resourcePackRepositoryEntry2 = (ResourcePackRepositoryEntry)dz_0.b(iterator2);
                if (!ad6_0.e(resourcePackRepositoryEntry2).equals(string)) continue;
                if (ad6_0.c(resourcePackRepositoryEntry2) == 1 || ListInvoker.contains(gameSettings.bY, ad6_0.e(resourcePackRepositoryEntry2))) {
                    ListInvoker.add(this.f, resourcePackRepositoryEntry2);
                    continue block0;
                }
                dz_0.a(iterator);
                LoggerInvoker.b(i, au2_0.n, new Object[]{ad6_0.e(resourcePackRepositoryEntry2)});
            }
        }
    }

    public List<ResourcePackRepositoryEntry> a() {
        return a7c_0.a(this.d);
    }

    static {
        i = LogManagerInvoker.c();
        k = ResourcePackRepository::lambda$static$0;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void a(List<ResourcePackRepositoryEntry> list) {
        ListInvoker.clear(this.f);
        ListInvoker.addAll(this.f, list);
    }

    public void c() {
        Object object;
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(this.e());
        while (dz_0.c(iterator)) {
            object = (File)dz_0.b(iterator);
            ResourcePackRepositoryEntry resourcePackRepositoryEntry2 = new ResourcePackRepositoryEntry(this, (File)object, null);
            if (!ListInvoker.contains(this.d, resourcePackRepositoryEntry2)) {
                try {
                    ad6_0.b(resourcePackRepositoryEntry2);
                    ListInvoker.add(arrayList, resourcePackRepositoryEntry2);
                }
                catch (Exception exception) {
                    ListInvoker.remove((List)arrayList, resourcePackRepositoryEntry2);
                }
                continue;
            }
            int n = ListInvoker.indexOf(this.d, resourcePackRepositoryEntry2);
            if (n <= -1 || n >= ListInvoker.size(this.d)) continue;
            ListInvoker.add(arrayList, ListInvoker.get(this.d, n));
        }
        ListInvoker.removeAll(this.d, arrayList);
        iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            object = (ResourcePackRepositoryEntry)dz_0.b(iterator);
            ad6_0.f((ResourcePackRepositoryEntry)object);
        }
        this.d = arrayList;
    }

    public List<ResourcePackRepositoryEntry> g() {
        return a7c_0.a(this.f);
    }

    public File i() {
        return this.g;
    }

    private static void lambda$downloadResourcePack$1(Minecraft minecraft, RZ rZ) {
        MCInvoker.displayGuiScreen(minecraft, rZ);
    }

    private static boolean lambda$static$0(File file) {
        return zq_2.d(file) && StringInvoker.c(zq_2.q(file), au2_0.c) || zq_2.r(file) && zq_2.d(new File(file, au2_0.l));
    }

    public void d() {
        akg_2.a(this.j);
        try {
            if (this.e != null) {
                dn_0.a(this.e, true);
            }
            this.e = null;
            if (this.a != null) {
                this.a = null;
                MCInvoker.o(MCInvoker.f());
            }
            return;
        }
        finally {
            akg_2.b(this.j);
        }
    }
}

